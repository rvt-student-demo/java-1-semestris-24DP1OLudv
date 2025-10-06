package rvt;

import java.util.Scanner;

public class FromOneToParameter {
    public static void main(String[] args) {
        printUntilNumber(0);
    }

    

    public static void printUntilNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet skaitli: ");
        int reizes = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i < reizes + 1; i++) {
            System.out.println(i);
        }
    }
}
