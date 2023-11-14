import java.util.Scanner;
public class ReadText {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();

        while (!name.equals("Stop")){
            System.out.printf("%s\n",name);
            name = scanner.nextLine();
        }
    }
}
