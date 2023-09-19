import java.util.Scanner;
public class Task4_VacationBooksList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesCount = Integer.parseInt(scanner.nextLine()); //Брой страници в текущата книга
        int readPagesForHour = Integer.parseInt(scanner.nextLine());//Страници , които прочина за 1 час
        int daysCount = Integer.parseInt(scanner.nextLine());//Броят на дните, за които трябва да прочете книгата

        int totalHours = (pagesCount / readPagesForHour) / daysCount;
        System.out.println(totalHours);
    }
}
