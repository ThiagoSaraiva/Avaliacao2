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
public class PontoYZ extends Ponto2D {

    public PontoYZ() {
        super();
    }

    public PontoYZ(double x, double y, double z) {
        super(x = 0, y, z);
    }
    
    @Override
    public String toString() {
        return "PontoYZ(" + '0' + getY() + ',' + getZ() + ')';
    }
    
    
}
