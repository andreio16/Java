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
public class fcIT {
    
    public fcIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcul method, of class fc.
     */
    @Test
    public void testCalculcase1() {
        System.out.println("Calculcase1");
        String stare = "1";
        String intrare = "a";
        fc instance = new fc();
        String expResult = "2";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCalculcase2caseA() {
        System.out.println("Calculcase2caseA");
        String stare = "2";
        String intrare = "a";
        fc instance = new fc();
        String expResult = "3";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
     public void testCalculcase2caseB() {
        System.out.println("Calculcase2caseB");
        String stare = "2";
        String intrare = "b";
        fc instance = new fc();
        String expResult = "4";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
     @Test
      public void testCalculcase2caseC() {
        System.out.println("Calculcase2caseC");
        String stare = "2";
        String intrare = "c";
        fc instance = new fc();
        String expResult = "5";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
      @Test
     public void testCalculcase3caseA() {
        System.out.println("Calculcase3caseA");
        String stare = "3";
        String intrare = "a";
        fc instance = new fc();
        String expResult = "3";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
     public void testCalculcase3caseB() {
        System.out.println("Calculcase3caseB");
        String stare = "3";
        String intrare = "b";
        fc instance = new fc();
        String expResult = "4";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     @Test
      public void testCalculcase3caseC() {
        System.out.println("Calculcase3caseC");
        String stare = "3";
        String intrare = "c";
        fc instance = new fc();
        String expResult = "5";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
      @Test
      public void testCalculcase4caseA() {
        System.out.println("Calculcase4caseA");
        String stare = "4";
        String intrare = "a";
        fc instance = new fc();
        String expResult = "3";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
      @Test
     public void testCalculcase4caseB() {
        System.out.println("Calculcase4caseB");
        String stare = "4";
        String intrare = "b";
        fc instance = new fc();
        String expResult = "4";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
      public void testCalculcase4caseC() {
        System.out.println("Calculcase4caseC");
        String stare = "4";
        String intrare = "c";
        fc instance = new fc();
        String expResult = "5";
        String result = instance.calcul(stare, intrare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
