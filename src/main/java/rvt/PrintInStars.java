package rvt;

public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    
    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < array[i]; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
