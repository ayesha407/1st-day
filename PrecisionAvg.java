import java.util.Scanner;

public class PrecisionAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        double sum=0;

        for(int i=0;i<n;i++){
            sum+=Double.parseDouble(sc.next());
        }
        double avg=sum/n;
        System.out.printf("%.10f",avg);
    }
    
}
/*
Sample Input 1:
3
1.5
2.5
3.0
Sample Output 1:
2.3333333333

Sample Input 2:
4
10.0
20.0
30.0
40.0
Sample Output 2:
25.0000000000
 */
