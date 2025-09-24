package rvt;

import java.util.Scanner;

public class INterneta_delikatesu_veikals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievad preci: ");
        String preces_nos = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        Double cena = Double.valueOf(scanner.nextLine());

        System.out.print("Ekspress piegāde (0==ne, 1==ja): ");
        Integer ekspress = Integer.valueOf(scanner.nextLine());

        Double maksa = 0.00;
        
        if (cena < 10) {
            maksa = 2.00;
        } 
        else if (cena >= 10) {
            maksa = 0.00;
        }

        if (ekspress == 1 && cena < 10) {
            maksa += 3.00;
        }
        else {
            maksa += 0.00;
        }

        Double kopa = cena + maksa;
        
        System.out.println("Rekins:\n   " + preces_nos + "  " + cena + "\n  piegade    " + maksa + "\n    kopa      " + kopa);

    }
}
