import java.util.Scanner;
public class Task9_YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPlace = Double.parseDouble(scanner.nextLine());

        double totalPrice = totalPlace * 7.61;
        double discount = totalPrice * 0.18;
        totalPrice -= discount;

        System.out.printf("The final price is: %.2f lv.\n",totalPrice);
        System.out.printf("The discount is: %.2f lv.\n",discount);
    }
}
