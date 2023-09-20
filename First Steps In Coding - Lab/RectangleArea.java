import java.util.Scanner;
public class RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int result = firstNum * secondNum;

        System.out.println(result);
    }
}
