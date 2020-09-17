/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invatarejva;

/**
 *
 * @author Andrei
 */
public class BinaryTree {
    Node root=null;
    
    public void insert(Node z){
        Node y=null;
        Node x=root;
        while(x!=null){
            y=x;
            if(z.key<x.key) x=x.leftChild;
            else x=x.rightChild;
        }
        z.parent=y;
        if(y==null) root=z;
        else if(z.key < y.key) y.leftChild=z;
        else y.rightChild=z;
    }
    public void inordine(Node x){
        if(x!=null){
            inordine(x.leftChild);
            System.out.println(x.key);
            inordine(x.rightChild);
        }
    }
    public Node cauta_iterativ(Node x, int k){
        while(x!=null && k!=x.key){
            if(k<x.key) x=x.leftChild;
            else x=x.rightChild;
        }
        return x;
    }
}
