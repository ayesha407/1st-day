import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            String line=sc.nextLine();
            if(line.equals("END"))
                break;

            for(int i=0;i<line.length();i++){
                sum+=line.charAt(i);
            }
        }
        System.out.println(sum);
    }
    
}

/*
Sample Input 1:
Hello
World
END
Sample Output 1:
1020

Sample Input 2:
ABC
END
Sample Output 2:
198
 */
