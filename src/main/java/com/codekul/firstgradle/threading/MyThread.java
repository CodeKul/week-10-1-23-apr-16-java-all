/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstgradle.threading;

/**
 *
 * @author aniruddha
 */
public class MyThread  extends Thread{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
        int i = 0;
        while(true){
            System.out.println("Hevey - "+ ++i);
            
            if(i >= 100) break;
        }
    }
}
