import java.util.Scanner;
public class HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;

        int totalSum = 0;
        for (int i = 1;  i<= n;  i++){

            int number = Integer.parseInt(scanner.nextLine());
            totalSum += number;
            if (number > maxNumber){
                maxNumber = number;
            }
        }

        totalSum -= maxNumber;
        if (totalSum == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d\n", maxNumber);
        }
        else{
            totalSum = Math.abs(totalSum - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d",totalSum);
        }
    }
}
