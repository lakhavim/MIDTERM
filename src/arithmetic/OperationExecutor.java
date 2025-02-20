/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmetic;

/**
 *
 * @author vimal
 */
public class OperationExecutor {
    public static double apply(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y == 0) throw new ArithmeticException("Cannot divide by zero");
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
}