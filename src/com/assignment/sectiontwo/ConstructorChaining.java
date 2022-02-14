package com.assignment.sectiontwo;

public class ConstructorChaining {
    public ConstructorChaining(int a,int b){
        this(5);
        System.out.println("Constructor with two parameters: "+a+" and "+b);
    }
    public ConstructorChaining(int number){
        System.out.println("Constructor with one parameter: "+number);
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining(2,3);
    }
}
