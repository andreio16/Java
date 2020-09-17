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
public class TuringMasina extends MasinaTuringAbstract {

    public TuringMasina(functie fi, String banda) {
        super(fi, banda);
    }

    @Override
    public triplet f(String stare, String intrare) {
       return this.ff.calcul(stare, intrare);
    }

    @Override
    public String evolutie(String stareInitiala) {
        triplet obj=new triplet();
        String rez="";
        String stare=stareInitiala;
        for(int i=0;i<this.bb.length();)
        {
            obj=this.f(stare, bb.substring(i, i+1));
            stare=obj.stare;
            bb.replace(i, i+1,obj.symbol);
            i+=obj.deplasare;
            
            rez+=stareBanda()+"    :"+obj.stare+obj.symbol+obj.deplasare+"\r\n";
        }
        return rez;
    }
    
};

class fc implements functie{

    @Override
    public triplet calcul(String stare, String intrare) {
        triplet rez=new triplet();
        switch(stare)
        {
            case "0":
            {
                rez.stare="1";
                rez.symbol="x";
                rez.deplasare=1;
                break;
            }
            case "1":
            {
                switch(intrare)
                {
                    case "0":
                    {
                        rez.stare="1";
                        rez.symbol="0";
                        rez.deplasare=1;
                        break;
                    }
                    case "y":
                    {
                        rez.stare="1";
                        rez.symbol="y";
                        rez.deplasare=1;
                        break;
                    }
                    case "1":
                    {
                        rez.stare="2";
                        rez.symbol="y";
                        rez.deplasare=-1;
                        break;
                    }
                }
                break;
            }
            case "2":
            {
                switch(intrare)
                {
                    case "y":
                    {
                        rez.stare="2";
                        rez.symbol="y";
                        rez.deplasare=-1;
                        break;
                    }
                    case "x":
                    {
                        rez.stare="3";
                        rez.symbol="x";
                        rez.deplasare=1;
                        break;
                    }
                    case "0":
                    {
                        rez.stare="4";
                        rez.symbol="0";
                        rez.deplasare=-1;
                        break;
                    }
                }
                break;
            }
            case "3":
            {
                switch(intrare)
                {
                    case "y":
                    {
                        rez.stare="3";
                        rez.symbol="y";
                        rez.deplasare=1;
                        break;
                    }
                    case "b":
                    {
                        rez.stare="5";
                        rez.symbol="y";
                        rez.deplasare=1;
                        break;
                    }
                }
                break;
            }
             case "4":
            {
                switch(intrare)
                {
                    case "0":
                    {
                        rez.stare="4";
                        rez.symbol="0";
                        rez.deplasare=-1;
                        break;
                    }
                    case "x":
                    {
                        rez.stare="0";
                        rez.symbol="x";
                        rez.deplasare=1;
                        break;
                    }
                }
                break;
            }
        }
        
        return rez;
    }
    
};