import java.util.Scanner;
public class Task3_DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double realDiscount = (depositSum * discount) / 100;
        double dicountForMonth = realDiscount / 12;
        double totalSum = depositSum + (month * dicountForMonth);

        System.out.println(totalSum);
    }
}
