/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1s2.ds.FactoriaAbstracta;
import p1s2.ds.ObjetoFactoria.*;

/**
 *
 * @author Almudena
 */
public class creadorCarne implements creadorProducto{
    
    @Override
     public TipoProductoSimple crearProductoSimple(){
         TipoProductoSimple t = new  carnePorPiezas();
         return t;
     }
}
