/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

/**
 *
 * @author dgrsb
 */
public class Turingmachine {
    public static void main(String[] args) {
    functie f=new fc();
    String stare="0";
String banda="000111b";
TuringMasina myTuring = new TuringMasina(f,banda);
System.out.print(myTuring.evolutie(stare)); // TODO code application logic her
}
}
