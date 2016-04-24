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
public class CalcException extends Exception{

    @Override
    public String toString() {
        return super.toString() +" Calc Exception"; 
    }

    @Override
    public String getMessage() {
        return super.getMessage() +" Invalid division"; 
    }
}
