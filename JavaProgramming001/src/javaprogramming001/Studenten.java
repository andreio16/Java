
package javaprogramming001;


public class Studenten extends Personen{
    private int grade;
    public Studenten (String name,String address, int age, int grade){
        super(name,address,age);
        this.grade=grade;
    }
    public int getGrade(){
        return grade;
    }
    public double reducereAbonament(){
        return 50.0/100;
    }
    
}
