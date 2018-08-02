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
    public void AddTest(){
        assertEquals(7,CalcMenu.doOperation(2,5,"+"),0);
    }
    
    @Test
    public void SubstractTest(){
        assertEquals(-3,CalcMenu.doOperation(2,5,"-"),0);
    }
    
    @Test
    public void MultiplyTest(){
        assertEquals(10,CalcMenu.doOperation(2,5,"*"),0);
    }
    
    @Test
    public void DivideTest(){
        assertEquals(0.4,CalcMenu.doOperation(2,5,"/"),0);
    }

}
