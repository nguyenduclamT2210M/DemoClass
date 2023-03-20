package com.class1;
import java.util.Studen;

public class Studen{
    int id;
    String name;
    String email;


    public void inputData(){
        Studen input = new Studen();

        System.out.println("Enter id: ");
        this.id = input.nextInt();

        System.out.println("Enter name: ");
        this.name = input.nextLine();

        System.out.println("Enter email: ");
        this.email = input.nexLine();



        System.out.println("Input completed!");
    }

    public void display(){
        System.out.println("Id " + this.id);
        System.out.println("Name " + this.name);
        System.out.println("Email " + this.email);

    }
}
