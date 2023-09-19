import java.util.Scanner;
public class Task8_BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearPrice = Integer.parseInt(scanner.nextLine());

        double shoes = yearPrice * 0.60;
        double dress = shoes * 0.80;
        double ball  = dress * 1/4;
        double accessories  = ball * 1/5;
        double totalPrice = shoes + dress + ball + accessories + yearPrice;

        System.out.println(totalPrice);
    }
}
