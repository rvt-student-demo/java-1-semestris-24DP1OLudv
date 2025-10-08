package rvt;

import java.util.Scanner;


public class Swap {
    public static void main(String[] args) {
        int[] skaitli = {1, 3, 5, 7, 9};

        for (int i = 0; i < 5;) {
            System.out.println(skaitli[i]);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet 2 skaitlus: ");
        int mainit1 = Integer.valueOf(scanner.nextLine());
        int mainit2 = Integer.valueOf(scanner.nextLine());

        int temp = skaitli[mainit1];
        skaitli[mainit1] = skaitli[mainit2];
        skaitli[mainit2] = temp;
      
        System.out.println();
        for (int i = 0; i < 5;) {

            System.out.println(skaitli[i]);
            i++;
        }
        scanner.close();

        
    }
}
