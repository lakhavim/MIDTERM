/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;



/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author VIMAL_LAKHANI
 * 
 */
public class ArithmeticBase {
    public double calculate(double x, double y, Operation operation) {
        return OperationExecutor.apply(x, y, operation);
    }
}
