package com.practiceapp;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        Calculate calculate=new Calculate();
        calculate.add();
    }
}

class Calculate {

    int n=10;
    int m=20;

    public void add() {
        int c=n+m;
        out.println(c);
    }
}
