# OOP_Assign_01 - Grocery Management

## Group 15 Members  
### Eladio Gonzalez
- Implement Display Menu

### Myles Johnson 
- N/A

### Tafseer Khan 
- Setup up starter java file with organization, README

### Zach McCall 
- N/A

### Pujan Mijar 
- Implement Restock Feature

### Janisa Miles
- Implement Print Inventory

## UML Class Diagram
```mermaid
classDiagram
    class GroceryManagement {
        +main(String[] args) void$
        +printInventory(String[] names, double[] prices, int[] stocks) void$
        +restockItem(String[] names, int[] stocks, String target, int amount) void$
    }
    class Scanner {
        <<java.util>>
    }
    GroceryManagement ..> Scanner : uses
```

## Installation 
```bash 
javac GroceryManagement.java
java GroceryManagement
```

## Usage Screenshots 
### Main Menu
![Main menu](PrintMenu.png)

### Viewing Inventory
![Printing the inventory](PrintInventory.png)

### Restocking an Item
![Restocking an item](Restock.png)

### Exiting
![Exiting the program](Exit.png)

## Usage Example 
[![asciicast](https://asciinema.org/a/DddL7mKuFCQ8Non4.svg)](https://asciinema.org/a/DddL7mKuFCQ8Non4)