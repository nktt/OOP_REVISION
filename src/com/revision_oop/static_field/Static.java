package com.revision_oop.static_field;

public class Static {

    static  int  staticField = 0  ;

    public static void main(String args []){

             Static d = new Static();
        d.staticField =4 ; // not effient way , should not be changed because it is shared data betwwen onjects .
        System.out.println(d.staticField);
        /*-----------------------------------------------------*/
        //Test nonstatic = new Test().new InnerNonStatic();


        Test staticobj = new Test.Innnerstatic();
        ((Test.Innnerstatic) staticobj).Teststatic();



       // Test.call();


    }
}
