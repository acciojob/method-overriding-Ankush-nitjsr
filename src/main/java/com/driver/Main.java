package com.driver;

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        String answer;
        answer = objA.meth();
        System.out.println(answer);

        B objB = new B();
        String updatedAnswer;
        updatedAnswer = objB.meth();
        System.out.println(updatedAnswer);

    }
}