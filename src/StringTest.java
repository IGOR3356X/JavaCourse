import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        char[][] masStr = {
                {'а','б','в','г','д','е'},
                {'ё','ж','з','и','й','к'},
                {'л','м','н','о','п','р'},
                {'с','т','у','ф','х','ц'},
                {'ч','ш','щ','ъ','ы','ь'},
                {'э','ю','я',',','.','-'},
        };

        System.out.print("Введи действие которое хочешь сделать \n1.Зашифровать\n2.Расшифровать\nТвой ответ: ");
        int user_intput = scanner.nextInt();
        switch (user_intput){
            case 1:{
                System.out.print("Введи слово которое хочешь зашифоровать: ");
                String slovo = scanner.next().toLowerCase();
                int lenght = 0;

                for (int d = 0; d < slovo.length(); d++) {
                    for (int i = 0; i < masStr.length; i++) {
                        for (int j = 0; j < masStr[i].length; j++) {
                            if (masStr[i][j] == slovo.charAt(d)){
                                stringBuilder.append(String.format("%d%d ", i+1, j+1)).append(" ");
                            }
                        }
                    }
                }
                String answer = stringBuilder.toString();

                System.out.println(answer);
                break;
            }
            case 2: {
                System.out.print("Введи индексы которые хочешь расшифровать через пробел: ");
                String indexes = scanner.next();
                int row,col;

                String[] splitedMas = indexes.split(" ");
                for (int i = 0; i < splitedMas.length; i++) {
                    int number = Integer.parseInt(splitedMas[i]);
                    row = (number / 10) - 1;
                    col = (number % 10) - 1;
                    char symbol = masStr[row][col];
                    stringBuilder.append(symbol).append(" ");
                }

                System.out.println(stringBuilder);

                break;
            }
        }
    }
}
