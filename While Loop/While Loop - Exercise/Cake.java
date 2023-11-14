import java.util.Scanner;
public class Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duljina = Integer.parseInt(scanner.nextLine());
        int shirochina = Integer.parseInt(scanner.nextLine());
        int cake = duljina * shirochina;

        String command = scanner.nextLine();

        while (!command.equals("STOP")){

            int pieces = Integer.parseInt(command);
            cake -= pieces;
            if (cake <= 0){
                cake = Math.abs(cake + 0);
                System.out.printf("No more cake left! You need %d pieces more.",cake);
                return;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%d pieces are left.",cake);
    }
}
