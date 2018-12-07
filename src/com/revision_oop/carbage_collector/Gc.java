package com.revision_oop.carbage_collector;

public class Gc {



    public static void  main (String[] args ){
        // get the current runtime assosiated with this process
        Runtime run = Runtime.getRuntime();
        // print the current free memory for this runtime
        System.out.println("memory free : " + run.freeMemory()/(1024* 3));
        System.out.println("memory free : " + Runtime.getRuntime().totalMemory()/(1024* 3));
        // check the number of processors available
        System.out.println("" + Runtime.getRuntime().availableProcessors());
    }
}
