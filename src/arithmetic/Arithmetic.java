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
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n = in.nextDouble();

        System.out.print("Enter second number: ");
        double m = in.nextDouble();

        System.out.print("Enter operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String opInput = in.next().toUpperCase();

        try {
            Operation operation = Operation.valueOf(opInput);
            ArithmeticBase r = new ArithmeticBase();
            double result = r.calculate(n, m, operation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation entered. Please use PLUS, MINUS, TIMES, or DIVIDE.");
        }
    }
}

