package rvt;

import java.util.Scanner;

public class Piegades_parbaude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skrvju skaits: ");
        int skruves = Integer.valueOf(scanner.nextLine());

        System.out.print("Uzgrieznu skaits: ");
        int uzgriezni = Integer.valueOf(scanner.nextLine());

        System.out.print("Paplaksnu skaits: ");
        int paplaksnes = Integer.valueOf(scanner.nextLine());
        scanner.close();

        String parbaude = "";

        Integer cena = skruves * 5 + uzgriezni * 3 + paplaksnes * 1;

        if (uzgriezni >= skruves && paplaksnes * 2 >= skruves) {
            parbaude = "Pasūtījums ir kārtībā";
        }
        else if (uzgriezni < skruves) {
            parbaude = "Parbaudi pasutijumu: par maz uzgrieznu";
        }
        else if (paplaksnes * 2 < skruves) {
            parbaude = "Parbaudi pasutijumu: par maz paplaksnu";
        }
        else if (uzgriezni < skruves && paplaksnes * 2 < skruves) {
            parbaude = "Parbaudi pasutijumu: par maz uzgrieznu un par maz paplaksnu";
        }

        System.out.println(parbaude + "\n" + cena);

    }
}
