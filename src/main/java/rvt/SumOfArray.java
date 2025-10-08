package rvt;

public class SumOfArray {
    public static void main(String[] args) {
        int[] temp = {5, 5, 5, 5, 5}; 
        sumOfNumbersInArray(temp);
    }
    public static int sumOfNumbersInArray(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        System.out.println(summa);
        return summa;
    }
}
