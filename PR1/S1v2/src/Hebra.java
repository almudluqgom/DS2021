/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random; 
import java.lang.*;
/**
 *
 * @author Almudena
 */
public class Hebra extends Thread {
    Thread t;
    public int num;
    
        Hebra(){
            // thread created
            t = new Thread(this, "Admin Thread");

            // this will call run() function
            System.out.println("Contando Productos... ");
          
        }
        public int getnum(){
            return num;
        }
	public void parar(){
		t.interrupt();
	}

	// reanudar la ejecucion de la hebra
	public int comenzar(){
		t.start();
                return num;
	}
    
        @Override
	public void run(){
       
            Random random = new Random();   
            num = random.nextInt(100);
            System.out.println("Número de patatas contadas: "+ num);
            try {
                Thread.sleep(random.nextInt(3000));
           } catch (Exception e) {
                System.out.println(e);
           }
           
        }
        
}
