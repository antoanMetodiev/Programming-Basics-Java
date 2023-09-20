import java.util.Scanner;
public class LunchBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int totalBreakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = (double)totalBreakTime * 1/8;
        double breakTime = (double)totalBreakTime * 1/4;
        double totalTime = totalBreakTime - (lunchTime + breakTime);

        if (totalTime >= episodeTime){
            totalTime -= episodeTime;
            totalTime = Math.ceil(totalTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",seriesName,totalTime);
        }
        else {
            totalTime = Math.ceil(episodeTime - totalTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",seriesName,totalTime);
        }
    }
}
