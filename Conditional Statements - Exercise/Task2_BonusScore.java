import java.util.Scanner;
public class Task2_BonusScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (num <= 100){
            bonusPoints = 5;
        }
        else if (num > 100 && num < 1000){
            bonusPoints = num * 0.20;
        }
        else if (num > 1000 ){
            bonusPoints = num * 0.10;
        }

        if (num % 2 == 0){
            bonusPoints += 1;
        }
        else if (num % 10 == 5){
            bonusPoints += 2;
        }
        double totalPoints = num + bonusPoints;
        System.out.println(bonusPoints);
        System.out.println(totalPoints);
    }
}
