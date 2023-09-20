import java.util.Scanner;
public class NewHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;
        if (flowers.equals("Roses")){
            price = 5;
        }
        else if (flowers.equals("Dahlias")){
            price = 3.80;
        }
        else if (flowers.equals("Tulips")){
            price = 2.80;
        }
        else if (flowers.equals("Narcissus")){
            price = 3;
        }
        else if (flowers.equals("Gladiolus")){
            price = 2.50;
        }

        price = price * flowersCount;
        if (flowersCount > 80 && flowers.equals("Roses")){
            price -= price * 0.10;
        }
        else if (flowersCount > 90 && flowers.equals("Dahlias")){
            price -= price * 0.15;
        }
        else if (flowersCount > 80 && flowers.equals("Tulips")){
            price -= price * 0.15;
        }
        else if (flowersCount < 120 && flowers.equals("Narcissus")){
            price += price * 0.15;
        }
        else if (flowersCount < 80 && flowers.equals("Gladiolus")){
            price += price * 0.20;
        }

        if (budget >= price){
            double leftMoney = (double)budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowersCount,flowers,leftMoney);
        }
        else {
            double neededSum = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.",neededSum);
        }
    }
}
