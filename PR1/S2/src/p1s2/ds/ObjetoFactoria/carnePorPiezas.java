/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1s2.ds.ObjetoFactoria;

/**
 *
 * @author Almudena
 */
public class carnePorPiezas implements TipoProductoSimple{
    public static String tipoP="trozos de cerdo";
    
    @Override
     public TipoProductoSimple clonar(){
         return this;
     }
     @Override 
     public String getTipo(){
         return this.tipoP;
     }
}
