/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClasses;
import p1s2.ds.ObjetoFactoria.*;
import p1s2.ds.FactoriaAbstracta.*;
/**
 *
 * @author Almudena
 */
public class Cliente {
    Creador creador;
    
    public Cliente(Creador creador){
        this.creador=creador;
    }
    public TipoProducto crearProducto(){
        return this.creador.crearProductoSimple();
    }
}
