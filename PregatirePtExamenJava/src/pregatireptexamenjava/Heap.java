/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregatireptexamenjava;

/**
 *
 * @author Andrei
 */
public class Heap {
    int heapsize=0;
    public int Parinte(int i){
        return (i-1)/2;
    }
    public int Stanga(int i){
        return 2*i+1;
    }
    public int Dreapta(int i){
        return 2*i+2;
    }
    public void inserare(int[]a, int z){
        heapsize++;
        int i=heapsize;
        while(i>0 && a[Parinte(i)]>z){
            a[i]=a[Parinte(i)];
            i=Parinte(i);
        }
        a[i]=z;
    }
  
    public void reconstituie(int[]a, int i){
        int s = Stanga(i);
        int d = Dreapta(i);
        int min;
        if(s<=heapsize && a[s]>a[i]){   //:::Modificare(1):::
             min=s;
        }else{
            min=i;
        }
        
        if(d<=heapsize && a[d]>a[min]){     //:::Modificare(1):::
            min=d;
        }
        if(min!=i){
            int aux=a[i];
            a[i]=a[min];
            a[min]=aux;
            reconstituie(a, min);
        }
    }
    public void afisareHeap(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public void costruiesteRR(int[]a){
        heapsize=a.length-1;
        for(int i=heapsize/2;i>=0;i--){
            reconstituie(a, i);
        }
    }
      public void construieste(int[]a){
        heapsize=0;
        for(int i=1;i<a.length;i++){
            inserare(a, a[i]);
        }
    }
    public void heapSORT(int[]a){
        costruiesteRR(a);               //:::Modificare(1):::
        for(int i=a.length-1;i>=1;i--){
            int aux=a[0];
            a[0]=a[i];
            a[i]=aux;
            heapsize--;
            reconstituie(a, 0);
        }
    }
    
}

/*
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::EXEMPLU MAIN:::::::::::::::::::::::::::::::::::::
        int []vect= {5,3,17,10,84,19,6,22,9};
       
       Heap h= new Heap();
      // h.construieste(vect);
      // h.afisareHeap(vect);
      
      // h.costruiesteRR(vect);
      // h.afisareHeap(vect);
        
       h.heapSORT(vect);
       h.afisareHeap(vect);
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/