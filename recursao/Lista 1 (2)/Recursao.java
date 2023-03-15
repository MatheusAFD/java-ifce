package recursao;

public class Recursao {

    public static void main(String[] args) {
        incrementCounter(3);
        decrementCounter(3);
        incrementAndDecrementCounter(0, 3);
    }

    public static void incrementCounter(Integer numberToCount) {
        if (numberToCount == 0) {
            System.out.println(numberToCount);
        } else {
            incrementCounter(numberToCount - 1);
            System.out.println(numberToCount);
        }
    }

    public static void decrementCounter(Integer numberToCount) {
        if (numberToCount == 0) {
            System.out.println(numberToCount);
        } else {
            System.out.println(numberToCount);
            decrementCounter(numberToCount - 1);
        }
    }

    public static void incrementAndDecrementCounter(Integer start, Integer end) {
        if (end == 0) {
            System.out.println(end);
        } else if (start < end) {
            System.out.println(start);
            incrementAndDecrementCounter(start + 1, end);
        } else {
            System.out.println(end);
            incrementAndDecrementCounter(start, end - 1);
        }
    }
}