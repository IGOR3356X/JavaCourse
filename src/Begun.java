import java.util.Scanner;

public class Begun {
    public static void run(){
        Scanner scanner = new Scanner(System.in);

        double startDistance, finishDistance, increasePercent;
        int days;

        System.out.print("введите начальную дистанцию(км): ");
        startDistance = scanner.nextDouble();

        System.out.print("введите конечную дистанцию(км): ");
        finishDistance = scanner.nextDouble();

        System.out.print("введите на сколько процентов увеличивается дистанция: ");
        increasePercent = scanner.nextDouble();

        days = 0;


        while (startDistance < finishDistance) {
            startDistance += startDistance * increasePercent / 100.0;

            days++;
        }
        System.out.println(String.format("после %d дня бегун пробежал %.2f км", days, startDistance));
    }
}
