import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Palindrome {

    // Метод для переворота строки
    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        // Проходим по строке в обратном порядке
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        // Попробуй сначала без явной установки кодировки
        // Убедись, что консоль поддерживает UTF-8
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.err.println("UTF-8 encoding is not supported!");
            return;
        }

        if (args.length == 0) {
            System.out.println("Пожалуйста, введите хотя бы одно слово для проверки.");
            return;
        }

        // Проверяем каждое введенное слово с использованием улучшенного цикла for
        for (String s : args) {
            if (isPalindrome(s)) {
                System.out.println(s + " является палиндромом.");
            } else {
                System.out.println(s + " не является палиндромом.");
            }
        }
    }
}
