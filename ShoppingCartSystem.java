import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    private CartItem[] cartItems;
    private int itemCount;
    private static final int MAX_ITEMS = 10;

    // Constructor
    public ShoppingCart() {
        this.cartItems = new CartItem[MAX_ITEMS];
        this.itemCount = 0;
    }

    // add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        // Check if item already exists in cart
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equalsIgnoreCase(itemName)) {
                cartItems[i].quantity += quantity;
                System.out.println(quantity + " more " + itemName + "(s) added to the cart.");
                return;
            }
        }

        // item if space is available
        if (itemCount < MAX_ITEMS) {
            cartItems[itemCount++] = new CartItem(itemName, price, quantity);
            System.out.println(itemName + " added to the cart.");
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equalsIgnoreCase(itemName)) {
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[--itemCount] = null;
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println("Item not found in the cart.");
    }

    // calculate total cost
    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += cartItems[i].getTotalPrice();
        }
        return total;
    }

    // display cart items
    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("\n---- Shopping Cart ----");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(cartItems[i].itemName + " - ₹" + cartItems[i].price + " x " +
                        cartItems[i].quantity + " = ₹" + cartItems[i].getTotalPrice());
            }
            System.out.println("Total Cost: ₹" + getTotalCost());
        }
    }
}

// Main class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Checkout & Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter price: ₹");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = sc.nextLine();
                    cart.removeItem(removeItem);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    System.out.println("Final Bill: ₹" + cart.getTotalCost());
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}


// Sample Case
// 1. Add Item
// 2. Remove Item
// 3. Display Cart
// 4. Checkout & Exit
// Choose an option: 1
// Enter item name: Chips
// Enter price: ?500
// Enter quantity: 2
// Chips added to the cart.

// 1. Add Item
// 2. Remove Item
// 3. Display Cart
// 4. Checkout & Exit
// Choose an option: 3

// ---- Shopping Cart ----
// Chips - ?500.0 x 2 = ?1000.0
// Total Cost: ?1000.0

// 1. Add Item
// 2. Remove Item
// 3. Display Cart
// 4. Checkout & Exit
// Choose an option: 4
// Final Bill: ?1000.0
// Thank you for shopping!