
import java.util.Scanner;
import java.math.BigDecimal;

public class ScientificnotationParser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        BigDecimal bd = new BigDecimal(input);
        System.out.println(bd.toPlainString());
        sc.close();
    }
}
