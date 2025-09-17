package rvt;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ieraksti pirmo skaitli:");
        int pirm_skait = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadiet otro skaitli:");
        int otr_skait = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadiet treso skaitli:");
        int tre_skait = Integer.valueOf(scanner.nextLine());
        scanner.close();

        double videjais = Double.valueOf((pirm_skait + otr_skait + tre_skait) / 3.0);

        System.out.println("Videjais skaitlis ir " + videjais);
    }
}
