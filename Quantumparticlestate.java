import java.util.Scanner;

public class Quantumparticlestate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long bit4 = (n >> 4) & 1;
        long bit16 = (n >> 16) & 1;
        long bit32 = (n >> 32) & 1;

        System.out.println(bit4);
        System.out.println(bit16);
        System.out.println(bit32);

        sc.close();
    }
}
