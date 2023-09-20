import java.util.Scanner;
public class CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filmName = scanner.nextLine();
        int totalSeats = Integer.parseInt(scanner.nextLine());

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            
            int currentMovieTickets = 0;
            while (!input.equals("End")) {
                currentMovieTickets++;
                switch (input) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                totalTickets++;
                if (currentMovieTickets >= totalSeats) {
                    break;
                }
                input = scanner.nextLine();
            }
            double percentageFilled = (currentMovieTickets * 1.0 / totalSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", filmName, percentageFilled);

            filmName = scanner.nextLine();
            if (filmName.equals("Finish")) {
                break;
            }
            totalSeats = Integer.parseInt(scanner.nextLine());
            input = scanner.nextLine();
        }
        double studentPercentage = (studentTickets * 1.0 / totalTickets) * 100;
        double standardPercentage = (standardTickets * 1.0 / totalTickets) * 100;
        double kidPercentage = (kidTickets * 1.0 / totalTickets) * 100;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentPercentage);
        System.out.printf("%.2f%% standard tickets.%n", standardPercentage);
        System.out.printf("%.2f%% kids tickets.%n", kidPercentage);
    }
}
