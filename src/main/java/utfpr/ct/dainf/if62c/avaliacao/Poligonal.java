/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author ThiagoSaraiva
 */
public class Poligonal {
    int NumVertices;
    
    public Poligonal(int n){
        this.NumVertices = n;
    }
    
    private Ponto2D vertices[] = new Ponto2D[NumVertices];
    
    public int getN(){
        return this.NumVertices;
    }
}
    
    