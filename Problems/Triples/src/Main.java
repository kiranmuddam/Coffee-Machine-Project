import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] myArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            myArray[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arrayLength - 2; ++i) {
            if (myArray[i] == myArray[i + 1] - 1 && myArray[i + 1] == myArray[i + 2] - 1) {
                ++count;
            }
        }
        System.out.println(count);
    }
}