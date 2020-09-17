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
public  class Book extends Product {
    private String title;
    private String author;
    private String publisher;
    public Book(double price, String title, String author, String publischer){
    super(price);
    this.title=title;
    this.author=author;
    this.publisher=publisher;
    }
   
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public double MakePrice(){
        return this.getPrice()+(9*this.getPrice())/100;
    }
    
    
}
