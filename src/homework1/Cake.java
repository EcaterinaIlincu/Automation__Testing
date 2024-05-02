package homework1;

import java.math.BigInteger;
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        System.out.println("How many people will come to the party? Input 2 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        BigInteger greatestCommonDivisor = BigInteger.valueOf(numb1).gcd(BigInteger.valueOf(numb2));
        System.out.println("gcd " + greatestCommonDivisor);
        int cakePieces = numb1 + numb2-greatestCommonDivisor.intValue();

        System.out.println("Minimum number of cake pieces: " + cakePieces);

    }
}
