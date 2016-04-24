/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstjava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aniruddha
 */
public class MyCollection {

    public void whatIsCollection() {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(12);
        collection.add(132);
        collection.add(56);
        collection.add(789);
        collection.add(752);
    }

    public void howIteratorWorks() {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(12);
        collection.add(132);
        collection.add(56);
        collection.add(789);
        collection.add(752);

        Iterator<Integer> itInt = collection.iterator();

        while (itInt.hasNext()) {

            Integer nextInt = itInt.next();
            System.out.println("Element is - " + nextInt);
        }
    }

    public void howForeachWorksOnCollection() {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(12);
        collection.add(132);
        collection.add(56);
        collection.add(789);
        collection.add(752);

        for (Integer intEl : collection) {
            System.out.println("Element - " + intEl);
        }

        collection.forEach((Integer intEl) -> {
            System.out.println("Java 8 forech - " + intEl);
        });
    }

    public void whatIsSet() {

        //Set<String> setString = new HashSet<String>();
        Set<String> setString = new TreeSet<>();
        setString.add("android");
        setString.add("iOS");
        setString.add("rIM");
        setString.add("windows");
        setString.add("rIM");

        for (String str : setString) {
            System.out.println("String is - " + str);
        }
    }

    public void whatIsMap() {

        Map<Integer, String> mapString = new HashMap<>();
        mapString.put(1, "Android");
        mapString.put(2, "IOS");
        mapString.put(3, "Rim");
        mapString.put(4, "Windows");
        mapString.put(5, "Symbian");
        
        Set<Integer>setKeys = mapString.keySet();
        for(Integer key : setKeys){
            System.out.println("Key - "+key);
        }
        Collection<String> valueColl = mapString.values();
        for(String val : valueColl){
            System.out.println("Value - "+val);
        }
        
        String valOne = mapString.get(1);
        System.out.println("Val One - "+valOne);
        
        for (Map.Entry<Integer, String> entry : mapString.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key - "+key +" Value - "+value);
        }
    }
}
