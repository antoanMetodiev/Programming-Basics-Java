import java.util.Scanner;
public class Sequence2kPlus1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (true){
            counter = (counter * 2) + 1;
            if (counter > n){
                break;
            }
            System.out.println(counter);
        }
    }
}
