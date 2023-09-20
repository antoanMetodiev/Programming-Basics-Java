import java.util.Scanner;
public class CleverLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int priceForOneToy = Integer.parseInt(scanner.nextLine());
        int toysCount = 0;
        double money = 0;
        double allMoney = 0;

        for (int i = 1 ;  i <= n ;  i++) {

            if (i % 2 == 0) {
                money = money + 10;
                allMoney += money;
                allMoney -= 1;
            } else if (i % 2 != 0) {
                toysCount++;
            }
        }

        allMoney += priceForOneToy * toysCount;
        if (allMoney >= washerPrice){
            allMoney -= washerPrice;
            System.out.printf("Yes! %.2f\n",allMoney);
        }
        else{
            washerPrice -= allMoney;
            System.out.printf("No! %.2f\n", washerPrice);
        }
    }
}
