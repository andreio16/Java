/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortarisource;


    
public class Sortari {
    
    
    public static void insertSort(int[] vect){
        for(int j=1;j<vect.length;j++){
             int k= vect[j];
             int i=j-1;
             while(i>=0 && vect[i]>k){
                 vect[i+1]=vect[i];
                 i--;
             }
             vect[i+1]=k;
            
        }
    }
    public static void selectSort(int[] x){
        for(int i=0;i<x.length-1;i++){
            int min= i;
            for(int j=i+1;j<x.length;j++){
                if(x[j]<x[min]) min=j;
            }
             int aux= x[i];
             x[i]=x[min];
             x[min]=aux;
             
            
        }
    }
    public static void bubbleSort(int[] x){
        int n= x.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(x[j]>x[j+1])
                {
                    int aux= x[j];
                    x[j]=x[j+1];
                    x[j+1]=aux;
                }
            }
        }
    }
    public static void quickSort(int[] x, int primul, int ultimul){
        int i=primul;
        int j=ultimul;
        int pivot=x[primul];
        while(i<j){
            while(x[i]<pivot)i++;
            while(x[j]>pivot)j--;
            if(i<j){
                int aux= x[i];
                x[i]=x[j];
                x[j]=aux;
            }
            if(i<=j){
                i++;
                j--;
            }
        }
        if(primul<j) quickSort(x, primul, j);
        if(i<ultimul) quickSort(x, i, ultimul);
    }
    
    static int[] tg = new int[100];
    public static void merge(int[] x,int primul, int pivot, int ultimul){
        int k=primul;
        int i=primul;
        int j=pivot+1;
        //int[] tg=null;
        while(i<=pivot && j<=ultimul){
            if(x[i]<x[j]){
                tg[k]=x[i];
                k++;i++;
            }
            else{
                tg[k]=x[j];
                k++;j++;
            }
        }
        if(j>ultimul)
            for( j=i;j<=pivot;j++){
                    tg[k]= x[j];
                    k++;
                }
            
        if(i>pivot)
            for(i=j;i<=ultimul;i++){
                    tg[k]=x[i];
                    k++;
                }
            
        for(i=primul;i<=ultimul;i++){
                x[i]=tg[i];
            }
        
    }
    public static void mergeSort(int[] x, int primul, int ultimul){
        if(primul<ultimul){
            int pivot=(primul+ultimul)/2;
            mergeSort(x, primul, pivot);
            mergeSort(x, pivot+1, ultimul);
            merge(x, primul, pivot, ultimul);
        }
    }
    public static void afisare(int[] x){        
         for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        
    }
    

   
    public static void main(String[] args) {
        
        int [] t={72,1,23,5,84,17,54,22,96,3};
        //insertSort(t);
        //selectSort(t);
        //quickSort(t, 0, t.length-1);
        //bubbleSort(t);
        //mergeSort(t, 0, t.length-1);
        //afisare(t);
        
        
         int[] t1=new int[100000];
        tg=new int[t1.length];
        for(int i=0;i<100000;i++)
        {
            t1[i]=(int)(Math.random()*10000);
        }
        int[] t2=(int[])t1.clone();
        int[] t3=(int[])t1.clone();
        int[] t4=(int[])t1.clone();
        int[] t5=(int[])t1.clone();
        
        long time1=System.currentTimeMillis();
        insertSort(t1);
        long time2=System.currentTimeMillis();
        System.out.print("Insertie timp : " + (time2-time1) + "\n");
        
        
        time1=System.currentTimeMillis();
        selectSort(t2);
        time2=System.currentTimeMillis();
        System.out.print("Selectie timp : " + (time2-time1) + "\n");
        
        
        time1=System.currentTimeMillis();
        bubbleSort(t3);
        time2=System.currentTimeMillis();
        System.out.print("Bubble timp : " + (time2-time1) + "\n");
        
        
        time1=System.currentTimeMillis();
        quickSort(t4, 0, t4.length-1);
        time2=System.currentTimeMillis();
        System.out.print("Quick timp : " + (time2-time1) + "\n");
        
        
        time1=System.currentTimeMillis();
        mergeSort(t5, 0, t5.length-1);
        time2=System.currentTimeMillis();
        System.out.print("Merge timp : "+ (time2-time1)+"\n");
        
       /*
        
        
        int[] b ={7,85,33,1,2,5,9};
        int heapSize=0;
        HeapClass a= new HeapClass();
       
        
        
      a.Construieste(b);
      a.Afis(b);
        
      a.ConstrR(b);
      a.Afis(b);
        
      a.HeapSort(b);
      a.Afis(b);
        
        
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
