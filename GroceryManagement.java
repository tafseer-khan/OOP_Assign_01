import java.util.Scanner;

public class GroceryManagement {
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Just some placeholder data we can use
        itemNames[0] = "Apple";
        itemPrices[0] = 1.42;
        itemStocks[0] = 20;

        itemNames[0] = "Lean Ground Beef";
        itemPrices[0] = 8.70;
        itemStocks[0] = 14;

        Scanner input = new Scanner(System.in);

        /*
         * TODO: Create User Menu 
         * Branch: feature-menu 
         * Logic: In the main method, use a Scanner and a while(true) loop to create a menu. 
         * Integration: Call the methods written in the
         * previous two tasks above based on the user's input (1 for View, 2 for Restock, 3 to Exit).
         */


        input.close();
    }

    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        /*
        * TODO: Implement inventory display 
         * Branch: feature-display 
         * Method: public static void printInventory(String[] names, double[] prices, int[] stocks) 
         * Logic: Use a for loop to iterate through the arrays.
         * Requirement: Use an if-else statement inside the loop to only print slots that aren't
         * empty (e.g., if (names[i] != null)).
         */
    }

    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        /*
         * TODO: Implement Restock & Search 
         * Branch: feature-restock 
         * Method: public static void restockItem(String[] names, int[] stocks, String target, int amount) 
         * Logic: Use a loop to find the target name. If found, add the amount to that index in the stocks array.
         * Requirement: If the item isn't found after checking the whole loop, print
         * "Item not found."
         */
    }

}
