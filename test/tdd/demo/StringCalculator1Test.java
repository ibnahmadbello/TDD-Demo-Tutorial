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
public class StringCalculator1Test {
    
    @Test(expected = RuntimeException.class)
    public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator1.add("1,2,3");
    }
    @Test
    public void when2NumbersAreUsedThenNoExceptionIsThrown(){
        StringCalculator1.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public void whenNonNumberIsUsedThenExceptionIsThrown(){
        StringCalculator1.add("1,X");
    }
    
}
