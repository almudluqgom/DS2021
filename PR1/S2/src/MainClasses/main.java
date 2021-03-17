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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoriaAbstractaProductos f;
        TipoProducto prod;
        //introducir datos del producto que quieras
        System.out.println("Selecciona el producto que quieres apuntar:");
        
        
        System.out.println("1.Piezas de carne");
        System.out.println("2.Trozos de pescado");
        prod = f.crearProducto();
    }
    
}
