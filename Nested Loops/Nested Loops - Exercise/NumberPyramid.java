import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int j = 0;
        int counter = 0;
        for (int i = 1; i <= n; i++){
            for (j = 1; j <= i; j++){
                counter++;
                System.out.printf("%d ",counter);
                if (counter == n){
                    return;
                }
            }
            System.out.println();
        }
    }
}
