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
public class creadorPescado implements Creador{
   @Override
   public Producto PedidoProducto(){
       Pescado p = new Pescado();
       return p;
   }
   @Override
   public Tienda EntradaaTienda(){
       Pescaderia t = new Pescaderia();
       return t;
   }
}
