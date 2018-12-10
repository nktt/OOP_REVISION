package com.revision_oop.string;

public class stringVsbuffer {

    public static String concatWithString()    {
        String t = "Java";
        for (int i=0; i<10000; i++){
            t = t + "Tpoint";
        }
        return t;
    }
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        return sb.toString();
    }
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");


        StringBuffer sb7 = new StringBuffer("cheikh");
        StringBuffer sb8 = new StringBuffer("cheik");
        /**
         * because buffer does not override equals methode so it will return false always .
         */
        if(sb7.equals(sb8)){
            System.out.println("true");
        }else {
            System.out.println("false ");
        }
    }


}
