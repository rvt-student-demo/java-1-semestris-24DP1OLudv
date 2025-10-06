package rvt;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(-3, 6);
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i < end + 1; i++) {
            if (i % 3 == 0) {
                if (i == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
