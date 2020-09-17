/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming001;

/**
 *
 * @author Andrei
 */
public class Car extends Product{
    public Car (double price){
        super(price);
    }
    public double MakePrice(){
        return getPrice()+ (19*getPrice()/100);
    }
    
}
