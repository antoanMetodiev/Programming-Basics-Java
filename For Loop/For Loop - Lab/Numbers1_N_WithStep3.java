import java.util.Scanner;

public class Numbers1_N_WithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i+=3){
            System.out.println(i);
        }
    }
}
