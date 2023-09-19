import java.util.Scanner;
public class Task8_PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDogFood = Integer.parseInt(scanner.nextLine());
        int countCatFood = Integer.parseInt(scanner.nextLine());

        double catFoodPrice = countCatFood * 4;
        double dogFoodPrice = countDogFood * 2.50;
        double totalSum = catFoodPrice + dogFoodPrice;

        System.out.printf("%.2f lv.",totalSum);
    }
}
