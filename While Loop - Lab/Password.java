import javax.security.sasl.SaslClient;
import java.util.Scanner;
public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();

        while (true){

            String again = scanner.nextLine();
            if (again.equals(password)){
                System.out.printf("Welcome %s!\n",name);
                break;
            }
        }
    }
}
