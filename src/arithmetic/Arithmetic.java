/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;


/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author VIMAL_LAKHANI
 * 
 */
public class Arithmetic {
    public static void main(String[] args) {
        double x = 10; // Example first number
        double y = 5;  // Example second number

        ArithmeticBase calculator = new ArithmeticBase();
        System.out.println("Results for all operations:");
        calculator.printAllResults(x, y);
    }
}
