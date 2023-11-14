import java.util.Scanner;
public class Oscars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());

        boolean flag1 = false;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ;  i++){

            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            double lenght = judgeName.length();
            academyPoints += ((lenght * judgePoints)) / 2;
            if (academyPoints > 1250.5){

                flag1 = true;
                break;
            }
        }

        if (flag1){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!\n", actorName,academyPoints);
        }
        else{
            double neededPoints = 1250.5 - academyPoints;
            System.out.printf("Sorry, %s you need %.1f more!\n", actorName,neededPoints);
        }
    }
}
