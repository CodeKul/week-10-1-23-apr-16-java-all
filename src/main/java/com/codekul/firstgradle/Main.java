/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstgradle;

import com.codekul.firstgradle.innerclass.Car;
import com.codekul.firstgradle.innerclass.MyListener;
import com.codekul.firstgradle.packagebasics.Animal;
import com.codekul.firstgradle.threading.MyThread;

/**
 *
 * @author aniruddha
 */
public class Main {

    public static void main(String[] args) {
       
        threading();
    }

    public static void packageBasics() {
        Animal animal = new Animal();
        animal.showLegs();
        animal.getName();

        Animal.getName();
        //Animal.showLegs();
    }

    public static void innerClass() {

        Car car = new Car();

        Car.Engine engine = car.new Engine();

        Car.Lights lights = new Car.Lights();

        //anonymus inner class
        MyListener listener = new MyListener() {
            @Override
            public void listen() {

            }
        };

        listener = () -> {
            System.out.println("lambda");
        };
    }
    
    public static void threading(){
        
//        MyThread myThread = new MyThread();
//        myThread.start();
        
        new Thread(()->{
            int i= 0;
            while(true){
                System.out.println("Runnnable heavy - " + ++i);
                if(i == 100) break;
            }
        }).start();
    }
}
