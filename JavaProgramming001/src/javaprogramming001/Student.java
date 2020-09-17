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
public class Student extends Person {
    private int grade;
    public Student(String name, String address, int age, int grade )
    {
        super(name,address, age);
        this.grade = grade;
    }
    public Student()
    {
        
    }
    public void setGrade(int grade)
    {
        this.grade= grade;
    }
    public int getGrade()
    {
        return grade;
    }
}
