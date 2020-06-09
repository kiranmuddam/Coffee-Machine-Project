import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] myArray = new int[rows][columns];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                myArray[i][j] = scanner.nextInt();
            }
        }
        int inputSwapColumn1 = scanner.nextInt();
        int inputSwapColumn2 = scanner.nextInt();

        for (int i = 0; i < rows; ++i) {
            int temp = myArray[i][inputSwapColumn1];
            myArray[i][inputSwapColumn1] = myArray[i][inputSwapColumn2];
            myArray[i][inputSwapColumn2] = temp;
        }
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}