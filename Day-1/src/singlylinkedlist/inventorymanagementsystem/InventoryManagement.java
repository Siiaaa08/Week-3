package singlylinkedlist.inventorymanagementsystem;

public class InventoryManagement {
        private Node head;
        private int size;

        static class Node {
            String itemName;
            int itemID;
            int quantity;
            double price;
            Node next;

            public Node(String itemName, int itemID, int quantity, double price) {
                this.itemName = itemName;
                this.itemID = itemID;
                this.quantity = quantity;
                this.price = price;
                this.next = null;
            }
        }

        public InventoryManagement() {
            this.head = null;
            this.size = 0;
        }

        public void addItemAtBeginning(String itemName, int itemID, int quantity, double price) {
            Node newNode = new Node(itemName, itemID, quantity, price);
            newNode.next = head;
            head = newNode;
            size++;
        }

        public void addItemAtEnd(String itemName, int itemID, int quantity, double price) {
            Node newNode = new Node(itemName, itemID, quantity, price);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        public void addItemAtPosition(String itemName, int itemID, int quantity, double price, int position) {
            if (position < 0 || position > size) {
                System.out.println("Invalid position");
                return;
            }

            Node newNode = new Node(itemName, itemID, quantity, price);
            if (position == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                for (int i = 1; i < position; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            size++;
        }

        public void removeItemByID(int itemID) {
            if (head == null) {
                System.out.println("Inventory is empty");
                return;
            }

            if (head.itemID == itemID) {
                head = head.next;
                size--;
                return;
            }

            Node current = head;
            Node previous = null;
            while (current != null && current.itemID != itemID) {
                previous = current;
                current = current.next;
            }

            if (current == null) {
                System.out.println("Item with ID " + itemID + " not found.");
                return;
            }

            previous.next = current.next;
            size--;
        }

        public void updateItemQuantity(int itemID, int newQuantity) {
            Node current = head;
            while (current != null) {
                if (current.itemID == itemID) {
                    current.quantity = newQuantity;
                    return;
                }
                current = current.next;
            }
            System.out.println("Item with ID " + itemID + " not found.");
        }

       public void searchItem(String searchTerm) {
            Node current = head;
            boolean found = false;
            while (current != null) {
                if (current.itemName.equalsIgnoreCase(searchTerm) || Integer.toString(current.itemID).equals(searchTerm)) {
                    System.out.println("Found Item - ID: " + current.itemID + ", Name: " + current.itemName +
                            ", Quantity: " + current.quantity + ", Price: " + current.price);
                    found = true;
                }
                current = current.next;
            }
            if (!found) {
                System.out.println("No item found for: " + searchTerm);
            }
        }

        public double getTotalInventoryValue() {
            double totalValue = 0;
            Node current = head;
            while (current != null) {
                totalValue += current.quantity * current.price;
                current = current.next;
            }
            return totalValue;
        }

        public void sortInventory(String sortBy, boolean ascending) {
            if (head == null || head.next == null) {
                return;
            }

            Node[] nodes = new Node[size];
            Node current = head;
            for (int i = 0; i < size; i++) {
                nodes[i] = current;
                current = current.next;
            }

            if (sortBy.equalsIgnoreCase("name")) {
                if (ascending) {
                    mergeSortByName(nodes, 0, size - 1);
                } else {
                    mergeSortByName(nodes, 0, size - 1);
                    reverseArray(nodes);
                }
            } else if (sortBy.equalsIgnoreCase("price")) {
                if (ascending) {
                    mergeSortByPrice(nodes, 0, size - 1);
                } else {
                    mergeSortByPrice(nodes, 0, size - 1);
                    reverseArray(nodes);
                }
            }

            head = nodes[0];
            current = head;
            for (int i = 1; i < size; i++) {
                current.next = nodes[i];
                current = current.next;
            }
            current.next = null;
        }

        private void mergeSortByName(Node[] nodes, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSortByName(nodes, left, mid);
                mergeSortByName(nodes, mid + 1, right);
                mergeByName(nodes, left, mid, right);
            }
        }

        private void mergeByName(Node[] nodes, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            Node[] leftArray = new Node[n1];
            Node[] rightArray = new Node[n2];

            System.arraycopy(nodes, left, leftArray, 0, n1);
            System.arraycopy(nodes, mid + 1, rightArray, 0, n2);

            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i].itemName.compareTo(rightArray[j].itemName) <= 0) {
                    nodes[k] = leftArray[i];
                    i++;
                } else {
                    nodes[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                nodes[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < n2) {
                nodes[k] = rightArray[j];
                j++;
                k++;
            }
        }

        private void mergeSortByPrice(Node[] nodes, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSortByPrice(nodes, left, mid);
                mergeSortByPrice(nodes, mid + 1, right);
                mergeByPrice(nodes, left, mid, right);
            }
        }

        private void mergeByPrice(Node[] nodes, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            Node[] leftArray = new Node[n1];
            Node[] rightArray = new Node[n2];

            System.arraycopy(nodes, left, leftArray, 0, n1);
            System.arraycopy(nodes, mid + 1, rightArray, 0, n2);

            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i].price <= rightArray[j].price) {
                    nodes[k] = leftArray[i];
                    i++;
                } else {
                    nodes[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                nodes[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < n2) {
                nodes[k] = rightArray[j];
                j++;
                k++;
            }
        }

        private void reverseArray(Node[] nodes) {
            int left = 0;
            int right = nodes.length - 1;
            while (left < right) {
                Node temp = nodes[left];
                nodes[left] = nodes[right];
                nodes[right] = temp;
                left++;
                right--;
            }
        }

        public void displayInventory() {
            Node current = head;
            while (current != null) {
                System.out.println("Item ID: " + current.itemID + ", Name: " + current.itemName +
                        ", Quantity: " + current.quantity + ", Price: " + current.price);
                current = current.next;
            }
        }

    }


