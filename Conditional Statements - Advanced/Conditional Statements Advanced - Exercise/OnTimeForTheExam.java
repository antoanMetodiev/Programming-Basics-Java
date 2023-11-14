import java.util.Scanner;
public class OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int totalExamTime = (examHour * 60) + examMinutes;
        int totalArriveTime = (arriveHour * 60) + arriveMinutes;

        if (totalArriveTime > totalExamTime) {

            if ((totalArriveTime - totalExamTime) >= 60) {

                totalArriveTime -= totalExamTime;
                int inHour = totalArriveTime / 60;
                int inMunutes = totalArriveTime % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", inHour, inMunutes);
                return;
            }
            totalArriveTime -= totalExamTime;
            System.out.println("Late");
            System.out.printf("%d minutes after the start", totalArriveTime);
        } else if (totalArriveTime == totalExamTime || (totalExamTime - totalArriveTime) <= 30) {

            if (totalArriveTime == totalExamTime) {
                System.out.println("On time");
            } else if ((totalExamTime - totalArriveTime) <= 30) {

                totalExamTime -= totalArriveTime;
                System.out.println("On time");
                System.out.printf("%d minutes before the start", totalExamTime);
            }
        } else if ((totalExamTime - totalArriveTime) > 30) {

            if ((totalExamTime - totalArriveTime) >= 60) {

                totalExamTime -= totalArriveTime;
                int inHour = totalExamTime / 60;
                int inMunutes = totalExamTime % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", inHour, inMunutes);
            } else {

                totalExamTime -= totalArriveTime;
                System.out.println("Early");
                System.out.printf("%d minutes before the start", totalExamTime);
            }
        }
    }
}
