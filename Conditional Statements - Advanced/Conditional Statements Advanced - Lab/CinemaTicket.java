import java.util.Scanner;
public class CinemaTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = (scanner.nextLine());

        int price = 0;
        if (day.equals("Monday")){
            price = 12;
        }
        else if (day.equals("Tuesday")){
            price = 12;
        }
        else if (day.equals("Wednesday")){
            price = 14;
        }
        else if (day.equals("Thursday")){
            price = 14;
        }
        else if (day.equals("Friday")){
            price = 12;
        }
        else if (day.equals("Saturday")){
            price = 16;
        }
        else if (day.equals("Sunday")){
            price = 16;
        }
        System.out.println(price);
    }
}
