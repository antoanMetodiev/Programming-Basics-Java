import java.util.Scanner;
public class Task4_ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int puzzelsCount = Integer.parseInt(scanner.nextLine());
        int doysCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        int totalToysCount = puzzelsCount + doysCount + bearsCount + minionsCount + truckCount;

        double puzzelsPrice = puzzelsCount * 2.60;
        double doysPrice = doysCount * 3;
        double bearsPrice = bearsCount * 4.10;
        double minionsPrice = minionsCount * 8.20;
        double truckPrice = truckCount * 2;

        double totalSum = puzzelsPrice + doysPrice + bearsPrice + minionsPrice + truckPrice;

        if (totalToysCount >= 50) {
            totalSum -= totalSum * 0.25;
        }

        totalSum -= totalSum * 0.10;
        if (totalSum >= price) {
            totalSum -= price;
            System.out.printf("Yes! %.2f lv left.\n", totalSum);
        } else if (price > totalSum) {
            price -= totalSum;
            System.out.printf("Not enough money! %.2f lv needed.\n", price);
        }
    }
}
