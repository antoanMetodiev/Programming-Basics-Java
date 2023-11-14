import java.util.Scanner;
public class TrainTheTrainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalGrades = 0;
        int allGradesCounter = 0;

        String project = scanner.nextLine();
        while (!project.equals("Finish")){

            double projectGrade = 0;
            int j = 1;
            int gradesCounter = 0;
            for (j = 1; j <= n; j++){

                double grade = Double.parseDouble(scanner.nextLine());
                projectGrade += grade;
                totalGrades += grade;
                gradesCounter++;
                allGradesCounter++;
            }
            double averageGrade = projectGrade / gradesCounter;
            System.out.printf("%s - %.2f.\n",project,averageGrade);
            project = scanner.nextLine();
        }
        double totalAverageGrade = totalGrades / allGradesCounter;
        System.out.printf("Student's final assessment is %.2f.",totalAverageGrade);
    }
}
