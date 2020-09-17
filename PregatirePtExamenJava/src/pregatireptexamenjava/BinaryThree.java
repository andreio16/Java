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
public class BinaryThree {
    Node root= null;
    
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
        else if(z.key<y.key) y.leftChild=z;
        else y.rightChild=z;
    }
    
    public void inordine(Node x){
        if(x!=null){
            inordine(x.leftChild);
            System.out.print(x.key+" ");
            inordine(x.rightChild);
        }
    }
    public void preordine(Node x){
        if(x!=null){
            System.out.print(x.key+" ");
            preordine(x.leftChild);
            preordine(x.rightChild);
        }
    }
    public void postordine(Node x){
        if(x!=null){
            postordine(x.leftChild);
            postordine(x.rightChild);
            System.out.print(x.key+" ");
        }
    }
    public Node cauta_iterativ(Node x, int k){
        while(x!=null && k!=x.key){
            if(k<x.key)
                x=x.leftChild;
            else x=x.rightChild;
        }
         return x;
    }
    
    public Node nodeMin(Node x){
        while(x.leftChild!=null) 
            x=x.leftChild;
        return x;
    }
    public Node succesor(Node x){
        if(x.rightChild!=null)
            return nodeMin(x.rightChild);
        Node y=x.parent;
        while(y!=null && x==y.rightChild){
            x=y;
            y=y.parent;
        }
        return y;

    }
    public Node stergeNod(Node z){
        Node y;
        Node x;
        if(z.leftChild==null || z.rightChild==null) y=z;
        else y =succesor(z);
        
        if(y.leftChild!= null)x=y.leftChild;
        else x=y.rightChild;
        
        if(x!=null) x.parent=y.parent;
        
        if(y.parent==null) root=x;
        else if(y==y.parent.leftChild) 
                y.parent.leftChild=x;
                else
                y.parent.rightChild=x;
      if(y!=z)
          z.key=y.key;
      
      return y;
     
            
        
        
    }
}
/*
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::EXEMPLU MAIN:::::::::::::::::::::::::::::::::::::
 BinaryThree b= new BinaryThree();
        b.insert(new Node(7));
        b.insert(new Node(1));
        b.insert(new Node(5));
        b.insert(new Node(17));
        b.insert(new Node(10));
        b.insert(new Node(18));
         b.insert(new Node(3));
          b.insert(new Node(6));
        
        System.out.println("::Parcurgere prin inordine::");        
        b.inordine(b.root); System.out.println();
        
        System.out.println("::Parcurgere prin preordine::");        
        b.preordine(b.root); System.out.println();
        
        System.out.println("::Parcurgere prin postordine::");        
        b.postordine(b.root); System.out.println();
        
       Node x= new Node();
       x= b.cauta_iterativ(b.root, 18);
       if(x==null) System.out.println("Nodul inserat nu exista!!");
       else System.out.println("::Nodul inserat exista si este ("+x.key+")::");
       
       x=b.nodeMin(b.root);
        System.out.println("::Minimul din arborele binar de cautare este ("+x.key+")::");
       
       
       x=b.succesor(b.cauta_iterativ(b.root, 17));
       System.out.println("::Succesorul nodului 17 este ("+x.key+")::");
       
       
       b.stergeNod(b.cauta_iterativ(b.root, 18));
       x=b.cauta_iterativ(b.root, 18);
       if(x==null) System.out.println("Nodul 18 a fost sters!!");
       else System.out.println("::Nodul inserat exista si este ("+x.key+")::");
       
      b.inordine(b.root);
      x=b.succesor(b.cauta_iterativ(b.root, 17));
      if(x==null)System.out.println("::Nu::");
      else System.out.println("::Da::");
 //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::    
       
*/