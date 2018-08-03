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
        log.builtAndAddLogLine(number1, number2, number3,"+","valid");
        return number3;
    } 

    public double SubstractTwoNumbers(double number1, double number2) {
        double number3=number1-number2;
        log.builtAndAddLogLine(number1, number2, number3,"-","valid");
        return number3;
    }

    public double multiplyTwoNumbers(double number1, double number2) {
        double number3=number1*number2;
        log.builtAndAddLogLine(number1, number2, number3,"*","valid");
        return number3;
    }

    public double divideTwoNumbers(double number1, double number2) {
        if(number2==0){
            log.builtAndAddLogLine(number1, number2,this.divideByZero(),"/","not valid");
            return this.divideByZero();
        }
        double number3=number1/number2;
        log.builtAndAddLogLine(number1, number2, number3,"/","valid");
        return number3;
        
    }

    public String printLog() {
        System.out.println(log.getLogString());
        return log.getLogString();
    }

    private double divideByZero() {
       return 0;
    }
}
