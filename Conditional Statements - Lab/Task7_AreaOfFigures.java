import java.util.Scanner;
public class Task7_AreaOfFigures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = (scanner.nextLine());
        double face = 0;

        if (figure.equals("square")){
            double faceSquare = Double.parseDouble(scanner.nextLine());
            face = faceSquare * faceSquare;
        }
        else if (figure.equals("rectangle")){
            double faceRectangle1 = Double.parseDouble(scanner.nextLine());
            double faceRactangle2 = Double.parseDouble(scanner.nextLine());
            face = faceRectangle1 * faceRactangle2;
        }
        else if (figure.equals("triangle")){
            double faceTriangle1 = Double.parseDouble(scanner.nextLine());
            double faceTriangle2 = Double.parseDouble(scanner.nextLine());
            face = (faceTriangle1 * faceTriangle2) / 2;
        }
        else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            face = (radius * radius) * Math.PI;
        }
        System.out.printf("%.3f\n", face);
    }
}
