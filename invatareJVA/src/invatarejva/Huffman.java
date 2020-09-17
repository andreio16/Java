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
public class Huffman {
    
    
    public void funcHuff(ArrayList c){
        int n=c.size();
        for(int i=0;i<n-1;i++){
             
          Node x = min(c);
          c.remove(x);
          Node y = min(c);
          c.remove(y);
          Node z = new Node(x.key + y.key);
          z.leftChild=x;
          z.rightChild=y;
          x.parent=z;
          y.parent=z;
          c.add(z);
        }
        Node root = (Node)c.get(0);
        codification(root);
    }
    
    public Node min(ArrayList c){
        Node min = (Node)c.get(0);
        for(int i=1;i<c.size();i++){
            if( ((Node)c.get(i)).key <min.key){
                min= (Node)c.get(i);
            }
        }
        return min;
    }
    public void codification(Node n){
        if(n.leftChild != null)
        {
            n.leftChild.data=0;
            codification(n.leftChild);
        }
        if(n.rightChild != null)
        {
            n.rightChild.data=1;
            codification(n.rightChild);
        }
    }
    
    public void printCodeHuff(Node n){
        if(n.parent!=null)
        {
            
            printCodeHuff(n.parent);
            System.out.print(n.data);
        }

}
}
