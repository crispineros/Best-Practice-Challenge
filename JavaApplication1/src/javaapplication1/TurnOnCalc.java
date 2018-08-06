package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author cpineros
 */
public class TurnOnCalc {
    Calc calculator=new Calc();
    public void runMenu() {
        int op=-1;
        while(op!=0){
            this.printMenu();
            op=this.getOption();
            this.executeCommand(op);
            
        }
    }

    public void printMenu() {
        System.out.println("CALCULATOR OPTIONS");
        System.out.println("1. add two numbers.");
        System.out.println("2. substract two numbers.");
        System.out.println("3. multiply two numbers");
        System.out.println("4. divide two numbers");
        System.out.println("5. show log");
        System.out.println("0. Exit");
    }

    public int getOption() {
        Scanner input= new Scanner(System.in);
        if(input.hasNextInt()){
            int option=input.nextInt();
            return option;
        }
        return 6; 
    }

    public void executeCommand(int op) {
        if(op==1 || op==2 || op==3 || op==4){
            this.doOperation(op);
        }
        else if(op==5){
            calculator.printLog();
        }
        else{
            System.out.println("opcion invalida");
        }
        
    }

    public double getNumber() {
        double number=Double.POSITIVE_INFINITY;
        Scanner input= new Scanner(System.in);
        if(input.hasNextInt()){
            number=input.nextInt();
            return number;
        }
        return number ;
    }

    public void doOperation(int operation) {
            double number1=this.requestAndGetNumber(1);
            double number2=this.requestAndGetNumber(2);
            if(this.validateNumber(number1)==true && this.validateNumber(number2)==true){
                this.callCalc(number1,number2,operation);
            }
            else{
                System.out.println("Numeros digitados invalidos, intente de nuevo por favor:");
            }
    }

    public void printNumberRequest(int number) {
        System.out.println("Please digit number "+number+" :");
    }

    public double requestAndGetNumber(int numberOfNumber) {
        this.printNumberRequest(numberOfNumber);
        double number=this.getNumber();
        return number;
    }

    public void callCalc(double number1, double number2, int operation) {
        if(operation==1){
            System.out.println(calculator.addTwoNumbers(number1, number2));
        }
        if(operation==2){
            System.out.println(calculator.SubstractTwoNumbers(number1, number2));
        }
        if(operation==3){
            System.out.println(calculator.multiplyTwoNumbers(number1, number2));
        }
        if(operation==4){
            System.out.println(calculator.divideTwoNumbers(number1, number2));
        }
    }

    public boolean validateNumber(double number) {
        if(number!=Double.POSITIVE_INFINITY){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
