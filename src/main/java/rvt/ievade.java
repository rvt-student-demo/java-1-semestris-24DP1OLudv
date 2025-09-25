package rvt;

import java.util.Scanner;

public class ievade {
    public static void main(String[] args) {
        int reizes = 0;
        int summa = 0;

        System.out.print("Ievadi skaitli: ");
        Scanner scanner = new Scanner(System.in);

        int jauta = Integer.valueOf(scanner.nextLine());
        while (jauta != 0) {
            System.out.print("Ievadi skaitli: ");
            jauta = Integer.valueOf(scanner.nextLine());  
            reizes++;
            summa += jauta;  
        } 
        System.out.println("Skaitlu skaitli: " + (reizes + 1));
        System.out.println("Skaitlu summa: " + summa);

    }
}
