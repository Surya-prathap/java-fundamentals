package com.java.fundamentals;

public class Primitives {
    public static void main(String[] args) {

        // BYTE
        byte age;
        byte subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;
        age = 100;
        subject1Marks = 70;
        subject2Marks = 75;
        subject3Marks = 80;
        subject4Marks = 85;
        subject5Marks = 90;
        System.out.println("Age: " + age);
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
        System.out.println("Subject 3 Marks: " + subject3Marks);
        System.out.println("Subject 4 Marks: " + subject4Marks);
        System.out.println("Subject 5 Marks: " + subject5Marks);
        System.out.println("Subject 1 Marks: " + subject1Marks + ", Subject 2 Marks: " + subject2Marks + ", Subject 3 Marks: " + subject3Marks + ", Subject 4 Marks: " + subject4Marks + ", Subject 5 Marks: " + subject5Marks);

        //SHORT
        short totalMarks = 350;
        System.out.println("Total Marks: " + totalMarks);

        short manufacturingYear = 2022;
        short expiryDays = 10;
        System.out.println("Manufacturing Year: " + manufacturingYear + ", Days in Expiry: " + expiryDays);


        //INT
        //salary,otp,price
        int productPrice = 99999;
        int salary = 50000;
        int otp = 446378;
        System.out.println("Price: " + productPrice);
        System.out.println("Salary: " + salary);
        System.out.println("OTP: " + otp);


        //LONG
        long mobileNumber = 9908129796L;
        long aadharNumber = 741873007986L;
        System.out.println("Mobile Number: " + mobileNumber + ", Aadhar Number: " + aadharNumber);

        //FLOAT
        float pi = 3.14f;
        float percentage = 88.32f;
        System.out.println("PI: " + pi);
        System.out.println("Percentage: " + percentage);


        //DOUBLE
        double distance = 976.5;
        System.out.println("Distance: " + distance + "km");

        //CHAR
        char gender = 'M';
        System.out.println("Gender: " + gender);

        //BOOLEAN
        boolean isStudent = true;
        System.out.println("Is Student: " + isStudent);
    }
}
