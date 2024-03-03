package com.kodilla;

public class Calculator {

    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int add(){
        return a + b;
    }

    public int subtract(){
        return a - b;
    }

    public static void main(String[] args){

        Calculator calculator = new Calculator(19, 11);
        System.out.println(calculator.add());
    }
}
