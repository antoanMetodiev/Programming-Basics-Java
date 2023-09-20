import java.util.Scanner;
public class EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int finall = Integer.parseInt(scanner.nextLine());

        for (int i = begin; i <= finall; i++){

            String text = "" + i;
            int evenNum = 0;
            int oddNum = 0;
            for (int j = 0; j < text.length() ; j++){

                int currentDigit = Integer.parseInt("" + text.charAt(j));
                if (j % 2 == 0){
                    evenNum += currentDigit;
                }
                else {
                    oddNum += currentDigit;
                }
            }
            if (evenNum == oddNum){
                System.out.printf("%d ",i);
            }
        }
    }
}
