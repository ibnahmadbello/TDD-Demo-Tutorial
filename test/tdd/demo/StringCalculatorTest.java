/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.demo;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ibnahmad
 */
public class StringCalculatorTest {
    
//    @Test(expected = RuntimeException.class)
//    public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
//        StringCalculator.add("1,2,3");
//    }
    
    @Test
    public void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums(){
        Assert.assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
    }
    
    @Test
    public void when2NumbersAreUsedThenNoExceptionIsThrown(){
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }
    
    @Test(expected = RuntimeException.class)
    public void whenNonNumberIsUsedThenExceptionIsThrown(){
        StringCalculator.add("1,X");
    }
    
    @Test
    public void whenEmptyStringIsUsedThenReturnValueIsO(){
        Assert.assertEquals(0, StringCalculator.add(""));
    }
    
    @Test
    public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber(){
        Assert.assertEquals(3, StringCalculator.add("3"));
    }
    
    @Test
    public void whenTwoNumbersAreUsedThenReturnValueIsTheirSum(){
        Assert.assertEquals(3+6, StringCalculator.add("3,6"));
    }
    
    @Test
    public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSum(){
        Assert.assertEquals(3+6+15, StringCalculator.add("3,6n15"));
    }
    
    @Test
    public void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers(){
        Assert.assertEquals(3+6+15, StringCalculator.add("//;n3;6;15"));
    }
    
    @Test(expected = RuntimeException.class)
    public void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown(){
        StringCalculator.add("3,-6,15,18,46,33");
    }
    
    @Test
    public void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown(){
        RuntimeException exception = null;
        try {
            StringCalculator.add("3,-6,15,-18,46,33");
        } catch (RuntimeException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
        Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
    }
    
    @Test
    public void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum(){
        Assert.assertEquals(3+1000+6, StringCalculator.add("3,1000,1001,6,1234"));
    }
}
