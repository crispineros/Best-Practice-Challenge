package javaapplication1;

import java.util.ArrayList;

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
        for (int i=0;i<loglist.size();i++){
            logString=logString+loglist.get(i)+"\n";
        }
        return logString;
    }
    
    public String buildLogLine(double number1,double number2,double number3,String operation){
        return String.valueOf(number1)+" "+operation+" "+String.valueOf(number2)+" = "+String.valueOf(number3)+"\n";
    }

    public void builtAndAddLogLine(double number1, double number2, double number3, String operation) {
        String logline=buildLogLine(number1, number2, number3, operation);
        addToLog(logline);
    }
}
