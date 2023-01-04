package Intellij.debug;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scanner.nextInt();
        System.out.println("Please Enter your name");
        String name=scanner.nextLine();
        System.out.println("Your name is "+name+" your age is "+age);
    }
}
