package machine;
import java.util.Scanner;
public class CoffeeMachine {
    int totalMoney = 550;
    int waterStock = 400;
    int milkStock = 540;
    int beansStock = 120;
    int stockDisposableCups = 9;
    public void displayStatsCoffeeMachine() {
        System.out.println("The coffee machine has:");
        System.out.println(waterStock + " of water");
        System.out.println(milkStock + " of milk");
        System.out.println(beansStock + " of coffee beans");
        System.out.println(stockDisposableCups + " of disposable cups");
        System.out.println(totalMoney + " of money");
    }
    public boolean checkCoffeeItemsStock(int coffeeType) {
        if (coffeeType == 1) {
            return waterStock >= 250 && beansStock >= 16 && stockDisposableCups >= 1;
        } else if (coffeeType == 2) {
            return waterStock >= 350 && milkStock >= 75 && beansStock >= 20 && stockDisposableCups >= 1;
        } else if (coffeeType == 3) {
            return waterStock >= 200 && milkStock >= 100 && beansStock >= 12 && stockDisposableCups >= 1;
        }
        return false;
    }
    public void buyCoffee(int coffeeType) {
        if (coffeeType == 1 && checkCoffeeItemsStock(1)) {
            waterStock = waterStock - 250;
            //milkStock = milkStock - 50;
            beansStock = beansStock - 16;
            --stockDisposableCups;
            totalMoney = totalMoney + 4;
        } else if (coffeeType == 2 && checkCoffeeItemsStock(2)) {
            waterStock = waterStock - 350;
            milkStock = milkStock - 75;
            beansStock = beansStock - 20;
            --stockDisposableCups;
            totalMoney = totalMoney + 7;
        } else if (coffeeType == 3 && checkCoffeeItemsStock(3)) {
            waterStock = waterStock - 200;
            milkStock = milkStock - 100;
            beansStock = beansStock - 12;
            --stockDisposableCups;
            totalMoney = totalMoney + 6;
        }
        System.out.println();
        displayStatsCoffeeMachine();
    }
    public void fillCoffeeMachine(int waterInput, int milkInput, int beansInput, int cupsInput) {
        waterStock = waterStock + waterInput;
        milkStock = milkStock + milkInput;
        beansStock = beansStock + beansInput;
        stockDisposableCups = stockDisposableCups + cupsInput;
        System.out.println();
        displayStatsCoffeeMachine();
    }
    public void takeMoney() {
        System.out.println("I gave you $" + totalMoney);
        totalMoney = 0;
        System.out.println();
        displayStatsCoffeeMachine();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine myCoffeeMachine = new CoffeeMachine();
        myCoffeeMachine.displayStatsCoffeeMachine();
        System.out.println("Write action (buy, fill, take):");
        String userInput = scanner.next();
        switch (userInput) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                int coffeeType = scanner.nextInt();
                myCoffeeMachine.buyCoffee(coffeeType);
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                int waterInput = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int milkInput = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int beansInput = scanner.nextInt();
                System.out.println("Write how many disposable cups do you want to add:");
                int cupsInput = scanner.nextInt();
                myCoffeeMachine.fillCoffeeMachine(waterInput, milkInput, beansInput, cupsInput);
                break;
            case "take":
                myCoffeeMachine.takeMoney();
                break;

        }
    }
}
