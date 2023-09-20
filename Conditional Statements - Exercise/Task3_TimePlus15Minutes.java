import java.util.Scanner;
public class Task3_TimePlus15Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes += 15;

        if (minutes >= 60){
            hours++;
            minutes -= 60;
        }

        if (hours == 24){
            hours = 0;
        }

        if (minutes <= 9){
            System.out.printf("%d:0%d",hours,minutes );
        }
        else{
            System.out.printf("%d:%d",hours,minutes);
        }
    }
}
