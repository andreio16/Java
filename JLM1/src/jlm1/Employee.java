/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlm1;

/**
 *
 * @author Andrei
 */
public class Employee extends Person{
    private int salary;
    public Employee(String name, String address, int age, int salary){
        super(name,address, age);
        this.salary=salary;
               
    }
    
   public void setSalary(int salary){
       this.salary=salary;
   }
   public int getSalary(){
       return salary;
   }
         
    
}
