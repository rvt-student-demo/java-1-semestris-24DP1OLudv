package rvt;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class randomio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minejumu = random.nextInt(1, 11);

        System.out.println("Es iedomasos skaitli no 1 - 10 \nTev tas jauzmin tris meginajumos. \nIevadi minejumu:");

        int skait = 0;
        Boolean p_minejums = false;

        for (int i = 0; i < 3; i++) {
            int ievade = Integer.valueOf(scanner.nextLine());


            if (ievade == minejumu) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvareejis!");
                p_minejums = true;
                break;
            }

            if (ievade != minejumu) {
                System.out.println("NEPAREIZI!");
            }

        }

        if (p_minejums != true) {
            System.out.println("Tu esi zaudeejis!");
        }

    }
}
