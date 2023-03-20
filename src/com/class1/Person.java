package com.class1;
import java.util.Scanner;

public class Person {
    String name;
    String email;
    int id;

    public void inputData(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter id: ");
        this.id = input.nextInt();

        System.out.println("Enter name: ");
        this.name = input.nextLine();

        System.out.println("Enter email: ");
        this.email = input.nextLine();



        System.out.println("Input completed!");
    }

    public void display(){
        System.out.println("Id " + this.id);
        System.out.println("Name " + this.name);
        System.out.println("Email " + this.email);

    }
}
