/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.math.BigDecimal;
 import java.util.Observer;
/**
 *
 * @author Almudena
 */
public class main {
    static ConcreteObservable obs = new ConcreteObservable();
   
    public static void main(String[] args) { 
        
        Observer o1 = new ObservadorConsumoPatatas();

        obs.addObserver(o1);
        Hebra h1= new Hebra();
        
        h1.comenzar();
               
        //hacer un cambio a un objeto patatas y asi el observador lo ve
        
    }
}
