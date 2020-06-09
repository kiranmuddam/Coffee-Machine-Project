import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxNum = n * n;

        int[][] table = new int[maxNum][maxNum];
        boolean solved = true;

        for (int row = 0; row < maxNum; row++) {
            for (int col = 0; col < maxNum; col++) {
                table[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < maxNum; row++) {
            for (int col = 0; col < maxNum; col++) {
                if (table[row][col] <= 0 || table[row][col] > maxNum) {
                    solved = false;
                }

                for (int i = 0; i < maxNum; i++) {
                    if (row != i && table[row][col] == table[i][col]) {
                        solved = false;
                    }

                    if (col != i && table[row][col] == table[row][i]) {
                        solved = false;
                    }
                }

                int startRow = row - (row % n);
                int startCol = col - (col % n);

                for (int r = startRow; r < startRow + n; r++) {
                    for (int c = startCol; c < startCol + n; c++) {
                        if ((row != r || col != c) && table[row][col] == table[r][c]) {
                            solved = false;
                        }
                    }
                }
            }
        }

        System.out.println(solved ? "YES" : "NO");
    }
}