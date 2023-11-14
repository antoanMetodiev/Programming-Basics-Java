import java.util.Scanner;
public class GodzillaVsKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statistCount = Integer.parseInt(scanner.nextLine());
        double statistDressCount = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;

        double dressPrice = statistCount * statistDressCount;

        if (statistCount > 150){
            dressPrice -= dressPrice * 0.10;
        }
        double totalPrice = dressPrice + decor;

        if (totalPrice > budget){
            totalPrice -= budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice);
        }
        else if (budget >= totalPrice){
            budget -= Math.abs(totalPrice);
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget);
        }
    }
}
