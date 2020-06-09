import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long userInput = scanner.nextLong();
        long currentFactorialTotal = 1;
        long i = 2;
        while (currentFactorialTotal <= userInput) {
            currentFactorialTotal = currentFactorialTotal * i;
            ++i;
        }
        System.out.println(i - 1);
    }
}