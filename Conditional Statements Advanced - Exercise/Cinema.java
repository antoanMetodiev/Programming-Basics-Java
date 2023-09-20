import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rowCount = Integer.parseInt(scanner.nextLine());  
        int columnsCount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (projection.equals("Premiere")){
            price = 12;
        }
        else if (projection.equals("Normal")){
            price = 7.50;
        }
        else if (projection.equals("Discount")){
            price = 5;
        }
        price = (price * rowCount) * columnsCount;
        System.out.printf("%.2f leva.",price);
    }
}
