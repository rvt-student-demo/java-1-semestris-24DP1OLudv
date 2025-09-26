package rvt;

import java.util.Scanner;

public class Repeating_breaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ieraksti skaitli: ");
        int skait = 0; 
        int summa = 0;
        int skaitli = 0;
        int videj = 0;
        int even = 0;
        int odd = 0;

        while (true) { 
            skait = Integer.valueOf(scanner.nextLine());
            if (skait == -1) {
                break;
            }
            summa += skait;
            skaitli++;
            videj += skait;
            if (skait % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + summa);
        System.out.println("Skaitli: " + skaitli);
        System.out.println("Videjais: " + (videj / skaitli));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
