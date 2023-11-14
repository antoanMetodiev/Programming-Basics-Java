import java.util.Scanner;
public class ExamPreparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGradesCount = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();

        int badgrades = 0;
        String lastTaskName = "";
        int successfulTasks = 0;
        double allGrades = 0;

        while(!task.equals("Enough")){

            lastTaskName = task;
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){

                badgrades++;
                if (badgrades == badGradesCount){
                    System.out.printf("You need a break, %d poor grades.",badgrades);
                    break;
                }
            }
            allGrades += grade;
            successfulTasks++;

            task = scanner.nextLine();
        }

        if (task.equals("Enough")){
            double averageGrade = allGrades / successfulTasks;
            System.out.printf("Average score: %.2f\n",averageGrade);
            System.out.printf("Number of problems: %d\n",successfulTasks);
            System.out.printf("Last problem: %s\n",lastTaskName);
        }
    }
}
