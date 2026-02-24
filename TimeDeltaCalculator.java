import java.util.*;

public class TimeDeltaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t1 = sc.nextLine();
        String t2 = sc.nextLine();

        String[] time1 = t1.split(":");
        String[] time2 = t2.split(":");

        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        int s1 = Integer.parseInt(time1[2]);

        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        int s2 = Integer.parseInt(time2[2]);

        int total1 = h1 * 3600 + m1 * 60 + s1;
        int total2 = h2 * 3600 + m2 * 60 + s2;

        int difference = Math.abs(total1 - total2);

        System.out.println(difference);

        sc.close();
    }
}
