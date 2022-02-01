package com.yacques.kalkulator;

class Calculator {
    public double addition(double a, double b){
        return a + b;
    }
    public double subtraction(double a, double b){
        return b - a;
    }
}
class Application {
    public static void main(String[] args){
        Calculator machine = new Calculator();
        double a = 7;
        double b = 9;
        double result1 = machine.addition(a, b);
        double result2 = machine.subtraction(b, a);
        System.out.println("The result of the addition is: " + result1);
        System.out.println("The result of the subtraction is: " + result2);
    }

}