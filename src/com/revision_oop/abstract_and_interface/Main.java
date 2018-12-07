package com.revision_oop.abstract_and_interface;


import java.util.Arrays;

public class Main {


    public static void main(String args[]) {

       // System.out.print(swap("converse", "conserve", 1));
       // System.out.print(swap("aabbccdd", "ddbbccaa", 3));
       System.out.print(swap("aabbcrdd", "ddbbchaa", 3));
       System.out.println("-------------------- other ---------------------");
       System.out.print(checkIfSwappable("aabbcrdd", "ddbbchaa", 3));
   
    }

    public static boolean swap(String S, String t, int k) {


        StringBuilder comparabaleString  = new StringBuilder(S);

         int count =0;

        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) != t.charAt(i)) {

                comparabaleString.setCharAt(i, t.charAt(i));

                count++;

            }

        }


System.out.println(comparabaleString.toString());
System.out.println(t.toString());
System.out.println(t.equals(comparabaleString.toString()));
        if(((count/2) <= k) && (t.equals(comparabaleString.toString()))) return true ;

        return  false ;

    }

    static  boolean checkIfSwappable(String s, String t, int k) {
        StringBuilder sDiff = new StringBuilder(), tDiff = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                sDiff.append(s, i, i + 1);

                tDiff.append(t, i, i + 1);
            }
        }

        // times 2 due to one character swap generating two differences
        return sDiff.length() <= k * 2 && sDiff.chars().sum() == tDiff.chars().sum();
    }



}
