import java.util.Scanner;
public class WeekendOrWorkingDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayFromWeek = (scanner.nextLine());

        if (dayFromWeek.equals("Monday") || dayFromWeek.equals("Tuesday")
                || dayFromWeek.equals("Wednesday") || dayFromWeek.equals("Thursday") || dayFromWeek.equals("Friday")){

            System.out.println("Working day");
        }
        else if (dayFromWeek.equals("Saturday") || dayFromWeek.equals("Sunday")){
            System.out.println("Weekend");
        }
        else{
            System.out.println("Error");
        }
    }
}
