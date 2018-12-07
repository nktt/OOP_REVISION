package com.revision_oop.passby_value;

public class StringImmutable {


    public static void main(String[] args) {

       /* String name = "cheikh" ;
        System.out.println(name);
        //changeString(name);
        String s ="cheikh";
        System.out.println(name.hashCode());
        System.out.println(s.hashCode());
        System.out.println(Integer.toHexString(System.identityHashCode(name)));
        System.out.println(Integer.toHexString(System.identityHashCode(s)));
        String a = new String("cheikh");
        System.out.println(Integer.toHexString(System.identityHashCode(a)));

        changeString(name);*/
        int A = 4 ;
        System.out.println(Integer.toHexString(System.identityHashCode(A)));
        A = 4 ;
        Integer h  ;

        System.out.println(Integer.toHexString(System.identityHashCode(A)));
    }


    public static  void  changeString(String toChange) {
        toChange = "changed" ;

        System.out.println(toChange.hashCode());
    }
}
