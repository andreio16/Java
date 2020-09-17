/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming001;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

  
   
 //@author Andrei
public class HelloWorld {
      
  public static void main(String[] args) {

      /*
     Employee e[] =new Employee[5];
     Scanner input = new Scanner(System.in);
     
     for(int i=0;i<5;i++){
         String nume = input.next();
         String adresa = input.next();
         int varsta = input.nextInt();
         int salariu = input.nextInt();
         
         e[i]= new Employee(nume,adresa, varsta, salariu);
     }
     
     
     
     for(int i=0;i<5;i++){
         System.out.println("::: Angajatul "+i +" :::" );
         System.out.println(e[i].getName() +"\t" + e[i].getAddress() +"\t" +e[i].getAge() + "\t" + e[i].getSalary());
     }
     
     Employee max= e[0];
     for(int i=0;i<5;i++){
         if(e[i].getSalary()>max.getSalary()){
             max=e[i];
         }
     }
     
     System.out.println("::: Angajatul cu cel mai mare salariu :::" );
     System.out.println(max.getName() +"\t"+max.getSalary());
     
      */
      
      /*
      Book a[]= new Book[5];
      Scanner input= new Scanner(System.in);
     // System.out.print("Introdu un nr de carti :");
      int x= input.nextInt();     
      for(int i=0 ;i<x;i++){
          
          String titlu= input.nextLine();
          String  autor= input.nextLine();
           String editor= input.nextLine();
         double  pret= input.nextDouble();
          
          a[i]= new Book(pret, titlu, autor, editor);
      }
      Book p= a[0];
      for(int i=0;i<x;i++){
          if(a[i].getPrice()<p.getPrice()){
              p=a[i];
          }
      }
      System.out.println("::: Cea mai ieftina carte :::");
      System.out.println(p.getTitle()+"\t"+p.getAuthor()+"\t"+p.getPrice());
      
      
      */
      
      
      
      
      
      
      
      /*
      Personen x = new Personen();
      Scanner input= new Scanner(System.in);
      System.out.print("Introdu un nume :");
      String nume = input.nextLine();
      x.setName(nume);
      System.out.println("Obiectul de tip Personen a fost alocat cu numele :"+x.getName());
      
      
      
      Personen alfa= new Personen("Aleku","Str. Rasinari",20);
      System.out.println("\n****************************\n");
      System.out.println(alfa.getName());
      System.out.println(alfa.getAddress());
      System.out.println(alfa.getAge());
      
      
      System.out.println("\n****************************\n");
      Studenten k= new Studenten("Mircea","Str Lunguu", 250,10);
       System.out.println(k.getName());
      System.out.println(k.getAddress());
      System.out.println(k.getAge());
      System.out.println(k.getGrade());
      
      */
      
      
      
      /*
      Book b= new Book(100,"Titlu","Autor","Publicant");
      System.out.println(b.MakePrice());
     Car c= new Car(100000);
     System.out.println(c.MakePrice());              */
     /*
     Person p1= new Person("Pop",61);
     Person p2= (Person)p1.clone();
     
     System.out.println(p1.getName()+","+p1.getAge());
     System.out.println(p2.getName()+","+p2.getAge());
     System.out.println("\n*****************************\n");
     p1.setAge(p1.getAge()+1);
     System.out.println(p1.getName()+","+p1.getAge());
     System.out.println(p2.getName()+","+p2.getAge());
     p1.setName("Rus");
     System.out.println("\n*****************************\n");
     System.out.println(p1.getName()+","+p1.getAge());
     System.out.println(p2.getName()+","+p2.getAge());
     */
      
      
      
      
//      HashSet hs= new HashSet();
//      hs.add(new Integer(1));
//      hs.add(new Integer(2));
//      hs.add(new Integer(4));
//      hs.add(new Integer(2));
//      
//      TreeSet ts=new TreeSet(hs);
//      ts.add(new Integer(3));
//      
//      LinkedHashSet lhs = new LinkedHashSet();
//      lhs.add(new Integer(1));
//      lhs.add(new Integer(2));
//      lhs.add(new Integer(4));
//      lhs.add(new Integer(3));
//      
//      Iterator i =lhs.iterator();
//      while(i.hasNext())
//          System.out.println(i.next());
//




//Person  p= new Person("Popescu",103);
//TreeSet ts = new TreeSet();
//ts.add(p);
//
//Person q= new Person("Ionescu",98);
//ts.add(q);
//
//Person r= new Person("Popei",49);
//ts.add(r);
//
//     Iterator i =ts.iterator();
//      while(i.hasNext()){
//          Person aux =(Person)i.next();
//          System.out.println( aux.getName() + "::" +aux.getAge());
//      }
//          
//      
      
      
      
      
             
      
      
      
      
        
//        Person p =new Person();
//       //errrrror  p.name= "popei";
//        p.setName("POPP");
//        p.setAddress("Ostirii Strasse");
//        p.setAge(30);
//        System.out.println("Nume: "+p.getName());
//        System.out.println("Adresa: "+p.getAddress() );
//        System.out.println("Varsta: "+p.getAge());
//        
//        System.out.println("----------------------------------------");
//        
//        
//        Person q= new Person("Dan","Str Poplaca nr1 ",85);
//        System.out.println("Nume: "+ q.getName());
//        System.out.println("Adresa: "+q.getAddress());
//        System.out.println("Varsta: "+q.getAge());
//        System.out.println("----------------------------------------");
//        
//        
//        
//        
//        Student s= new Student("Rus","Avrig",98,5);
//        System.out.println("Nume: "+s.getName());
//        System.out.println("Adresa: "+s.getAddress());
//        System.out.println("Varsta: "+ s.getAge());
//        System.out.println("Media elevului: "+s.getGrade());
//        
//
//        System.out.println("----------------------------------------");
//        
//        
//        Teacher t= new Teacher("Costi","Rusciori",47,"Facultatea de inginerie ULBS",3);
//        System.out.println("Nume: "+t.getName());
//        System.out.println("Adresa: "+ t.getAddress());
//        System.out.println("Varsta: "+t.getAge());
//        System.out.println("Facultatile in cadrul careia preda: "+t.getUni());
//        System.out.println("Numarul de cursuri predate: "+t.getCourses());
//        
       
     


//
//Scanner input = new Scanner(System.in);
//System.out.print("Introduceti numele dvs : ");
//String nume = input.nextLine();
//System.out.print("Introduceti varsta dvs : ");
//int varsta = input.nextInt();
//
//System.out.printf("Buna ziua stimate %s .Aveti %d ani. ",nume, varsta);
//System.out.print((varsta>100)?"Sunteti batran/batrana.\nSa aveti o zi buna :)":"Sunteti tanar/tanara.\nSa aveti o zi buna :) \n");
//

//Scanner input =new Scanner(System.in);
//System.out.print("Introduceti un numar de numere :");
//int n= input.nextInt();
//int vector[]= new int[n];
//
//
//for(int i=0 ;i <n ;i++){
//    int numarCurent =input.nextInt();
//    vector[i]=numarCurent;
//}
//System.out.println("Afisare simpla :");
//for(int i=0;i<n;i++)
//    System.out.print(vector[i]+ "\t");
//
//System.out.println("\nAfisare dupa sortare :");
//Arrays.sort(vector);
//for(int i=0;i<n;i++)
//    System.out.print(vector[i]+ "\t");
//System.out.println();
//



//    while(true){
//    System.out.print("Introduceti  un intreg: ");
//    Scanner input =new Scanner(System.in);
//    String str = input.nextLine();
//    try{
//    
//        int i= Integer.parseInt(str);
//        System.out.println("Intregul introdus este : "+i);
//        break;
//    }
//    catch(NumberFormatException nfe)
//    {
//        System.out.println("Ati introdus un intreg invalid! \n");
//        
//    }
//}
   

    












        
        /*
        long startTime= System.currentTimeMillis();
        
       String s ="Hello World ,,:)))),,))   ";
       String subS= s.substring(0,6);
       char c= s.charAt(6);
       System.out.println(subS+"\t"+ c);
       if(s.equals("Hallo"))
           System.out.println("true");
       else System.out.println("false");
       
      System.out.println(subS.compareTo("Hallo"));
      System.out.println(s.length());
      String ct = s.trim();
      System.out.println(ct.length());  
      
      String ok = s.toUpperCase();
      System.out.println(ok);
      
      StringTokenizer p= new StringTokenizer(s," ,");
      while(p.hasMoreTokens())
          System.out.println(p.nextToken());
      
      
      
      int a=5;
      int b=5;
      System.out.println((a==b)? "a==b":"a!=b");
      
      
      Integer z= new Integer(5);
      Integer y= new Integer(5);
      System.out.println((z==y)? "z==y": "z!=y");
      
    float m= 3.14f;
    Float n= new Float(m);
    
    String str10 = String.valueOf(a);
    System.out.println(str10);    
    
    
    Integer zece= new Integer(10);
    int poo= zece.intValue();
    System.out.println(poo);
    
    
    Double pp = new Double(3.14);
    double xpp= pp.doubleValue();
    System.out.println(xpp);
    
    
    String ss= new String("20");
    int rez= Integer.parseInt(ss);
    
    
    
    Integer cc= new Integer(5);
    Integer ccc= new Integer(5);
    System.out.println(cc.equals(ccc)? "cc==ccc": "cc!=ccc");
    
    
    Integer kk=new Integer(5);
    Integer kkk= new Integer(5);
    System.out.println((kk.compareTo(kkk)==0)? "kk==kkk": "kk!=kkk");
    
    Integer h= new Integer(5);
    Integer hh= new Integer(5);
    System.out.println((h.intValue()==hh.intValue())? "h==hh": "h!=hh");
    
    
    long endTime =System.currentTimeMillis();
    
    long diff= endTime - startTime;
    System.out.println("Timpul de exec in mili secunde :"+ diff);
    
    
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    //DataInputStream dis= new DataInputStream(System.in);
    String strr= null;
    try{
        strr =br.readLine();
    }
    catch(IOException ioe){
        ioe.printStackTrace();
    }
  System.out.println(strr);
    
    */    
    
 
        
        
        
        //        String str= "Hello people :)";
//        String varc= "KLM";
//        String sub= str.substring(0,5);//Hello
//        char c= str.charAt(1);//e
//        System.out.println(sub.equals(c)? "true": "false");//false
//        System.out.println(str.compareTo(varc));
//        System.out.println(str.toUpperCase());
        
    
       /*

       FileInputStream fis = null;
       try{
       
           fis= new FileInputStream("C:\\Users\\Andrei\\Desktop\\dani.txt");
       }
       catch(FileNotFoundException fnfe)
       {
           fnfe.printStackTrace();
       }
       
       DataInputStream dis = new DataInputStream(fis);
       String str=null;
       try {
       
           while((str= dis.readLine() )!= null)
               System.out.print(str);
           dis.close();
           System.in.read();
           
       }
       catch(IOException ioe)
       {
       
           ioe.printStackTrace();
       }
       

*/







//try{
//
//    FileReader fr= new FileReader("text.txt");
//    BufferedReader br= new BufferedReader(fr);
//    String str;
//    while((str=br.readLine())!= null){
//        out.println(str+"\n");
//        }
//    br.close();
//}
//catch(IOException ioe)
//{
//    out.println("File not found!");
//}





//
//try {
//
//    FileWriter fw = new FileWriter("C:\\Users\\Andrei\\Desktop\\dani.txt");
//    PrintWriter pw = new PrintWriter(fw);
//    pw.println("Hi, my name is Mike :) ");
//    pw.close();
//}
//catch (IOException ioe)
//{
//    ioe.printStackTrace();
//}

//
//Locale locale = Locale.getDefault();
//System.out.println(locale);
//System.out.println(locale.getCountry());
//System.out.println(locale.getDisplayLanguage());


                
    /*Part 1
       System.out.println("HelloWorld!!");
    */
      
    /*Part 2
      String yourName="Mike";
      System.out.println("Hello, "+yourName + "!");
    */
     
    /*Part 3
     Scanner input =new Scanner(System.in);
     System.out.println("What is your name ?");
     String yourName= input.nextLine();
     System.out.printf("Hello, %s !!!\n",yourName);
    */
    
    /*Part 4
    Scanner input= new Scanner(System.in);
    String heshe;
    int retirement=65;
    int valRetirement;
    
    System.out.print("Enter student's name :");
    String name = input.nextLine();
    System.out.print("Enter student's gpq :");
    double gpa= input.nextDouble();
    System.out.print("Enter student's age :");
    int age= input.nextInt();
    System.out.print("Are you Female? (true/false) :");
    boolean isFemale= input.nextBoolean();
    heshe= isFemale ? "She" : "He";
    valRetirement =retirement-age;
    
    System.out.printf("%s is %d years old ( %d years to retirement). %s has a %4.2f gpa.\n",name,age,valRetirement,heshe,gpa);
    
    */
    
    /*Part 5
    String hello="Hello";
    System.out.println(hello.compareTo("Hallo"));
    */
    
    /*Part 6
    String apia="Analiza, proiectarea si implementarea algoritmilor.";
    StringTokenizer st =new StringTokenizer(apia," ,");
    while(st.hasMoreTokens())
        System.out.println(st.nextToken());
    */

    
    /*Part 7
    String apia="Analiza, proiectarea si implementarea algoritmilor.";
    String[] parti=apia.split(" ");
    for(int i=0;i<parti.length;i++)
    {
        System.out.println(parti[i]);
    }
    */
    
    /*
    Scanner input = new Scanner(System.in);
    System.out.print("X = ");
    int x= input.nextInt();
    System.out.print("Y = ");
    int y= input.nextInt();
    int result;
    
    result =x+y;
    System.out.printf("X + Y = %d\n",result);
    
    result =x-y;
    System.out.printf("X - Y = %d\n",result);
    
    result= x*y;
    System.out.printf("X * Y = %d\n",result);
    
    result = x%y;
    System.out.printf("X mod Y = %d\n",result);
   */
    
    /*
    Scanner input = new Scanner(System.in);
    System.out.print("Enter student's name : " );
    String studentName= input.nextLine();
    System.out.print("Enter student's age : " );
    int age= input.nextInt();
    System.out.print("Enter student's gpa : " );
    double gpa = input.nextDouble();
    System.out.print("Is this student female? (true/flase) : " );
    boolean isFemale= input.nextBoolean();
    System.out.printf("%s is %d years old. %s has a %4.3f gpa.\n",studentName,age,(isFemale? "She":"He"),gpa);
   */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    }
    
}
