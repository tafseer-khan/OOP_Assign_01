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

        itemNames[1] = "Lean Ground Beef";
        itemPrices[1] = 8.70;
        itemStocks[1] = 14;

        Scanner input = new Scanner(System.in);

        printInventory(itemNames, itemPrices, itemStocks);

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
        if(names[0] == null){
            System.out.println("There is no inventory. Plese restock!");
        }else{
            System.out.println("~~~~~~Inventory~~~~~~");
            System.out.println("#: Name - Price, Stock");
            System.out.println("------------------------");
            for(int i = 0; i < 10; i++){
                if(names[i] != null){
                    System.out.println((i+1) + ": " + names[i] + " - $" + prices[i] + ", " + stocks[i]);
                }
            }
        }

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
          boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println(
                    target + " has been restocked. New stock: " + stocks[i]
                );
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

}
