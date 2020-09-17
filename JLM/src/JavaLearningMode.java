
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




    
   

    public class JavaLearningMode {
    public static void main(String[] args) {
        
       //                                                                      pagina 51 pb 1 dar nu este gata +(teacher)
        /* 
       Scanner input =new Scanner(System.in);
        System.out.print("Introdu N nr de STUDENTI :");
        int ns= input.nextInt();
        Student tabS[]= new Student[ns];
        System.out.println("---Iar mai apoi N studenti---");
        
        
        for(int i=0;i<ns;i++){
            System.out.println("Nume student : ");
            String aux= input.next();
            
            
            
            
            System.out.println("Clasa student : ");
            String aux1= input.next();
            
            
            
            
            System.out.println("Varsta student: ");
            int num= input.nextInt();
           
           
            
            
            System.out.println("Medie student : ");
            double numm =input.nextDouble();
           
           
            Student xx =new Student(aux,num,aux1,numm);
            tabS[i]= xx;
           
           
            
        }
        
        System.out.println("::: AFISAREEEEEEE :::");
        for(int i=0 ;i<ns;i++){
            System.out.println("Student:: "+ i+" ::");
            System.out.println("Nume : " + tabS[i].getName());
            System.out.println("Clasa : " + tabS[i].getClassRoom());
            System.out.println("Varsta : " + tabS[i].getAge());
            System.out.println("Medie : " + tabS[i].getGrade());
        }
        System.out.println("::: AFISARE CEL MAI BUN ELEV :::");
        Student proba = new Student("Proba",0,"Proba",0);
        for(int i=0;i<ns;i++){
            if(tabS[i].getGrade()>proba.getGrade()){
                proba=tabS[i];
            }
        }
        
        System.out.println(proba.getName()+"\tnota: " + proba.getGrade()+ "\tclasa: "+proba.getClassRoom());
       
        Scanner input= new Scanner(System.in);
        System.out.print("Introduceti un nr de profesori : ");
        int nr = input.nextInt();
        
        Teacher tab[]= new Teacher[nr];
        
        for(int i=0;i<nr;i++){
        
            String nume1= input.next();
            String clasa1 = input.next();
            int varsta1 =input.nextInt();
            int cursuri1=input.nextInt();
            
           // Teacher xo= new Teacher(nume1,varsta1,clasa1,cursuri1);
           //tab[i]=xo;
           
           tab[i]= new Teacher(nume1, varsta1, clasa1,cursuri1);
            
            
        }
        
        Teacher auxiliar = tab[0];
        for(int i=0;i<nr;i++){
            if(tab[i].getCourses()>auxiliar.getCourses()){
                auxiliar= tab[i];
            }
        }
        
        System.out.println("::: Profesorul cu cele mai multe cursuri :::");
        System.out.println(auxiliar.getName()+"\t"+auxiliar.getCourses());
       
       
        
        
         */ 
        
        
        
        
        
        
        
      
        
      
         

        
        
        
        
        
        
        
        
        
        
        
        
        
         /*
        File file =new File("C:\\Users\\Andrei");
        String str[]= file.list();
        for(int i=0;i<str.length;i++)
            System.out.println(str[i]);
        
        System.out.println(str.length);
        System.out.println(System.getProperties());
        
        */
        /*
       
         File file =new File("C:\\Users\\Andrei\\Desktop\\deleteme");
        if(file.delete())
            System.out.println("Delete operation has been succesfull.");
        else System.out.println("Delete operation failed!");
        
        */
        /*
        FileInputStream fis =null;
        try{
            fis =new FileInputStream("C:\\Users\\Andrei\\Desktop\\dani.txt");
        }
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        DataInputStream dis =new DataInputStream(fis);
        String st= null;
        try{
            while((st=dis.readLine())!= null)
                System.out.println(st);
            
            dis.close();
            System.in.read();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
        
        */
        
       
       
        }
}
    

