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
public interface TipoProductoSimple extends TipoProducto{
    @Override
     public TipoProductoSimple clonar();   
     
     public String getTipo();
}
