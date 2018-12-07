package com.revision_oop.collections;

public class Data_structure {

    public static void main(String []args){
        System.out.println("Hello World");
        flip(new int[]{1,3,2,5,4}, 5);



    }

    static  void flip (int[] arr, int  k){

        int temp =0;
        if( arr== null || arr.length <2 ){

            return ;
        }

        System.out.print("--------------------- BEFORE----------------------");
        System.out.print("{ ");
        for( int i = 0 ; i <arr.length ; i++){

            System.out.print( arr[i]+" ,");

        }
        System.out.println(" }");
        for( int i = 0 ; i < k/2 ; i++){
            System.out.println("before flipping :");
            System.out.println("arr["+i+"] = "+ arr[i] +"  arr["+(k-i-1)+"] = "+ arr[k-i-1]);
            temp = arr[i];
            arr[i]= arr[k-i-1];
            arr[k-i-1] = temp;
            System.out.println("after flipping :");
            System.out.println("arr["+i+"] = "+ arr[i] +"  arr["+(k-i-1)+"] = "+ arr[k-i-1]);

            System.out.print("--------------------- AFTER ----------------------");
            System.out.print("{ ");
            for( int o = 0 ; o < arr.length ; o++){

                System.out.print( arr[o]+" ,");

            }
            System.out.println(" }");

        }

    }
}
