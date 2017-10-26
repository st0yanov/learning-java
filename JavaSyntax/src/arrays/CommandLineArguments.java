package arrays;

public class CommandLineArguments {
    public static void main(String[] args) {
        if(args.length >= 2) {
            System.out.println("First argument: " + args[0]);
            System.out.println("Second argument: " + args[1]);
        } else {
            System.out.println("At least two arguments are required.");
        }
    }
}
