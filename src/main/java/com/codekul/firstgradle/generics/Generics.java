/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstgradle.generics;

import com.codekul.firstgradle.innerclass.Car;
import com.codekul.firstgradle.packagebasics.Animal;

/**
 *
 * @author aniruddha
 */
public class Generics<T /*extends Animal*/> {

    public void acceptAnything(Object any){
       
        if(any instanceof Car){
            
            Car car = (Car) any;
            car.speedUpCar();
        }
        else if(any instanceof Animal){
            
            Animal animal = (Animal) any;
            animal.showLegs();
        }
        
    }
    
    public void provideAnything(){
        
        acceptAnything(new Car());
        acceptAnything(new Animal());
        
    }
    
    public T fullGeneric(T any){
       
        return any;
    }
}
