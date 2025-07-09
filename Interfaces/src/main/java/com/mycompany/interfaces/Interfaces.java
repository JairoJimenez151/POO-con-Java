package com.mycompany.interfaces;

import java.util.function.Predicate;


public class Interfaces {

    public static void main(String[] args) {
       
        
//        Prueba f = (a) -> {System.out.println(a);};
        Prueba f = a -> System.out.println(a);
        f.run("a");
        Prueba1 l = System.out::println;
        l.run("g");
        Integer a=8;
        Predicate<Integer> p = b->b>10;//Uso interface Predicate
        System.out.println(p.test(a));
    }
}

@FunctionalInterface
interface Prueba{
    void run(String a);
}
@FunctionalInterface
interface Prueba1{
    void run(String a);
}