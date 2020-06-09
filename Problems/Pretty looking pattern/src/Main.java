import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 4;
        int columns = 4;
        char[][] myArray = new char[rows][columns];
        for (int i = 0; i < rows; ++i) {
            String currentLine = scanner.nextLine();
            for (int j = 0; j < columns; ++j) {
                myArray[i][j] = currentLine.charAt(j);
            }
        }
        for (int i = 0; i < rows - 1; ++i) {
            for (int j = 0; j < columns - 1; ++j) {
                if (myArray[i][j] == myArray[i][j + 1] && myArray[i + 1][j] == myArray[i + 1][j + 1] && myArray[i][j] == myArray[i + 1][j]) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");

    }
}