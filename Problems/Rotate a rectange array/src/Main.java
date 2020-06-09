import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] newArray = new int[columns][rows];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                newArray[j][rows - i - 1] = scanner.nextInt();
            }
        }

        for (int i = 0; i < columns; ++i) {
            for (int j = 0; j < rows; ++j) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}