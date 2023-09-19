import java.util.Scanner;
public class Task9_FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int totalVolume = length * width * height;
        double liters = totalVolume * 0.001;
        double occupiedSpace = percent / 100;
        double neededLiters = liters * (1 - occupiedSpace);

        System.out.printf("%.5f%n", neededLiters);
    }
}
