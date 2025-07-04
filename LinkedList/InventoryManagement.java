package LinkedList;

import java.util.Scanner;

class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagement {
    private Item head = null;

    // Add at beginning
    public void addAtBeginning(Item newItem) {
        newItem.next = head;
        head = newItem;
    }

    // Add at end
    public void addAtEnd(Item newItem) {
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add at position (1-based index)
    public void addAtPosition(Item newItem, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newItem);
            return;
        }

        Item temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Delete by Item ID
    public void deleteById(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item deleted.");
            return;
        }

        Item curr = head;
        while (curr.next != null && curr.next.itemId != itemId) {
            curr = curr.next;
        }

        if (curr.next == null) {
            System.out.println("Item not found.");
        } else {
            curr.next = curr.next.next;
            System.out.println("Item deleted.");
        }
    }

    // Update quantity by ID
    public void updateQuantity(int itemId, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search by ID or Name
    public void search(String query) {
        boolean found = false;
        Item temp = head;
        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(query) || temp.itemName.equalsIgnoreCase(query)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No item found for query: " + query);
    }

    // Calculate total value
    public void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.printf("Total Inventory Value: ₹%.2f\n", total);
    }

    // Sort inventory
    public void sortInventory(String key, boolean ascending) {
        head = mergeSort(head, key, ascending);
        System.out.println("Inventory sorted by " + key + " in " + (ascending ? "ascending" : "descending") + " order.");
    }

    private Item mergeSort(Item node, String key, boolean ascending) {
        if (node == null || node.next == null) return node;

        Item mid = getMiddle(node);
        Item nextMid = mid.next;
        mid.next = null;

        Item left = mergeSort(node, key, ascending);
        Item right = mergeSort(nextMid, key, ascending);

        return merge(left, right, key, ascending);
    }

    private Item merge(Item a, Item b, String key, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (key.equalsIgnoreCase("name")) {
            condition = ascending ? a.itemName.compareToIgnoreCase(b.itemName) < 0 : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = ascending ? a.price < b.price : a.price > b.price;
        }

        if (condition) {
            a.next = merge(a.next, b, key, ascending);
            return a;
        } else {
            b.next = merge(a, b.next, key, ascending);
            return b;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display all items
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("\n--- Inventory List ---");
        Item temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    // Display one item
    private void displayItem(Item i) {
        System.out.println("ID: " + i.itemId + " | Name: " + i.itemName + " | Qty: " + i.quantity + " | Price: ₹" + i.price);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryManagement im = new InventoryManagement();

        while (true) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Delete Item by ID");
            System.out.println("5. Update Quantity by ID");
            System.out.println("6. Search Item by ID or Name");
            System.out.println("7. Display Inventory");
            System.out.println("8. Calculate Total Inventory Value");
            System.out.println("9. Sort Inventory by Name/Price");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1, 2, 3 -> {
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    Item item = new Item(name, id, qty, price);

                    if (choice == 1) im.addAtBeginning(item);
                    else if (choice == 2) im.addAtEnd(item);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        im.addAtPosition(item, pos);
                    }
                }

                case 4 -> {
                    System.out.print("Enter Item ID to delete: ");
                    int id = sc.nextInt();
                    im.deleteById(id);
                }

                case 5 -> {
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int qty = sc.nextInt();
                    im.updateQuantity(id, qty);
                }

                case 6 -> {
                    System.out.print("Enter Item ID or Name to search: ");
                    String query = sc.nextLine();
                    im.search(query);
                }

                case 7 -> im.displayInventory();

                case 8 -> im.calculateTotalValue();

                case 9 -> {
                    System.out.print("Sort by 'name' or 'price': ");
                    String key = sc.nextLine().toLowerCase();
                    System.out.print("Order (asc/desc): ");
                    boolean asc = sc.nextLine().equalsIgnoreCase("asc");
                    im.sortInventory(key, asc);
                }

                case 10 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

