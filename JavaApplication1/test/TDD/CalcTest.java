package TDD;

import javaapplication1.Calc;
import javaapplication1.CalcMenu;
import javaapplication1.TurnOnCalc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cpineros
 */
public class CalcTest {
    Calc calculator=new Calc();
    TurnOnCalc menu=new TurnOnCalc();
    
    @Test
    public void AddTest(){
        assertEquals(7,calculator.addTwoNumbers(2,5),0);
        assertEquals(7.5,calculator.addTwoNumbers(2,5.5),0);
    }
    
    /*@Test
    public void LogTest(){
        assertEquals(7,calculator.addTwoNumbers(2,5),0);
        assertEquals("2.0 + 5.0 = 7.0\n",calculator.printLog());
    }*/
    
    @Test
    public void SubstractTest(){
        assertEquals(-3,calculator.SubstractTwoNumbers(2,5),0);
    }
    
    @Test
    public void MultiplyTest(){
        assertEquals(-3,calculator.SubstractTwoNumbers(2,5),0);
    }
    
    @Test
    public void DivideTest(){
        assertEquals(0.4,calculator.divideTwoNumbers(2,5),0);
    }
    
    @Test
    public void TestDivisionPorCero(){
        assertEquals(0,calculator.divideTwoNumbers(2,0),0);
    }
    
    @Test
    public void TestMenu1(){
        assertNotNull(menu);
    }
}
