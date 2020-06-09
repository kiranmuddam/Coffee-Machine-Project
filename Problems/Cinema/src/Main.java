import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var arr = new int[n][m];
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        var k = scanner.nextInt();
        var result = 0;
        for (var i = 0; i < n; i++) {
            var count = 0;
            for (var j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == k) {
                    result = i + 1;
                    break;
                }
            }
            if (result > 0) {
                break;
            }
        }
        System.out.print(result);
    }
}