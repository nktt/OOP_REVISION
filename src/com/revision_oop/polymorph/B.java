package com.revision_oop.polymorph;

public class B   extends A  implements I  {

    @Override
    public void  print(){
     System.out.println("from B");
    }
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    @Override
    public B div (){
        return this ;
    }
    //override can change return type
}
