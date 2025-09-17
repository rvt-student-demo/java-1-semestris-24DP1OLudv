package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ieraksti pirmo skaitli:");
        int pirm_skait = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadiet otro skaitli:");
        int otr_skait = Integer.valueOf(scanner.nextLine());
        scanner.close();

        int summa = pirm_skait + otr_skait;

        System.out.println(pirm_skait + " + " + otr_skait + " = " + summa);
    }
}
