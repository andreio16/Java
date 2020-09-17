/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class Teacher {
    
    private String name;
    private int age;
    private String classRoom;
    private int courses;
    
    public Teacher(String name, int age, String classRoom, int courses){
        this.name=name;
        this.age= age;
        this.classRoom=classRoom;
        this.courses=courses;
    }
    
    public String getName(){
        return name;
    }
    public String getClassRoom(){
        return classRoom;
    }
    public int getAge(){
        return age;
    }
    public int getCourses(){
        return courses;
    }
    
    
    
    
    
    public void setName(String name){
        this.name=name;
    }
    public void setClassRoom(String classRoom){
        this.classRoom=classRoom;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setCourses(int courses){
        this.courses=courses;
    }
}
