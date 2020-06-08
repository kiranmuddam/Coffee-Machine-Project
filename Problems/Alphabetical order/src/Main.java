import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] myArray = scanner.nextLine().split(" ");
        boolean isOrdered = true;
        for (int j = 0; j < myArray.length - 1; ++j) {
            if (myArray[j].compareTo(myArray[j + 1]) > 0) {
                isOrdered = false;
                break;
            }
        }
        System.out.println(isOrdered);
    }
}