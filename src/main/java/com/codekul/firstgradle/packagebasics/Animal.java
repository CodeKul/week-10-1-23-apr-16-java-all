/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstgradle.packagebasics;

/**
 *
 * @author aniruddha
 */
public/* standalone class can never be static or private*/ class Animal {
    
    private int legs;
    private int eyes;
    private static String name;
    protected String country;
    
    public static void getName(){
        
        System.out.println("static get name");
        //legs = 10;
        name = "android";
    }
    
    public void showLegs(){
        System.out.println("legs");
        name = "non android";
    }
}
