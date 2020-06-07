package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        System.out.println("Write how many cups of coffee you will need:");
        int userInput = scanner.nextInt();
        System.out.println("For "+ userInput + " cups of coffee you will need:");
        System.out.println(200 * userInput + " ml of water");
        System.out.println(50 * userInput + " ml of milk");
        System.out.println(15 * userInput + " g of coffee beans");
    }
}
