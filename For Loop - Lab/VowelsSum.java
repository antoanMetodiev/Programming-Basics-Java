import java.util.Scanner;
public class VowelsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int value = 0;

        for (int i = 0 ; i < text.length();  i++){

            char currentChar = text.charAt(i);
            if (currentChar == 'a'){
                value += 1;
            }
            else if (currentChar == 'e'){
                value += 2;
            }
            else if (currentChar == 'i'){
                value += 3;
            }
            else if (currentChar == 'o'){
                value += 4;
            }
            else if (currentChar == 'u'){
                value += 5;
            }
        }
        System.out.println(value);
    }
}
