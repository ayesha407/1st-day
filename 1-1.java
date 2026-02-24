
import java.math.BigInteger;
import java.util.Scanner;

public class GalacticPopulationCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter population of Planet 1: ");
        BigInteger p1 = sc.nextBigInteger();

        System.out.print("Enter population of Planet 2: ");
        BigInteger p2 = sc.nextBigInteger();

        System.out.print("Enter population of Planet 3: ");
        BigInteger p3 = sc.nextBigInteger();

        BigInteger total = p1.add(p2).add(p3);

        System.out.println("Total Galactic Population: " + total);

        sc.close();
    }
}
