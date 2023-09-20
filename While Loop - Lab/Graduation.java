import java.util.Scanner;
public class Graduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int classCounter = 0;
        int badGrades = 0;
        double totalGrades = 0;
        while (!(classCounter == 12)){

            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00){
                classCounter++;
                totalGrades += grade;
            }
            else if(grade < 4.00){
                badGrades++;
                if (badGrades > 1) {
                    System.out.printf("%s has been excluded at %d grade",name,classCounter);
                    return;
                }
                classCounter++;
            }
        }
        double averageGrade = totalGrades / classCounter;
        System.out.printf("%s graduated. Average grade: %.2f",name,averageGrade);
    }
}
