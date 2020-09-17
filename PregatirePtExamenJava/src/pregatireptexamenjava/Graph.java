/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregatireptexamenjava;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Andrei
 */
public class Graph {
    int maxVerts=20;
    int nVerts=0;
    ArrayList vertexList= new ArrayList();
    int a[][]= new int[maxVerts][maxVerts];
    int t;
    int infinite=100;
    
    public Graph(){
        for(int i=0;i<maxVerts;i++)
            for(int j=0;j<maxVerts;j++)
                a[i][j]=0;
    }
    public void addVertex(){
        vertexList.add(new Vertex( nVerts++));  
       
    }
    public void addEdge(int v1, int v2){
        a[v1][v2]=1;
        a[v2][v1]=1;
    }
  
    public void dfs(){
        for(int u=0;u<nVerts;u++){
            ((Vertex)vertexList.get(u)).color = Color.white;
            ((Vertex)vertexList.get(u)).predecessor = null;
        }
        t=0;
        for(int u=0;u<nVerts;u++){
            if(((Vertex)vertexList.get(u)).color == Color.white){
                explorare(((Vertex)vertexList.get(u)));
            }
        }
    }
    
    public void explorare(Vertex u){
        u.color = Color.gray;
        System.out.println(u.index);
        u.discovered= ++t;
        for(int v=0;v<nVerts;v++){
            if(a[v][u.index]==1)
                if(((Vertex)vertexList.get(v)).color == Color.white){
                    ((Vertex)vertexList.get(v)).predecessor = u;
                    explorare(((Vertex)vertexList.get(v)));
                }
        }
        u.color= Color.BLACK;
        u.finalized=++t;
        
    }
   public void DIJKSTRA(int s){
       for(int u=0;u<nVerts;u++){
           ((Vertex)vertexList.get(u)).dist=infinite;
           ((Vertex)vertexList.get(u)).predecessor=null;
       }
       ((Vertex)vertexList.get(s)).dist=0;
       ArrayList Q =(ArrayList)vertexList.clone();
       while(!Q.isEmpty()){
           Vertex u = (Vertex)Q.get(0);
           for(int i=1;i<Q.size();i++){
               if ( ((Vertex)Q.get(i)).dist < u.dist ){
                   u = (Vertex)Q.get(i);
               }
           }
           Q.remove(u);
           for(int v=0;v<nVerts;v++){
               if(a[v][u.index]!=0)
                   if( ((Vertex)vertexList.get(v)).dist > u.dist + a[u.index][v] ){
                       ((Vertex)vertexList.get(v)).dist = u.dist + a[u.index][v] ;
                       ((Vertex)vertexList.get(v)).predecessor = u; 
                   }
           }
       }
   }
   
   public void addEdgeD(int v1, int v2, int w){
       a[v1][v2]=w;
       a[v2][v1]=w;
   }
  
}
