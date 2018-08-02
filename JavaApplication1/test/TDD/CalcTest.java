/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

import javaapplication1.CalcMenu;
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
    
    @Test
    public void TestSuma(){
        assertEquals(7,CalcMenu.doOperation(2,5,"+"),0);
    }
    
    @Test
    public void TestResta(){
        assertEquals(-3,CalcMenu.doOperation(2,5,"-"),0);
    }
    
    @Test
    public void TestMultiplicacion(){
        assertEquals(10,CalcMenu.doOperation(2,5,"*"),0);
    }
    
    @Test
    public void TestDivision(){
        assertEquals(0.4,CalcMenu.doOperation(2,5,"/"),0);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
