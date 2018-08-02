package javaapplication1;

import java.util.Scanner;
import javaapplication1.Calc;

public class CalcMenu {
    public static double doOperation(double number1,double number2,String symbol){
        Calc calculator=new Calc();    
        if(symbol.equals("+")==true){
                return calculator.addTwoNumbers(number1, number2);
            }
        if(symbol.equals("-")==true){
                return calculator.SubstractTwoNumbers(number1, number2);
            }
        if(symbol.equals("*")==true){
                return calculator.multiplyTwoNumbers(number1,number2);
        }
        if(symbol.equals("/")==true){
                return calculator.divideTwoNumbers(number1,number2);
        }    
            return -1;
        }
    public static void main(String[] args) {
        double n1, n2;
        String operation;
        Calc calculator=new Calc();

    }
}