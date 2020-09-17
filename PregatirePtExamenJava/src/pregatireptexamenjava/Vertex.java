/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregatireptexamenjava;

import java.awt.Color;

/**
 *
 * @author Andrei
 */
public class Vertex {
    Color color;
    Vertex predecessor;
    int dist;
    int discovered;
    int finalized;
    char label;
    int index;
    int infinite=100;
    
    public Vertex(int i){
        index=i;
        color=color.WHITE;
        dist=infinite;
        predecessor=null;
    }
            
}
