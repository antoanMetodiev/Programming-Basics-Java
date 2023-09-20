import java.util.Scanner;
public class FruitOrVegetable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plod = (scanner.nextLine());

        if (plod.equals("banana") || plod.equals("apple")
                || plod.equals("kiwi") || plod.equals("lemon")
                || plod.equals("grapes") || plod.equals("cherry")  ){

            System.out.println("fruit");
        }
        else if (plod.equals("tomato") || plod.equals("cucumber") || plod.equals("pepper") || plod.equals("carrot")){
            System.out.println("vegetable");
        }
        else{
            System.out.println("unknown");
        }
    }
}
