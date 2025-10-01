package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex3(scanner);    
    }

    public static void ex1(Scanner scanner) {

        System.out.println("Ievadi saakumu:");
        
        int sakums = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi pedejo skaitli:");
        int beigas = Integer.valueOf(scanner.nextLine());

        System.out.println();
        sakums += beigas > sakums ? -1 : 0; sakums += beigas < sakums ? 1 : 0;
       for (int i = sakums; beigas > sakums ? i < beigas : i > beigas; ) {
            if (i > beigas) {
                i--;
            }
            else {
                i++;
            }
            System.out.println(i);
       } 

    }

    public static void ex2(Scanner scanner) {
        System.out.println("Ievadiet N:");
        int skait = Integer.valueOf(scanner.nextLine());
        int skaitit = 0;
        int sum = (skait*(skait+1))/2;

        for (int i = 1; i < skait + 1; i++) {
            skaitit += i;
        }
        System.out.println("Loop Sum = " + skaitit);
        System.out.println("Formula Sum = " + sum);

    }

    public static void ex3(Scanner scanner) {
        System.out.println("Ievadiet N:");
        int skait = Integer.valueOf(scanner.nextLine());
        int skaitit = 0;
        int sum = (skait*(skait+1)*(2*skait+1))/6;

        for (int i = 1; i < skait + 1; i++) {
            skaitit += i*i;
        }

        System.out.println("Loop Sum = " + skaitit);
        System.out.println("Formula Sum = " + sum);
    }

    public static void ex4(Scanner scanner) {
        
    }
}
