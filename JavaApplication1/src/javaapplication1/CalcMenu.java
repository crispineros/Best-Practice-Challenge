package javaapplication1;

import java.util.Scanner;
import javaapplication1.Calc;


/**
   Refactor the next code applying clean code concepts.
   Optional: If you want, you can create separate classes in order to wide 
   the methods cohesion concept, to the SRP-SOLID principle at class level.
*/
public class CalcMenu {
    public static double doOperation(int number1,int number2,String symbol){
            if(symbol.equals("+")==true){
                return number1+number2;
            }
            
            return -1;
        }
    public static void main(String[] args) {
        double n1, n2;
        String operation;
        //Scanner scannerObject = new Scanner(System.in);
        Calc calculator=new Calc();
        
        
        /*System.out.println("Enter first number");
        n1 = scannerObject. nextDouble();

        System.out.println("Enter second number");
        n2 = scannerObject. nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        operation = op.next();

        switch (operation)  {
        case "+":
            System.out.println("Your answer is " + (n1 + n2));
            break;

        case "-":
            System.out.println("Your answer is " + (n1 - n2));
            break;

        case "/":
            System.out.println("Your answer is " + (n1 / n2));
            break;

        case "*":
            System.out.println("Your asnwer is " + (n1 * n2));
            break;

        default:
            System.out.println("Unsupported Operation");

        }*/
    }
}