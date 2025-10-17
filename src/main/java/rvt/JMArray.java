package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArray {
    public static void main(String[] args) {
        OnlyTheseNumbers();
    }

    public static void OnlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int numberInp = 0;

        System.out.println("Ievadiet skaitlus:");
        while (true){
            numberInp = Integer.valueOf(scanner.nextLine());
            if (numberInp != -1) {
                list.add(numberInp);
            }
            else {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        scanner.close();
    }
}

