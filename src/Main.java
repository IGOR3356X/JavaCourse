import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Math.GG();

    }
}
class Do_While{
    public static void test(){
        Scanner scanner = new Scanner(System.in);

        int GG;

        do{
            System.out.print("Введи 5: ");
            GG = scanner.nextInt();
        }while (GG != 5);

        System.out.println("Наконец вы ввели 5");
    }
}