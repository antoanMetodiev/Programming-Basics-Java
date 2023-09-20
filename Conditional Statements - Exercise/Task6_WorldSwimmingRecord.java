import java.util.Scanner;
public class Task6_WorldSwimmingRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double rastoqnieInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double totalSekonds = rastoqnieInMeters * timeInSeconds;
        int lateInSekonds = (int)rastoqnieInMeters / 15;
        double news = lateInSekonds * 12.5;
        Double totalTime = totalSekonds + news;

        if (totalTime < recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.\n",totalTime);
        }
        else if (totalTime >= recordInSeconds ){
           totalTime -= recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.\n",totalTime);
        }
    }
}
