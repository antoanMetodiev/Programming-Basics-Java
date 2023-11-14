import java.util.Scanner;
public class OddEvenSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;
        int counter = 0;
        for (int i = 0; i < n;  i++){

            int number = Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter % 2 == 0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }
        }

        if (evenSum == oddSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d\n",evenSum);
        }
        else{

            int diff = Math.abs(evenSum - oddSum);
            System.out.println("No");
            System.out.printf("Diff = %d\n",diff);
        }
    }
}
