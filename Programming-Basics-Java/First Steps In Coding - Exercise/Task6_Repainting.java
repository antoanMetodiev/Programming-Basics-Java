import java.util.Scanner;
public class Task6_Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double naylon = Double.parseDouble(scanner.nextLine()) * 1.50;
        double paint = Double.parseDouble(scanner.nextLine()) * 14.50;
        double thinner = Double.parseDouble(scanner.nextLine()) * 5.00;
        double hours = Double.parseDouble(scanner.nextLine());

        paint += paint * 0.10;
        naylon += 2 * 1.50;
        double totalPrice = naylon + paint + thinner + 0.40;
        totalPrice += (totalPrice * 0.30) * hours;

        System.out.println(totalPrice);
    }
}
