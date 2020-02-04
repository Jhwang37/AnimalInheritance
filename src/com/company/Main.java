package com.company;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());//Overriding method from parents class
        print(c.sleep());//Overriding method from parents class
        print(c.purr());//new method


        Bird b = new Bird();
        print(b.eat());//Overriding method from parents class
        print(b.sleep());//Overriding method from parents class
        print(b.fly());//new method

    }

    private static void print(String s) {
        System.out.println(s);
    }
}

