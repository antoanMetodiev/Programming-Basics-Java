import java.util.Scanner;
public class SummerOutfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degress = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String Outfit = "";
        String Shoes = "";
        if (time.equals("Morning")) {

            if (degress >= 10 && degress <= 18){
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";
            }
            else if (degress > 18 && degress <= 24){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
            else if (degress >= 25) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            }
        }
        else if (time.equals("Afternoon")){

            if (degress >= 10 && degress <= 18){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
            else if (degress > 18 && degress <= 24){
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            }
            else if (degress >= 25){
                Outfit = "Swim Suit";
                Shoes = "Barefoot";
            }
        }
        else if (time.equals("Evening")){

            if (degress >= 10 && degress <= 18){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
            else if (degress > 18 && degress <= 24){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
            else if (degress >= 25){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",degress,Outfit,Shoes);
    }
}
