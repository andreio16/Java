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
public class gcIT {
    
    public gcIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcul method, of class gc.
     */
    @Test
    public void testCalculUppercaseA() {
        System.out.println("CalculUppercaseA");
        String stare = "2";
        String intrare = "a";
        gc instance = new gc();
        String expResult = "A";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    @Test
    public void testCalculUppercaseB() {
        System.out.println("CalculUppercaseA");
        String stare = "2";
        String intrare = "b";
        gc instance = new gc();
        String expResult = "B";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCalculUppercaseC() {
        System.out.println("CalculUppercaseC");
        String stare = "2";
        String intrare = "c";
        gc instance = new gc();
        String expResult = "C";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
}
