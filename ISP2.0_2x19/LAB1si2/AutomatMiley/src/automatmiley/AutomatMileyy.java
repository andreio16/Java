/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmiley;

import java.util.Locale;



/**
 *
 * @author dgrsb
 */
public class AutomatMileyy extends AutomatMealyAbstract{

    public AutomatMileyy(functie fi, functie gi) {
        super(fi, gi);
    }

    @Override
    public String f(String stare, String intrare) {
        return this.ff.calcul(stare, intrare);
    }

    @Override
    public String g(String stare, String intrare) {
        return this.gg.calcul(stare, intrare);
    }

    @Override
    public String evolutie(String stareInitiala, String stringIntrare) {
        String rez="";
        String intrare=stringIntrare;
        String stare=stareInitiala;
        for(int i=0;i<stringIntrare.length();i++)
        {
            rez+=stare+stringIntrare.substring(i, i+1);
            stare=this.f(stare, stringIntrare.substring(i, i+1));
            intrare=this.g(stare, stringIntrare.substring(i, i+1));
            rez+=stare+intrare+"\r\n";
        }
        return rez;
    }
}

   class fc implements functie{

        @Override
        public String calcul(String stare, String intrare) {
           String rez="";
           switch(stare) 
           {
               case "1":
               {
                   rez="2";
                   break;
               }
               case "2":
               {
                   switch(intrare)
                   {
                       case "a":
                           rez="3";
                           break;
                       case "b":
                       {
                           rez="4";
                           break;
                       }
                       case "c":
                       {
                           rez="5";
                           break;
                       }
                   }
                   break;
               }
               case "3":
               {
                   switch(intrare)
                   {
                       case "a":
                           rez="3";
                           break;
                       case "b":
                       {
                           rez="4";
                           break;
                       }
                       case "c":
                       {
                           rez="5";
                           break;
                       }
                   }
                   break;
               }
               case "4":
               {
                   switch(intrare)
                   {
                       case "a":
                           rez="3";
                           break;
                       case "b":
                       {
                           rez="4";
                           break;
                       }
                       case "c":
                       {
                           rez="5";
                           break;
                       }
                   }
                   break;
               }
           }
           return rez;
        }
   }
class gc implements functie
   {

        @Override
        public String calcul(String stare, String intrare) {
            return  intrare.toUpperCase(Locale.ITALY);
    }
}       
   
    

