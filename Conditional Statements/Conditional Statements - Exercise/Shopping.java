import java.util.Scanner;
public class Shopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double videocardsPrice = videocards * 250;
        double processorsPrice = (videocardsPrice * 0.35) * processors;
        double ramMemoryPrice = (videocardsPrice * 0.10) * ramMemory;
        double totalPrice = ramMemoryPrice + processorsPrice + videocardsPrice;

        if (videocards > processors){
            totalPrice -=  totalPrice * 0.15;
        }

        if (budget >= totalPrice){
            budget -= totalPrice;
            System.out.printf("You have %.2f leva left!\n", budget);
        }
        else{
            totalPrice -= budget;
            System.out.printf("Not enough money! You need %.2f leva more!\n", totalPrice);
        }
    }
}
