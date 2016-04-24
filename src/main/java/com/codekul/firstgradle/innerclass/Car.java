/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstgradle.innerclass;

/**
 *
 * @author aniruddha
 */
public class Car {
    
    private int weight;

    public Car() {
        //type = 10;
    }
    public class Engine {
    
        private int type;
        
        public void start(){
            weight = 10;
        }
    }
    
    private class PetrolTank {

        public PetrolTank() {
            
        }
       
        
    }
    
    public static class Lights {
    
    }
    
    public void speedUpCar(){
        System.out.println("Speed Up Car");
        // local inner class
        final class Torque {
            
        }
        
        Torque torque = new Torque();
    }
}
