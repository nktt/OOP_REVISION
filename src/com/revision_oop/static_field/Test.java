package com.revision_oop.static_field;



public class Test   {

    int variable  =0 ;

    static  interface  K {

    }
   public  static abstract class d{

    }
        Test(){
        System.out.println(" static cons : ");
    }
    static  int  testValue  = 0  ;
    int nons ;
         private  static void call(){

           testValue += 1  ;


           System.out.println(" testvalue : "+testValue);


       }
     void accessStaticfromNonStatic(){
           call(); // yes we can acces static from no static area but not the opposite.
     }
     static void Test(){

        System.out.println("constructer ");
     }


       static  class Innnerstatic  extends Test  {

            static int i =0;
           static  void Teststatic(){


             System.out.println("constructer ");
         }
    }
         class InnerNonStatic  {

               void Testnostatic(){
                 call();

                System.out.println("constructer ");
            }




    }

}

