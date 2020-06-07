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
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterStock = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkStock = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beansStock = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int userInput = scanner.nextInt();
        int MaxCoffeeMakes = Math.min(Math.min(waterStock / 200, milkStock / 50), beansStock / 15);
        if(userInput == MaxCoffeeMakes) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if(userInput < MaxCoffeeMakes) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (MaxCoffeeMakes - userInput) + " more than that)");
        } else if(userInput > MaxCoffeeMakes) {
            System.out.println("No, I can make only " + (MaxCoffeeMakes) + " cup(s) of coffee");
        }

    }
}
