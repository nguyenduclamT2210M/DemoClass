package com.asjhkda;

import java.io.File;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        FileManagement file = new FileManagement();


        System.out.println("============ Word Program =========");
        System.out.println("1. Count Word In File");
        System.out.println("2. Find File By Word");
        System.out.println("3. Exit");
        System.out.print("\nChoose menu: ");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        if(choose == 1){
            System.out.println("----------- Find File By Word ---------------");
            System.out.print("Enter Path: ");
            File a = new File(input.next());
            System.out.print("Enter Word: ");
            String b = input.next();
            try {
                file.getFile(a, b);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }else if(choose == 2){
            System.out.println("----------- Count Word ---------------");
            System.out.print("Enter Path: ");
            File a = new File(input.next());
            System.out.print("Enter Word: ");
            String b = input.next();
            try {
                String str = file.readFile(a);

                int count = file.countWord(a, b);
                if(count > 0) {
                    System.out.println(b + " found " + count + " times");
                } else  {
                    // System.out.println("Word not found");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
