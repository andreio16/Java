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
interface functie { 
        public String calcul(String stare,String intrare);
    }

public abstract class AutomatMealyAbstract {
functie ff;
functie gg;

public AutomatMealyAbstract (functie fi, functie gi){
ff=fi;
gg=gi;
}

public abstract String f(String stare,String intrare);
public abstract String g(String stare,String intrare);
public abstract String evolutie(String stareInitiala,String stringIntrare);
}
