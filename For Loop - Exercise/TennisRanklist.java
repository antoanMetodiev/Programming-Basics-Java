import java.util.Scanner;
public class TennisRanklist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int beginPoints = Integer.parseInt(scanner.nextLine());

        int winsCounter = 0;
        int points = 0;
        for (int i = 1;  i <= n ;  i++){

            String etap = scanner.nextLine();
            if (etap.equals("W")){
                winsCounter++;
                points += 2000;
            }
            else if (etap.equals("F")){
                points += 1200;
            }
            else if (etap.equals("SF")){
                points += 720;
            }
        }
        double finalPoints = points + beginPoints;
        double averagePoints = Math.floor((double)points / n);
        double winsPerProccent = ((double)winsCounter / n) * 100;

        System.out.printf("Final points: %.0f\n", finalPoints);
        System.out.printf("Average points: %.0f\n",averagePoints);
        System.out.printf("%.2f%%\n",winsPerProccent);
    }
}
