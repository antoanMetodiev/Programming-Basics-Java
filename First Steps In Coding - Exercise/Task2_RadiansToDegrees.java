import java.util.Scanner;
public class Task2_RadiansToDegrees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double radiansToDegrees = (radians * 180) / Math.PI;

        System.out.println(radiansToDegrees);
    }
}
