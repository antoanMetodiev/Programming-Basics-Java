import java.util.Scanner;
public class FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherCount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (season.equals("Spring")){
            price = 3000;
        }
        else if (season.equals("Summer")){
            price = 4200;
        }
        else if (season.equals("Autumn")){
            price = 4200;
        }
        else if (season.equals("Winter")){
            price = 2600;
        }

        if (fisherCount <= 6){
            price -= price * 0.10;
        }
        else if (fisherCount >= 7 && fisherCount <= 11){
            price -= price * 0.15;
        }
        else if (fisherCount >= 12){
            price -= price * 0.25;
        }

        if (fisherCount % 2 == 0 && (!season.equals("Autumn"))){
            price -= price * 0.05;
        }

        if (groupBudget >= price){
            double leftMoney = (double)groupBudget - price;
            System.out.printf("Yes! You have %.2f leva left.",leftMoney);
        }
        else {
            double neededMoney = price - groupBudget;
            System.out.printf("Not enough money! You need %.2f leva.",neededMoney);
        }
    }
}
