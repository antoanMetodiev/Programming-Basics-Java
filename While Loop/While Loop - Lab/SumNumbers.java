import java.util.Scanner;
public class SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer furstNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (true){

            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (sum >= furstNumber){
                System.out.println(sum);
                break;
            }
        }
    }
}
