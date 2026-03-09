import java.util.Scanner;

public class DyanamicDataTypeReporter  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        if(s.equalsIgnoreCase("true")||s.equalsIgnoreCase("false"))
        {
            System.out.println("Boolean");
        }
        else
            try{
        Integer.parseInt(s);
        System.out.println("Integer");
        }
        catch(Exception e){
            try{
                Double.parseDouble(s);
                System.out.println("Double");
            }
            catch(Exception ex){
                System.out.println("String");
            }
        }
    }
    
}
/*
Sample Input 1:
true
Sample Output 1:
Boolean

Sample Input 2:
123
Sample Output 2:
Integer

Sample Input 3:
3.14
Sample Output 3:
Double

Sample Input 4:
hello
Sample Output 4:
String

Sample Input 5:
123abc
Sample Output 5:
String
 */
