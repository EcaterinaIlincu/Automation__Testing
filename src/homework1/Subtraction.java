package homework1;
// Two integers are given. How many times can the second number be subtracted from the first number?
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        System.out.println("Input two integers: ");
        Scanner scanner = new Scanner(System.in);

        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int result = numb1 / numb2;
        System.out.println(numb2 + " Can be subtracted from " + numb1 + " - " + result +" times");




    }
}
