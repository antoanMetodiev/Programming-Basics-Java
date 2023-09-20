import javax.security.sasl.SaslClient;
import java.util.Scanner;
public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int onlySpend = 0;
        int daysCounter = 0;
        while (true){

            String command = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if (command.equals("save")){

                onlySpend = 0;
                availableMoney += sum;
            }
            else if (command.equals("spend")){

                onlySpend++;
                availableMoney -= sum;
                if (availableMoney < 0){
                    availableMoney = 0;
                }

            }
            if (onlySpend == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d\n", daysCounter);
                return;
            }

            if (availableMoney >= neededMoney){
                System.out.printf("You saved the money for %d days.", daysCounter);
                break;
            }
        }
    }
}
