import java.util.Scanner;
public class OperationsBetweenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());

        char operator = scanner.nextLine().charAt(0);
        String evenOrodd = "";
        double result = 0;
        String operator2 = "" + operator;
        if (operator2.equals("+")) {

            result = N1 + N2;
            if (result % 2 == 0){
                evenOrodd = "even";
            }
            else{
                evenOrodd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s",N1,operator2,N2,result,evenOrodd);
        }
        else if (operator2.equals("-")){

            result = N1 - N2;
            if (result % 2 == 0){
                evenOrodd = "even";
            }
            else{
                evenOrodd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s",N1,operator2,N2,result,evenOrodd);
        }
        else if (operator2.equals("*")){

            result = N1 * N2;
            if (result % 2 == 0){
                evenOrodd = "even";
            }
            else{
                evenOrodd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s",N1,operator2,N2,result,evenOrodd);
        }
        else if (operator2.equals("/")){

            if (N2 <= 0){
                System.out.printf("Cannot divide %d by zero",N1);
                return;
            }
            result = (double)N1 / N2;
            System.out.printf("%d / %d = %.2f",N1,N2,result);
        }
        else if (operator2.equals("%")) {

            if (N2 <= 0) {
                System.out.printf("Cannot divide %d by zero", N1);
                return;
            }
            result = N1 % N2;
            System.out.printf("%d %s %d = %.0f", N1, operator2, N2, result);
        }
    }
}
