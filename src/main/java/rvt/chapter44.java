package rvt;

import java.util.Scanner;

public class chapter44 {
    public static void main(String[] args) {
        ex2();
    }
    
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = String.valueOf(scanner.nextLine());

        int start = name.indexOf(" ");

        String first_name = name.substring(0, start);

        String surname = name.substring(start);
        String uppercase = surname.toUpperCase();
        
        String complete_name = first_name.concat(uppercase);

        System.out.println(complete_name);
        scanner.close();
    }
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String echoing = String.valueOf(scanner.nextLine());

        int until = echoing.length();

        for (int i = 0; i < until; i++) {
            System.out.println(echoing.charAt(i));
        }
    }
    public static void ex3() {
        
    }
}
