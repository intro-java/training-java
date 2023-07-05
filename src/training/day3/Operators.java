package training.day3;

public class Operators {
    public static void main(String[] args) {
        int sum = 2;
        sum += 4;

        int a = sum++;

        int b = a + ++sum;

        int c = sum % 3;

        int d = c % (b + a);


    }
}
