import java.util.Random;

public class DoubleMassive {
    void Gg(){
        Random random = new Random();

        int n = 3;
        int m = 5;

        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = random.nextInt(1, 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("%-3d", mas[i][j]));
            }
            System.out.println();
        }

        System.out.println("------------");

        for (int i = 0; i < n; i++) {
            int halfM = m / 2;
            for (int j = 0; j < halfM; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[i][m - 1 - j];
                mas[i][m - 1 - j] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("%-3d", mas[i][j]));
            }
            System.out.println();
        }
    }
}
