import java.util.Scanner;
public class Combinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finalNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        for (int num1 = 0;  num1 <= finalNum; num1++){
            for (int num2 = 0;  num2 <= finalNum; num2++){
                for (int num3 = 0;  num3 <= finalNum; num3++){
                    if (num1 + num2 + num3 == finalNum){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
