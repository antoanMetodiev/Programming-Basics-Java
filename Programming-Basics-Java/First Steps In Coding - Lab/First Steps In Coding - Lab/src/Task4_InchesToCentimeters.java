import java.util.Scanner;
public class Task4_InchesToCentimeters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inchesToCm = Double.parseDouble(scanner.nextLine()) * 2.54;

        System.out.println(inchesToCm);
    }
}
