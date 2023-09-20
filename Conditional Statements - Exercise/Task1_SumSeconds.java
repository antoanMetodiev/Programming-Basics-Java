import java.util.Scanner;
public class Task1_SumSeconds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int totalTime = a + b + c;

        int minutes = totalTime / 60;
        int sekonds = totalTime % 60;

        if (sekonds <= 9){
            System.out.printf("%d:0%d", minutes,sekonds );
        }
        else{
            System.out.printf("%d:%d", minutes,sekonds );
        }
    }
}
