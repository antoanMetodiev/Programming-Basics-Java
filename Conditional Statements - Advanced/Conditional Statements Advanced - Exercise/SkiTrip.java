import java.util.Scanner;
public class SkiTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysCount = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String star  = scanner.nextLine();

        int price = 0;
        double discount = 0;
        daysCount -= 1;
        if (room.equals("room for one person")){
            price = 18;
        }
        else if (room.equals("apartment")){

            price = 25;
            if (daysCount < 10){
                discount = 0.30;
            }
            else if (daysCount >= 10 && daysCount <= 15){
                discount = 0.35;
            }
            else if (daysCount > 15){
                discount = 0.50;
            }
        }
        else if (room.equals("president apartment")){

            price = 35;
            if (daysCount < 10){
                discount = 0.10;
            }
            else if (daysCount >= 10 && daysCount <= 15){
                discount = 0.15;
            }
            else if (daysCount > 15){
                discount = 0.20;
            }
        }
        double totalPrice = price * daysCount;
        totalPrice -= totalPrice * discount;

        if (star.equals("positive")){
            totalPrice += totalPrice * 0.25;
        }
        else if (star.equals("negative")){
            totalPrice -= totalPrice * 0.10;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
