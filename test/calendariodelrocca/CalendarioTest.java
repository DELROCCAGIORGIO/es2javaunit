/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariodelrocca;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giorgio Del Rocca
 */
public class CalendarioTest {
    
    public CalendarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Giorno method, of class Calendario.
     */
    @Test
    public void testGiorno() {
        System.out.println("Giorno");
        Calendario instance = null;
        String expResult = "sabato";
        String result = instance.Giorno();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of Domani method, of class Calendario.
     */
    @Test
    public void testDomani() {
        System.out.println("Domani");
        Calendario instance = null;
        String expResult = "3/1/2021";
        String result = instance.Domani();
        assertEquals(expResult, result);
      
    }
    
}
