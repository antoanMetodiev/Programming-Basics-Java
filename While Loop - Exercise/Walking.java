import java.util.Scanner;

public class Walking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int allSteps = 0;
        boolean flag1 = false;

        while (!command.equals("Going home")){

            int steps = Integer.parseInt(command);
            allSteps += steps;
            if (allSteps >= 10000){

                flag1 = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (flag1){
            allSteps -= 10000;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",allSteps);
        }
        else if (command.equals("Going home")){

            int bonusSteps = Integer.parseInt(scanner.nextLine());
            allSteps += bonusSteps;
            if (allSteps >= 10000) {

                allSteps -= 10000;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!",allSteps);
                return;
            }
            allSteps = Math.abs(allSteps - 10000);
            System.out.printf("%d more steps to reach goal.",allSteps);
        }
    }
}
