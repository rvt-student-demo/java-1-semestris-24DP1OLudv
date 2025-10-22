package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JMArray {
    public static void main(String[] args) {
        RemoveLast(new ArrayList<String>());
    }


    public static void OnlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int numberInp = 0;

        System.out.println("Ievadiet skaitlus:");
        while (true) {
            numberInp = Integer.valueOf(scanner.nextLine());
            if (numberInp != -1) {
                list.add(numberInp);
            } else {
                break;
            }
        }
        System.out.print("No kurienes? ");
        int no = Integer.valueOf(scanner.nextLine());
        System.out.print("Lidz kurienei? ");
        int lidz = Integer.valueOf(scanner.nextLine());

        for (int i = no; i <= lidz; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void ListSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Ievadiet vardus: ");
        while (true) {
            String nameInp = String.valueOf(scanner.nextLine());
            if (nameInp == "") {
                break;
            } else {
                list.add(nameInp);
            }
        }
        int total = list.size();
        System.out.print("In total: " + total);
    }

    public static void OnTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Ievadiet vardus: ");
        while (true) {
            String nameInp = String.valueOf(scanner.nextLine());
            if (nameInp == "") {
                break;
            } else {
                list.add(nameInp);
            }
        }
        System.out.println(list);
        System.out.print("Kadu vardu just meklejat? ");
        String search = String.valueOf(scanner.nextLine());

        if (list.contains(search) == true) {
            System.out.println(search + " tika atrasts!");
        } else {
            System.out.println(search + " netika atrasts!");
        }

    }

    public static void RemoveLast(ArrayList<String> strings) {
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);
        RemoveMethod(strings);
        RemoveMethod(strings);
        System.out.println(strings);
    }

    public static void RemoveMethod(List<?> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }

}
