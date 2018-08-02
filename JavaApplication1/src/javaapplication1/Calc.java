/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cpineros
 */
public class Calc {
    public double sumarDosNumeros(double number1,double number2){
        return number1+number2;
    } 

    public double restarDosNumeros(double number1, double number2) {
        return number1-number2;
    }

    public double multiplicarDosNumeros(double number1, double number2) {
        return number1*number2;
    }

    public double dividirDosNumeros(double number1, double number2) {
        if(number2==0){
            return 0;
        }
        return number1/number2;
    }
}
