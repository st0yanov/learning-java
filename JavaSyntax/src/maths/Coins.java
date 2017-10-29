package maths;

public class Coins {
    public static void main(String[] args) {
        int top = 0, bottom = 0;

        for(int i = 0; i<10; i++) {
            if(Math.random() > 0.5) {
                top++;
            } else {
                bottom++;
            }
        }

        System.out.println("Top: " + top);
        System.out.println("Bottom: " + bottom);
    }
}
