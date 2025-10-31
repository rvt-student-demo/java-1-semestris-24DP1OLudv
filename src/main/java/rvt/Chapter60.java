package rvt;

public class Chapter60 {
    class Exercise5 {
        public static void main(String[] args) {
            int[] val = { 2, 6, 3, 8};
            int temp;

            System.out.println("Original Array: "
                    + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

            // reverse the order of the numbers in the array

            for (int i = 0; i < val.length / 2; i++) {
                temp = val[i];
                val[i] = val[val.length - (i + 1)];
                val[val.length - (i + 1)] = temp;
            }
            
            System.out.println("Reversed Array: "
                    + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
        }
    }
}
