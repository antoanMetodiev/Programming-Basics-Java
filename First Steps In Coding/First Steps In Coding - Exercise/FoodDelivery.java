import java.util.Scanner;
public class FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chicken = Double.parseDouble(scanner.nextLine()) * 10.35;
        double fish = Double.parseDouble(scanner.nextLine()) * 12.40;
        double vegetarian = Double.parseDouble(scanner.nextLine()) * 8.15;

        double totalPrice = chicken + fish + vegetarian;
        totalPrice += totalPrice * 0.20;
        totalPrice += 2.50;

        System.out.println(totalPrice);
    }
}
