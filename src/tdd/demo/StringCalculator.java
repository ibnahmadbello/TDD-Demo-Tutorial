/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.demo;

/**
 *
 * @author ibnahmad
 */
public class StringCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void add(String numbers){
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by commas (,) are allowed");
        } else {
            for (String number : numbersArray) {
                Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
            }
        }
    }
    
}
