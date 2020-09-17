/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmiley;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dgrsb
 */
public class AutomatMileyyIT {
    
    public AutomatMileyyIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of f method, of class AutomatMileyy.
     */
  
    @Test
    public void testEvolutie() {
        System.out.println("evolutie");
        functie f=new fc();
        functie g=new gc();
        String stareInitiala = "1";
        String stringIntrare = "aaabbac";
        AutomatMileyy instance = new AutomatMileyy(f,g);
        String expResult = "1a2A\r\n2a3A\r\n3a3A\r\n3b4B\r\n4b4B\r\n4a3A\r\n3c5C\r\n";
        String result = instance.evolutie(stareInitiala, stringIntrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
