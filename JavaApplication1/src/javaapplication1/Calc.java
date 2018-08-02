package javaapplication1;

/**
 *
 * @author cpineros
 */
public class Calc {
    public double addTwoNumbers(double number1,double number2){
        return number1+number2;
    } 

    public double SubstractTwoNumbers(double number1, double number2) {
        return number1-number2;
    }

    public double multiplyTwoNumbers(double number1, double number2) {
        return number1*number2;
    }

    public double divideTwoNumbers(double number1, double number2) {
        if(number2==0){
            return 0;
        }
        return number1/number2;
    }
}
