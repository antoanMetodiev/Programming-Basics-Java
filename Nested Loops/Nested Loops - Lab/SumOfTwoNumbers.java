import java.util.Scanner;
public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int finall = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean flag1 = false;
        int counter = 0;
        int i = 0;
        int j = 0;
        for (i = begin; i <= finall; i++) {
            for (j = begin; j <= finall; j++) {

                counter++;
                if (i + j == magicNum) {
                    flag1 = true;
                    break;
                }
            }
            if (flag1) {
                break;
            }
        }
        if (flag1) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNum);
        }else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
