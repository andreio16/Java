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
public class PregatirePtExamenJava {

  
    public static void main(String[] args) {
      
        Graph g = new Graph();
        /*
        g.addVertex();
        g.addVertex();
        g.addVertex();
        g.addVertex();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(0, 3);
        
        g.dfs();
        */
      for(int i=0;i<5;i++)
          g.addVertex();
      
      g.addEdgeD(0, 1, 12);
      g.addEdgeD(0, 4, 15);
      g.addEdgeD(1, 2, 26);
      g.addEdgeD(1, 3, 18);
      g.addEdgeD(1, 4, 17);
      g.addEdgeD(2, 3, 29);
      g.addEdgeD(3, 4, 21);
      
      g.DIJKSTRA(0);
      for(int i=0;i<5;i++){
          System.out.println( ((Vertex)g.vertexList.get(i)).dist );
      }
      
    
    }
}