public class Primes {

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int n) {
        // Проверка делимости на числа от 2 до n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // Если число делится на i без остатка, оно не простое
            }
        }
        return true; // Если не нашлось делителя, число простое
    }

    public static void main(String[] args) {
        // Цикл от 2 до 100 для поиска простых чисел
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i); // Вывод простого числа
            }
        }
    }
}
