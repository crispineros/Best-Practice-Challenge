package javaapplication1;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author cpineros
 */
public class Log {
    private ArrayList<String> loglist= new ArrayList<String>();
    public void addToLog(String logline){
        loglist.add(logline);
    }
    
    public String getLogString(){
        String logString="";
        logString=this.orderLogString();
        return logString;
    }
    
    public String orderLogString(){
        String logString="";
        logString=logString+this.orderLogStringBySum();
        logString=logString+this.orderLogStringBySub();
        logString=logString+this.orderLogStringByMult();
        logString=logString+this.orderLogStringByDiv();
        return logString;
    }
    
    public String orderLogStringBySum(){
        String logString="";
        logString=logString+"ADDITIONS: \n";
        for (int i=0;i<loglist.size();i++){
            if(loglist.get(i).contains("+")){
                logString=logString+loglist.get(i);
            }
        }
        return logString;
    }
    
    public String orderLogStringBySub(){
        String logString="";
        logString=logString+"SUBSTRACTIONS: \n";
        for (int i=0;i<loglist.size();i++){
            if(loglist.get(i).contains("-")){
                logString=logString+loglist.get(i);
            }
        }
        return logString;
    }
    
    public String orderLogStringByMult(){
        String logString="";
        logString=logString+"MULTIPLICATIONS: \n";
        for (int i=0;i<loglist.size();i++){
            if(loglist.get(i).contains("*")){
                logString=logString+loglist.get(i);
            }
        }
        return logString;
    }
    
    public String orderLogStringByDiv(){
        String logString="";
        logString=logString+"DIVISIONS: \n";
        for (int i=0;i<loglist.size();i++){
            if(loglist.get(i).contains("/")){
                logString=logString+loglist.get(i);
            }
        }
        return logString;
    }
    
    public String buildLogLine(double number1,double number2,double number3,String operation,String validation){
        return validation+" :"+String.valueOf(number1)+" "+operation+" "+String.valueOf(number2)+" = "+String.valueOf(number3)+"\n";
    }

    public void builtAndAddLogLine(double number1, double number2, double number3, String operation,String validation) {
        String logline=buildLogLine(number1, number2, number3, operation,validation);
        addToLog(logline);
    }
}
