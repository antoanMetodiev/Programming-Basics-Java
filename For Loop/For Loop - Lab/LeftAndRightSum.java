import java.util.Scanner;
public class LeftAndRightSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()) * 2;

        int rightSum = 0;
        int leftSum = 0;
        int counter = 0;
        for (int i = 1; i <= n ; i++){

            int num = Integer.parseInt(scanner.nextLine());
            if (counter >= (n / 2)){
                rightSum += num;
            }
            else{
                leftSum += num;
            }
            counter++;
        }

        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d\n",leftSum);
        }
        else{
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d\n",diff );
        }
    }
}
