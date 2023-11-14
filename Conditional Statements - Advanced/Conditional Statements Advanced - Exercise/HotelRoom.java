import java.util.Scanner;
public class HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double aparmentPrice = 0;
        if (month.equals("May") || month.equals("October")){

            studioPrice = 50;
            aparmentPrice = 65;
            if (nightCount > 7 && nightCount <= 14) {
                studioPrice -= studioPrice * 0.05;
            }
            else if (nightCount > 14){
                studioPrice -= studioPrice * 0.30;
            }
            if (nightCount > 14){
                aparmentPrice -= aparmentPrice * 0.10;
            }
        }
        else if (month.equals("June") || month.equals("September")){

            studioPrice = 75.20;
            aparmentPrice = 68.70;
            if (nightCount > 14){
                studioPrice -= studioPrice * 0.20;
            }
            if (nightCount > 14){
                aparmentPrice -= aparmentPrice * 0.10;
            }
        }
        else if (month.equals("July") || month.equals("August")){

            studioPrice = 76;
            aparmentPrice = 77;
            if (nightCount > 14) {
                aparmentPrice -= aparmentPrice * 0.10;
            }
        }
        aparmentPrice = aparmentPrice * nightCount;
        studioPrice = studioPrice * nightCount;
        System.out.printf("Apartment: %.2f lv.\n",aparmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);
    }
}
