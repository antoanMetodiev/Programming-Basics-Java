import java.util.Scanner;
public class AccountBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double totalSum = 0;

        while (!name.equals("NoMoreMoney")){

            double number = Double.parseDouble(name);
            if (number <= 0){
                System.out.println("Invalid operation!");
                System.out.printf("Total: %.2f",totalSum);
                break;
            }
            totalSum += number;
            System.out.printf("Increase: %.2f\n",number);
            name = scanner.nextLine();
        }
        if (name.equals("NoMoreMoney")){
            System.out.printf("Total: %.2f",totalSum);
        }
    }
}
