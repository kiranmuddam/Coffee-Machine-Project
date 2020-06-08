import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] myArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            myArray[i] = scanner.nextInt();
        }
        int duplicateCheckInt = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arrayLength; ++i) {
            if (myArray[i] == duplicateCheckInt) {
                ++count;
            }
        }
        System.out.println(count);
    }
}