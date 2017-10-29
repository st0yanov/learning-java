package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("How many random nums do you want to print?");
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Random number " + i + " is " + Math.random());
        }
    }
}
