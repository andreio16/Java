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
public class Student extends Person{
    private double grade;
    public Student (String name, String address, int age, double grade){
        super(name,address,age);
        this.grade=grade;
     }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public double getGrade(){
        return grade;
    }
    Student(){
    
    }

    

  
    
}