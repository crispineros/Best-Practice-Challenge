package javaapplication1;

import java.util.ArrayList;
import javaapplication1.Log;
/**
 *
 * @author cpineros
 */
public class Calc {
    Log log=new Log();
    public double addTwoNumbers(double number1,double number2){
        double number3=number1+number2;
        log.builtAndAddLogLine(number1, number2, number3,"+");
        return number3;
    } 

    public double SubstractTwoNumbers(double number1, double number2) {
        double number3=number1-number2;
        log.builtAndAddLogLine(number1, number2, number3,"-");
        return number3;
    }

    public double multiplyTwoNumbers(double number1, double number2) {
        double number3=number1*number2;
        log.builtAndAddLogLine(number1, number2, number3,"*");
        return number3;
    }

    public double divideTwoNumbers(double number1, double number2) {
        if(number2==0){
            return this.divideByZero();
        }
        double number3=number1/number2;
        log.builtAndAddLogLine(number1, number2, number3,"/");
        return number3;
        
    }

    public String printLog() {
        
        return log.getLogString();
    }

    private double divideByZero() {
       return 0;
    }
}
