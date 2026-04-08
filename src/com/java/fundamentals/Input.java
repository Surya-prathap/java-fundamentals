package com.java.fundamentals;

import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //byte
        System.out.print("Enter age: ");
        byte age = sc.nextByte();
        System.out.println("Age: " + age);

        //short
        System.out.print("Enter Marks: ");
        short marks = sc.nextShort();
        System.out.println("Marks: " + marks);

        //int
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        System.out.println("Salary: " + salary);

        //long
        System.out.print("Enter Ph No: ");
        long phoneNo = sc.nextLong();
        System.out.println("Phone Num: " + phoneNo);

        //float
        System.out.print("Enter discount Percentage: ");
        float discountPerentage = sc.nextFloat();
        System.out.println("Discount Percentage: " + discountPerentage);

        //double
        System.out.print("Enter Average Percentage: ");
        double avgeragePerentage = sc.nextDouble();
        System.out.println("Average Percentage: " + avgeragePerentage);

        //char
        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);
        System.out.println("Gender: " + gender);

        //boolean
        System.out.print("Is product Available (true / false): ");
        boolean isAvailable = sc.nextBoolean();
        System.out.println("Is Available: " + isAvailable);

        sc.close();
    }
}
