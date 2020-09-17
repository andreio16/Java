/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmiley;

/**
 *
 * @author dgrsb
 */
public class AutomatMiley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
functie f=new fc();
functie g=new gc();
AutomatMileyy myAutomat = new AutomatMileyy(f,g);
String stare="1";
String text="aaabbac";
System.out.print(myAutomat.evolutie(stare, text));
}
}
