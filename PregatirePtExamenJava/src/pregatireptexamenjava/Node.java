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
public class Node {
    int key;
    float data;
    Node leftChild;
    Node rightChild;
    Node parent;
    
    public Node(int k){
        key=k;
    }
    public Node(){
        
    }
}
