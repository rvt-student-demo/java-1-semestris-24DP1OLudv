package rvt;

import java.util.Scanner;

public class chapter44 {
    public static void main(String[] args) {
        ex1();
    }
    
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = String.valueOf(scanner.nextLine());

        int start = name.indexOf(" ");
        int last = name.lastIndexOf(name);
        String uppercase = name.substring(start, last);
        uppercase.toUpperCase();
        String first_start = name.substring(1, start);

        String final_name = first_start.concat(uppercase);

        System.out.println(name);
        
    }
}
