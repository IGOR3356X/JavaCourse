import java.util.Scanner;

public class Math {
    static void GG(){
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Введите кол-во гостей: ");
        int n = scanner.nextInt();

        int countCut;

        if(n == 1){
            countCut = 0;
        }
        else {
            if (n % 2 == 0){
                countCut = n /2;
            } else {
                countCut = n;
            }
        }

        //System.out.println(String.format("нужное ко-во надрезов = %d",countCut));
        System.out.println(countCut);
    }
}
