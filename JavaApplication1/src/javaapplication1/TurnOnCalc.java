/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author cpineros
 */
class TurnOnCalc {
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
        int option=input.nextInt();
        return option;
    }

    public void executeCommand(int op) {
        if(op==1 || op==2 || op==3 || op==4){
            this.doOperation(op);
        }
        else if(op==5){
            calculator.printLog();
        }
        
    }

    public double getNumber() {
        Scanner input= new Scanner(System.in);
        double number=input.nextInt();
        return number;
    }

    public void doOperation(int operation) {
            double number1=this.getNumber(1);
            double number2=this.getNumber(2);
            this.callCalc(number1,number2,operation);
    }

    public void printNumberRequest(int number) {
        System.out.println("Please digit number "+number+" :");
    }

    public double getNumber(int numberOfNumber) {
        this.printNumberRequest(numberOfNumber);
        double number=this.getNumber();
        return number;
    }

    public void callCalc(double number1, double number2, int operation) {
        if(operation==1){
            System.out.println(calculator.addTwoNumbers(number1, number2));
            
        }
    }
    
    
}
