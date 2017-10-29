package strings;

public class Strings {
    public static void main(String[] args) {
        String sample = "Hello, World!";
        System.out.println(sample.toUpperCase());
        System.out.println(sample.toLowerCase());
        System.out.println(sample.contains("Hello"));
        System.out.println(sample.indexOf("World"));
        System.out.println(sample.indexOf("nope"));
    }
}
