import java.util.Scanner;

/**
 * 
 * GroceryManagement defines a Grocery Management System, which includes various items, which have
 * their respective pricing and stock values
 */
public class GroceryManagement {
    /**
     * The main program of the Grocery Management system which simulates the user functionality of
     * viewing items and restocking
     * 
     * @param args
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Apple";
        itemPrices[0] = 1.42;
        itemStocks[0] = 20;

        itemNames[1] = "Lean Ground Beef";
        itemPrices[1] = 8.70;
        itemStocks[1] = 14;

        Scanner input = new Scanner(System.in);

        printInventory(itemNames, itemPrices, itemStocks);

        input.close();
    }

    /**
     * Prints the the list of items in the Grocery Store's inventory in a readable and digestible
     * way.
     * 
     * @param names The ordered inventory name list
     * @param prices The corresponding ordered inventory prices
     * @param stocks The corresponding ordered inventory stock values
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        if (names[0] == null) {
            System.out.println("There is no inventory. Plese restock!");
        } else {
            System.out.println("~~~~~~Inventory~~~~~~");
            System.out.println("#: Name - Price, Stock");
            System.out.println("------------------------");
            for (int i = 0; i < 10; i++) {
                if (names[i] != null) {
                    System.out.println(
                            (i + 1) + ": " + names[i] + " - $" + prices[i] + ", " + stocks[i]);
                }
            }
        }

    }

    /**
     * Increases the inventory stock of targeted item
     * 
     * @param names The ordered inventory name list
     * @param stocks The corresponding ordered inventory stock values
     * @param target The item which stock to update
     * @param amount The amount of stock to add
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println(target + " has been restocked. New stock: " + stocks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

}
