import java.util.Scanner;

public class Shifr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        String originalText, encryptText, decryptText;
        int encryptKey;

        System.out.print("Введите строку для шифрования: ");
        originalText = scanner.next();

        System.out.print("Введите ключ для шифрования: ");
        encryptKey = scanner.nextInt();

        encryptText = "";

        for (int i = 0; i < originalText.length(); i++) {
            char currentLetter = originalText.charAt(i);

            int findIndex = alphabet.indexOf(currentLetter);

            if (findIndex != -1) {
                int newIndex = (findIndex + encryptKey) % alphabet.length();
                encryptText += alphabet.charAt(newIndex);
            } else {
                encryptText += currentLetter;
            }
        }

        System.out.println("Зашифрованный текст: " + encryptText);

        decryptText = "";

        for (int i = 0; i < encryptText.length(); i++) {
            char currentLetter = encryptText.charAt(i);

            int findIndex = alphabet.indexOf(currentLetter);

            if (findIndex != -1) {
                int newIndex = (findIndex + encryptKey % alphabet.length()) % alphabet.length();
                encryptText += alphabet.charAt(newIndex);
            } else {
                encryptText += currentLetter;
            }
        }
    }
}
