/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortarisource;

/**
 *
 * @author Andrei
 */
public class HeapClass {
    int heapSize=0;
    public int Parinte(int i){
        return (i-1)/2;
    }
    public int Stanga(int i){
        return 2*i+1;
    }
    public int Dreapta(int i){
        return 2*i+2;
    }
    public void Inserare(int[]a, int z){
        heapSize++;
        int i= heapSize;
        while(i>0 && a[Parinte(i)]>z){
            a[i]=a[Parinte(i)];
            i=Parinte(i);
        }
        a[i]=z;
    }
    public void Construieste(int[]a ){
        heapSize=0;
        for(int i=1;i<a.length;i++){
            Inserare(a, a[i]);
        }
    }
    public void Afis(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public void Reconstituie(int[] a, int i){
        int s= Stanga(i);
        int d= Dreapta(i);
        int min;
        if(s<=heapSize && a[s]<a[i]) // && >= (1)
             min=s;
        else
            min=i;
        if(d<=heapSize && a[d]<a[min]) //&& >= (2)
            min=d;
        if(min!=i){
            int aux=a[i];
            a[i]=a[min];
            a[min]=aux;
            Reconstituie(a, min);
        }
        
    }
    public void ConstrR(int[]a){
        heapSize=a.length-1;
        for(int i=(a.length-1)/2;i>=0;i--){
            Reconstituie(a, i);
        }
    }
    
    public void HeapSort(int[]a){
        Construieste(a); //   (1) + (2) +  //ConstrR(a);(3)
        for(int i=a.length-1;i>=1;i--){
            int aux=a[0];
            a[0]=a[i];
            a[i]=aux;
            heapSize--;
            Reconstituie(a, 0);
        }
    }
}
