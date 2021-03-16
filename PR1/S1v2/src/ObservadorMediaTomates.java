/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Almudena
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Almudena
 */

import java.util.Random; 
import java.lang.*;

public class ObservadorMediaTomates extends Thread{
    MediaTomateFrame t;
    public int num;
    
    public void run(){
        Random random = new Random();   
            num = random.nextInt(100);
            
            try {
                Thread.sleep(random.nextInt(1000));
           } catch (Exception e) {
                System.out.println(e);
           }
    }
}