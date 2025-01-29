package singlylinkedlist.inventorymanagementsystem;

public class Main {
         public static void main(String[] args) {
            InventoryManagement inventory = new InventoryManagement();

            inventory.addItemAtBeginning("Apple", 101, 50, 1.5);
            inventory.addItemAtEnd("Banana", 102, 30, 0.8);
            inventory.addItemAtEnd("Orange", 103, 60, 1.2);
            inventory.addItemAtPosition("Mango", 104, 40, 1.8, 2);

            inventory.displayInventory();
            inventory.updateItemQuantity(103, 70);
            inventory.removeItemByID(102);

            inventory.displayInventory();
            inventory.searchItem("Orange");
            System.out.println("Total Inventory Value: " + inventory.getTotalInventoryValue());

            inventory.sortInventory("price", false);
            inventory.displayInventory();
        }
    }


