/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstgradle;

import com.codekul.firstgradle.exception.Calc;
import com.codekul.firstgradle.exception.CalcException;
import com.codekul.firstgradle.generics.Generics;
import com.codekul.firstgradle.innerclass.Car;
import com.codekul.firstgradle.innerclass.MyListener;
import com.codekul.firstgradle.otherpackagebasics.TigerOther;
import com.codekul.firstgradle.packagebasics.Animal;
import com.codekul.firstgradle.packagebasics.TempMain;
import com.codekul.firstgradle.threading.MyThread;
import com.codekul.firstjava.collections.MyCollection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aniruddha
 */
public class Main {

    public static void main(String[] args) /*throws Exception*/{
       
       collections();
    }
    
    public static void collections(){
        
        MyCollection collection = new MyCollection();
        collection.whatIsCollection();
        collection.howIteratorWorks();
        collection.howForeachWorksOnCollection();
        collection.whatIsSet();
        collection.whatIsMap();
    }
    
    public static void generics(){
        Generics<Car> genericCar = new Generics<>();
        genericCar.fullGeneric(new Car());
        genericCar.provideAnything();
        
        Generics<Animal> genAnimal = new Generics<>();
        genAnimal.fullGeneric(new Animal());
    }
    
    public static void exceptionHandling() /*throws Exception*/{
        
        try /*throws Exception*/ {
            Calc calc = new Calc();
            //calc.calcIt();

            //calc.calcIt(10,0);
            
            calc.calcIt(10);
        } catch(CalcException e){
            System.out.println(" "+e);
        }
        catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
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
