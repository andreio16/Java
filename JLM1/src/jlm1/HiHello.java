/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlm1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Andrei
 */
public class HiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String str= "Hello world ,You can all call me devil. :)     " ;
       str=str.toUpperCase();
       StringTokenizer st= new StringTokenizer(str," ,");
       while(st.hasMoreTokens())
           System.out.println(st.nextToken());
      */
        
        /*
       File file = new File("C:\\Users\\Andrei\\Desktop\\poc");
       if(file.mkdir())
           System.out.println("true");
       else System.out.println("false");
       
       try{
           FileWriter fw = new FileWriter("C:\\Users\\Andrei\\Desktop\\66CMD.txt");
           PrintWriter pw= new PrintWriter(fw);
           
           pw.println("YOU CAN CALL ME DEVIL.");
           pw.println(":)");
           pw.close();
       }catch (IOException e){
           System.out.println("ERROR!");
       }
       */
        /*
        Scanner input= new Scanner(System.in);
        try {
        while(true){
            int i= Integer.parseInt(input.nextLine());
            if(i==0) break;
        }
        
        }catch (NumberFormatException nfe){
            System.out.println("ERROR MAAAAIII!!!!");
        }
        */
        /*
        Scanner input= new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        String data[] =new String[n];
        String str = null;
        for(int i=0;i<n;i++){
            str= input.nextLine();
            data[i]=str;
        }
        for(int i=0;i<n;i++){
            data[i]= data[i].toUpperCase();
        }
        Arrays.sort(data);
        for(int i=0;i<n;i++){
            System.out.print(data[i]+"\t");
        }
        */
        /*
        Scanner input =new Scanner(System.in);
        System.out.print("Introduceti nume :");
        String name= input.nextLine();
        System.out.printf("\nBine ai venit %s !",name);
        System.out.print("\nIntrodu varsta :");
        int v= Integer.parseInt(input.nextLine());
        System.out.print("\nFelicitari esti "+((v>100)?"batran!\n":"tanar!\n"));
       */
        /*
       FileInputStream fis = null;
       try{
           fis= new FileInputStream("C:\\Users\\Andrei\\Desktop\\deleteme.txt");
       }
       catch (FileNotFoundException e){
           e.printStackTrace();
       }
       DataInputStream dis = new DataInputStream(fis);
       String str=null;
       int ct=0;
       String data[]= new String[100];
       try{
           
           while((str=dis.readLine())!=null){
                data[ct]=str;  
                ct++;
           }
           dis.close();
           
       }catch(IOException e){
           e.printStackTrace();
       }
        for(int i=0;i<ct;i++){
            data[i]=data[i].toUpperCase();
        }
       Arrays.sort(data,0,ct);
       for(int i=0;i<ct;i++){
           System.out.println(data[i]+"\t");
       }
       */
        /*
        FileInputStream fis= null;
        try{
            fis= new FileInputStream("C:\\Users\\Andrei\\Desktop\\deleteme.txt");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        DataInputStream dis= new DataInputStream(fis);
        String str=null;
        String aux=null;
        String data[]= new String[100];
        int vect[]= new int[100];
        int i=0;
        try{
            while((str=dis.readLine())!=null)
            {
                StringTokenizer tok = new StringTokenizer(str," ");
                while(tok.hasMoreTokens())
                {
                    aux=tok.nextToken();
                    data[i]=aux;
                    i++;
                }
            }
            dis.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        for(int j=0;j<i;j++){
            try{
                vect[j]= Integer.parseInt(data[j]);
            }
            catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        Arrays.sort(vect,0,i);
        
        for(int x=0;x<i;x++){
            System.out.print(vect[x]+"\t");
        }
        
       */
        
        /*
        Employee e[]=new Employee[100];
        Scanner input= new Scanner(System.in);
        for(int i=0;i<=2;i++){
            String nume = input.next();
            String adresa= input.next();
            int v= Integer.parseInt(input.next());
            int salar= Integer.parseInt(input.next());
            e[i]= new Employee(nume, adresa, v, salar);
            
        }
        
        Employee maxS= e[0];
        for(int i=0;i<=2;i++){
            if(e[i].getSalary()> maxS.getSalary() )
                maxS=e[i];
        }
        
        
        System.out.println(maxS.getName()+"::"+maxS.getSalary());
        */
        
        
        
        
        /*
        
        
        FileInputStream fis= null;
        try{
            fis= new FileInputStream("C:\\Users\\Andrei\\Desktop\\text1.txt");
        }
        catch(FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        DataInputStream dis= new DataInputStream(fis);
        String str=null;
        String num=null;
        try{
            num =dis.readLine();
            int numOfStudents =Integer.parseInt(num);
            Student data[] =new Student[numOfStudents];
            
            for(int i=0;i<numOfStudents;i++){
                str=dis.readLine();
                
                Student aux =new Student();
                String[] parti =str.split(" ");
                
                aux.setName(parti[0]);
                
                aux.setAddress(parti[1]);
                
                int o= Integer.parseInt(parti[2]);
                aux.setAge(o);
                
                
            double avg= Double.parseDouble(parti[3]);
            aux.setGrade(avg);
                
                data[i]=aux;
                
            }
            dis.close();
            java.util.Arrays.sort(data, new Comparator(){
            public int compare (Object o1, Object o2){
                    if( ((Student)o1).getGrade()< ((Student)o2).getGrade() ) return -1;
                    if(  ((Student)o1).getGrade() > ((Student)o2).getGrade()  ) return 1;
                    return 0;
                }
            });
            
            for(int i=0;i<numOfStudents;i++){
                System.out.print(data[i].getName()+"::"+ data[i].getGrade());
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        

        */
        
        
        
        /*
        
       Person p = new  Person("Popescu","x",103);
       TreeSet tr= new TreeSet();
       tr.add(p);
       Person q = new Person("Ionescu","y",98);
       tr.add(q);
       Person r =new Person("Popescu","z",49);
       tr.add(r);
       
       Iterator it = tr.iterator();
       
       while(it.hasNext())
       {
           Person aux = (Person)it.next();
           System.out.println(aux.getName()+" "+aux.getAge());
       }
        
        */
        
         
        FileInputStream fis= null;
        try{
            fis= new FileInputStream("C:\\Users\\Andrei\\Desktop\\hugaBuga.txt");
        }
        catch(FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        DataInputStream dis= new DataInputStream(fis);
        String str=null;
        String num=null;
        String aux=null;
        try{
            
        aux=dis.readLine();
        int nc = Integer.parseInt(aux);
        TreeSet ts= new TreeSet();
        for(int i=0;i<nc;i++)
        {
            String titlu =dis.readLine();
            String prof= dis.readLine();
            
            str=dis.readLine();
            int credite= Integer.parseInt(str);
            
            num= dis.readLine();
            int an= Integer.parseInt(num);
            
            ts.add(new Course(titlu,prof,credite,an));
        }
        
        dis.close();
        Iterator it= ts.iterator();
        Iterator i= ts.iterator();
        while(it.hasNext())
        {
            Course auxx = (Course)it.next();
            System.out.println(auxx.getTitle()+"::"+auxx.getCredits());
        }
        
        System.out.println("\n---------------------------------------------------n");
        Course auxxx= (Course)i.next();
        System.out.println("CURSUL CU CELE MAI PUTINE CREDITE ESTE ::"+auxxx.getTitle());
            
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
     
    
}
