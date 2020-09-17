/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invatarejva;

import java.util.ArrayList;

/**
 *
 * @author Andrei
 */
public class InvatareJVA {

    public static void cmlsc(int[]a){
        int imax=a.length-1;
        int n=a.length;
        int s[]= new int[100];
        int l[]= new int[100];
        int i;
        for( i=n;i>=0;i--){
            s[i]=-1;
            l[i]=1;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i] && l[j]+1>l[i]){
                    l[i]=l[j]+1;
                    s[i]=j;
                }
            }
            if(l[i]>l[imax]){
             imax=i;   
            }
        }
        i=imax;
        while(i!=-1){
           //for(int x=0;x<n;x++)
            System.out.print(a[i]+" ");
           i=s[i];
        }
    }
    public static int n=4;
    public static int[]s= new int[n];
    public static boolean accept(int k, int i){
        for(int j=0;j<=k-1;j++){
            if(s[j]==i)
                return false;
            if(Math.abs(j-k)== Math.abs(s[j]-i))
                return false;
        }
        return true;
    }
    public static void queens(int k){
        for(int i=0;i<n;i++){
            if(accept(k, i)){
                s[k]=i;
                if(k==n-1)
                {
                   for(int x=0;x<s.length;x++) 
                    System.out.print(s[x]+"  ");
                   System.out.println();
                }
                    else queens(k+1);
                
            }
        }
    }
    public static void main(String[] args) {
     
        int[]a={3,5,76,1,45,2,68,52,90,0,4,15};
        //cmlsc(a);
        
        queens(0);
        
        
        
        
        
    }
    
}
