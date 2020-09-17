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
public class Person implements Comparable{
   private String name;
   private String address;
   private int age;
   public Person(String name, String address, int age)
   {
       this.name=name;
       this.address=address;
       this.age=age;
   }
   public Person(){}
   
   public int getAge(){
       return age;
   }
   public String getName(){
       return name;
   }
   public String getAddress(){
       return address;
   }
   public void setAge(int age){
       this.age=age;
   }
   public void setName(String name){
       this.name=name;
   }
   public void setAddress(String address){
       this.address=address;
   }
   
   public int compareTo(Object o){
       if( this.name.compareTo(((Person)o).name)==0)
           return this.age-((Person)o).age;
       else return this.name.compareTo(((Person)o).name);
               
   }
    
}
