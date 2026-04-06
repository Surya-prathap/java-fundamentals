package com.java.fundamentals;

public class Operators {
    static void main(String[] args) {
        // Assignment Operator ( = )
        byte no1 = 100;
        byte no2;
        no2 = no1;
        System.out.println(no2);
        int res = 10 + (20 - 30) * 40 / 50 % 60;
        System.out.println(res);

        int num1 = 10;
        int num2 = 20;
        int ans = --num1 + ++num1 - num1-- + num1++ - --num2 + ++num2;
        System.out.println(ans);
        System.out.println(num1);
        System.out.println(num2);



        if (num1 >= 10 && num2 <= 20){
            System.out.println("Hello");
        }
        if (num1 <= 15 || num2 < 20){
            System.out.println("welcome");
        }
    }
}
