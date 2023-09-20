import java.util.Scanner;
public class Moving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shirochina = Integer.parseInt(scanner.nextLine());
        int duljina = Integer.parseInt(scanner.nextLine());
        int visochina = Integer.parseInt(scanner.nextLine());

        int volume = shirochina * duljina * visochina;
        String command = scanner.nextLine();

        while (!command.equals("Done")){

            int prostranstvo = Integer.parseInt(command);
            volume -= prostranstvo;
            if (volume <= 0){
                volume = Math.abs(volume);
                System.out.printf("No more free space! You need %d Cubic meters more.",volume);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Done")){
            System.out.printf("%d Cubic meters left.",volume);
        }
    }
}
