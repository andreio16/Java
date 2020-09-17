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
public class Teacher extends Person {
    private int courses;
    private String uni;
     public Teacher(String name, String address, int age, String uni ,int courses )
    {
        super(name,address, age);
        this.courses= courses;
        this.uni= uni;
    }
    public Teacher()
    {
        
    }
    public void setCourses(int courses)
    {
        this.courses= courses;
    }
    public int getCourses()
    {
        return courses;
    }
    
    public void setUni(String uni)
    {
        this.uni= uni;
    }
    public String getUni()
    {return uni;}
}

