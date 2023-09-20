import java.util.Scanner;
public class SumPrimeNonPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        boolean flag1 = false;
        int primeNums = 0;
        int nonPrimeNums = 0;
        while (!command.equals("stop")){

            int num = Integer.parseInt(command);
            int counter = 0;
            if (num < 0){
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            for (int i = 1; i <= num; i++){

                if (num % i == 0){

                    counter++;
                    if (counter == 3){
                        nonPrimeNums += num;
                    }
                }
            }
            if (counter <= 2){
                primeNums += num;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n",primeNums);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeNums);
    }
}
