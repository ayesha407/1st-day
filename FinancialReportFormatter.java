import java.util.Scanner;

public class FinancialReportFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        System.out.printf("%-20s %10.2f %8d\n", product, price, quantity);

        sc.close();
    }
}
