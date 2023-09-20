import java.util.Scanner;
public class OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        int checkedBooks = 0;
        String currentBook = scanner.nextLine();
        while (!currentBook.equals(bookName)) {

            if (currentBook.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",checkedBooks);
                break;
            }
            checkedBooks++;
            currentBook = scanner.nextLine();
        }
        if (currentBook.equals(bookName)) {
            System.out.printf("You checked %d books and found it.",checkedBooks);
        }
    }
}
