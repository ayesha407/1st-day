import java.util.Scanner;

public class DelimitedDataExtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[]data=str.split("\\|\\|");

       for(String field:data){
        System.out.println(field);
       }
    }
    
}
/*
Sample Input:
John||25||Hyderabad

Sample Output:
John
25
Hyderabad
 */
