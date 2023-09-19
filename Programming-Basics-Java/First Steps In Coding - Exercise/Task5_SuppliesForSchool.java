import java.util.Scanner;
public class Task5_SuppliesForSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pensils = Double.parseDouble(scanner.nextLine()) * 5.80;
        double markers = Double.parseDouble(scanner.nextLine()) * 7.20;
        double preparation = Double.parseDouble(scanner.nextLine()) * 1.20;
        double discountProccent = Double.parseDouble(scanner.nextLine());

        double allProducts = pensils + markers + preparation;
        allProducts -= (allProducts * discountProccent) / 100;

        System.out.println(allProducts);
    }
}
