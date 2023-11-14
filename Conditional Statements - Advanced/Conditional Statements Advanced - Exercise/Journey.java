import java.util.Scanner;
public class Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String country = "";
        double discount = 0;
        if (season.equals("summer")) {

            place = "Camp";
            if (budget <= 100) {
                country = "Bulgaria";
                discount = budget * 0.30;
            }
            else if (budget <= 1000){
                country = "Balkans";
                discount = budget * 0.40;
            }
            else if (budget > 1000){
                place = "Hotel";
                country = "Europe";
                discount = budget * 0.90;
            }
        }
        else if (season.equals("winter")){

            place = "Hotel";
            if (budget <= 100) {
                country = "Bulgaria";
                discount = budget * 0.70;
            }
            else if (budget <= 1000){
                country = "Balkans";
                discount = budget * 0.80;
            }
            else if (budget > 1000){
                country = "Europe";
                discount = budget * 0.90;
            }
        }
        System.out.printf("Somewhere in %s\n",country);
        System.out.printf("%s - %.2f",place,discount);
    }
}
