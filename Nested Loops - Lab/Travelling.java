import java.util.Scanner;
public class Travelling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        while (!country.equals("End")){

            double spendSum = Double.parseDouble(scanner.nextLine());
            double allSum = 0;
            while (allSum < spendSum){
                double sum = Double.parseDouble(scanner.nextLine());
                allSum += sum;
            }
            if (allSum >= spendSum){
                System.out.printf("Going to %s!\n",country);
            }
            country = scanner.nextLine();
        }
    }
}
