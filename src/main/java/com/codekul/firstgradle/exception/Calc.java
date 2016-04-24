/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstgradle.exception;

/**
 *
 * @author aniruddha
 */
public class Calc {
    
    public void calcIt(){
        
        try {
            int res = 50/0; // throw new ArithmaticException();
            System.out.println("Division Result is "+res);
        } catch(ArithmeticException e){
            System.out.println("ArithmaticException - "+e.toString());
        }
        catch (Exception e) {
            System.out.println("Generics - "+e.toString());
        }
        
        System.out.println("I reached after try catch");
    }
    
    public void calcIt(int div1, int div2) throws ArithmeticException,Exception{
        int res = div1/div2;
        System.out.println("Result is "+res);
    }
    
    public void calcIt(int div) throws CalcException{
        
        if(div <= 0){
            throw new CalcException();
        }
        int res = 100/div;
        System.out.println("Result is - "+res);
    }
}
