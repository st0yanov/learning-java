package loops;

public class Loops {
    public static void main(String[] args) {
        String[] words = { "This", "is", "a", "sentence" };
        listEntries(words);

        countUntil1(4);
        countUntil2(4);
        countUntil3(4);

    }

    public static void listEntries(String[] entries) {
        for(String entry: entries) {
            System.out.println(entry);
        }
    }

    public static void countUntil1(int max) {
        for(int i = 0; i < max; i++) {
            System.out.println(i);
        }
    }

    public static void countUntil2(int max) {
        int i = 0;
        while (i < max) {
            System.out.println(i);
            i++;
        }
    }

    public static void countUntil3(int max) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i < max);
    }
}
