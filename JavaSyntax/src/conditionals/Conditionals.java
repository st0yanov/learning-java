package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if(a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }

        if(a && b) {
            System.out.println("a && b");
        } else {
            System.out.println("!(a && b)");
        }

        if(a || b) {
            System.out.println("a || b");
        } else {
            System.out.println("!(a || b)");
        }
    }
}
