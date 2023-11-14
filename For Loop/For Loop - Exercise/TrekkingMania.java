import java.util.Scanner;
public class TrekkingMania {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int countOfMusala = 0;
        int countOfMondblan = 0;
        int countOfKilimandjaro = 0;
        int countOfK2 = 0;
        int countOfEverest = 0;
        int totalPeople = 0;
        for (int i = 1;  i <= n;  i++){

            int countPeople = Integer.parseInt(scanner.nextLine());
            totalPeople += countPeople;
            if (countPeople <= 5) {
                countOfMusala += countPeople;
            }
            else if (countPeople >= 6 && countPeople <= 12){
                countOfMondblan += countPeople;
            }
            else if (countPeople >= 13 && countPeople <= 25) {
                countOfKilimandjaro += countPeople;
            }
            else if (countPeople >= 26 && countPeople <= 40) {
                countOfK2 += countPeople;
            }
            else if (countPeople >= 41) {
                countOfEverest += countPeople;
            }
        }
        double proccentMusala = ((double)countOfMusala / totalPeople) * 100;
        double proccentMondblan = ((double)countOfMondblan / totalPeople) * 100;
        double proccentKilimandjaro = ((double)countOfKilimandjaro / totalPeople) * 100;
        double proccentK2 = ((double)countOfK2 / totalPeople) * 100;
        double proccentEverest = ((double)countOfEverest / totalPeople) * 100;

        System.out.printf("%.2f%%\n",proccentMusala);
        System.out.printf("%.2f%%\n",proccentMondblan);
        System.out.printf("%.2f%%\n",proccentKilimandjaro);
        System.out.printf("%.2f%%\n",proccentK2);
        System.out.printf("%.2f%%\n",proccentEverest);
    }
}
