package homework1;

import java.util.Scanner;
 // Write a Java program to check whether a given number is even or odd.
public class OddOrEven {
    public static void main(String[] args) {

        System.out.println("Input a number to check if it is odd or even: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder = number % 2;

        if (remainder == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("number is odd");
        }

    }
}
