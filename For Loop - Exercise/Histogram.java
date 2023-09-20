import java.util.Scanner;
public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double totalNum = 0;
        for (int i = 0; i < n;  i++){

            int number = Integer.parseInt(scanner.nextLine());
            totalNum++;
            if (number < 200){
                p1++;
            }
            if (number >= 200 && number <= 399){
                p2++;
            }
            if (number >= 400 && number <= 599){
                p3++;
            }
            if (number >= 600 && number <= 799){
                p4++;
            }
            if (number >= 800){
                p5++;
            }
        }
        p1 = (p1 * 100) / totalNum;
        p2 = (p2 * 100) / totalNum;
        p3 = (p3 * 100) / totalNum;
        p4 = (p4 * 100) / totalNum;
        p5 = (p5 * 100) / totalNum;

        System.out.printf("%.2f%%\n",p1 );
        System.out.printf("%.2f%%\n",p2 );
        System.out.printf("%.2f%%\n",p3 );
        System.out.printf("%.2f%%\n",p4 );
        System.out.printf("%.2f%%\n",p5 );
    }
}
