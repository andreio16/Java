
package javaprogramming001;

public abstract class Personen {
    private String name;
    private String address;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public Personen (String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public Personen(){
        
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public abstract double reducereAbonament();
    
    
}
