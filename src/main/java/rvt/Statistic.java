package rvt;

public class Statistic {
    private int count;
    private int sum;
    private int videjs;

    public Statistic() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        // write code here
        count++;
        sum += number;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return videjs = sum / count;
    }


}
