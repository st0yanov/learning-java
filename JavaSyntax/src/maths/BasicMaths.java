package maths;

public class BasicMaths {
    public static void main(String[] args) {
        System.out.println(1 + 1);
        System.out.println(50 * 2);
        System.out.println(100 / 50);
        System.out.println(5 % 4);
        System.out.println(5 % 6);

        int n = 10;
        n++;
        ++n;
        System.out.println(n);

        double eight = Math.pow(2, 3);
        System.out.println(eight);

        double almostZero = Math.sin(Math.PI);
        System.out.println(almostZero);

        double randomNumber = Math.random();
        System.out.println(randomNumber);
    }
}
