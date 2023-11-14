import java.util.Scanner;
public class EvenPowersOf2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i <= num; i++){

            if (i % 2 == 0){
                System.out.println(Math.pow(2, i));
            }
        }
    }
}
