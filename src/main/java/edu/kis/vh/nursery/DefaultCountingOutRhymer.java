package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUM = 12;
    private static final int TOTAL = -1;
    private static final int FULL = 11;

    private int[] numbers = new int[NUM];

    public int total = TOTAL;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
