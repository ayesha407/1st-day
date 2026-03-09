import java.util.*;

public class Bytelevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int b1 = (n >> 24) & 0xFF;
        int b2 = (n >> 16) & 0xFF;
        int b3 = (n >> 8) & 0xFF;
        int b4 = n & 0xFF;

        int result = (b4 << 24) | (b3 << 16) | (b2 << 8) | b1;

        System.out.println(result);
        
        //Another method System.out.println(Integer.reverseBytes(n));
    }
}

/*
 Sample Input 1:
16909060
Sample Output 1:
67305985

Sample Input 2:
305419896
Sample Output 2:
2018915346
 */
