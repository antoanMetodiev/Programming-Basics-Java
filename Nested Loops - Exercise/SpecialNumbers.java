import java.util.Scanner;
public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++){

            int n1 = i / 1000;
            int n2 = (i / 100) % 10;
            int n3 = (i / 10) % 10;
            int n4 = i % 10;
            if(n1 != 0 && n2 != 0 && n3 != 0 && n4 != 0){

                if (n % n1 == 0 && n % n2 == 0 && n % n3 == 0 && n % n4 == 0){
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
