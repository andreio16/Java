/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class Student {
    
    public String name;
    public  int age;
    public String classRoom;
    public double grade;
    
    public Student (String name, int age, String classRoom, double grade){
        this.name=name;
        this.age=age;
        this.classRoom=classRoom;
        this.grade=grade;
    }
    
    public String getName(){
        return name;
    }
    public String  getClassRoom(){
        return classRoom;
    }
    public int getAge(){
        return  age;
    }
    public double getGrade(){
        return grade;
    }
    
    
    public void setName(String name){
        this.name=name;
    }
    public void setClassRoom(String classRoom){
        this.classRoom= classRoom;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public void setGrade(double grade){
        this.grade= grade;
    }
    
    
}
