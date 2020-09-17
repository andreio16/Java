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
class triplet{
String stare;
String symbol;
Integer deplasare;
}

interface functie { 
    public triplet calcul(String stare,String intrare);
}

public abstract class MasinaTuringAbstract {
functie ff;
StringBuilder bb;

public MasinaTuringAbstract (functie fi, String banda){
ff=fi;
bb = new StringBuilder(banda);
}


public abstract triplet f(String stare,String intrare);

public abstract String evolutie(String stareInitiala) ; 

public String stareBanda(){
return bb.toString().trim();
}
}
