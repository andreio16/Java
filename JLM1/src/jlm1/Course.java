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
public class Course implements Comparable{
    private String title;
    private String teacher;
    private int credits;
    private int year;
    public Course (String title, String teacher, int credits, int year){
        this.title=title;
        this.teacher=teacher;
        this.credits=credits;
        this.year=year;
                
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    
    public void setCredits(int credits){
        this.credits=credits;
    }
    public int getCredits(){
        return credits;
    }
    
    public int compareTo(Object o1)
    {
        return this.credits - ((Course)o1).credits;
    }
    
    
    
}
