import java.util.Scanner;

public class Inverntory {
    String itemName;
    int itemCode;
    int price;

    Inverntory(String itemName, int itemCode, int price){
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
    }

    public String getItemName(){
        return "Item name: "+itemName;
    }

    public int getItemCode(){
        return itemCode;
    }

    public int getItemPrice(){
        return price;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Item name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter the Item code: ");
        int itemCode = sc.nextInt();

        System.out.print("Enter the Item price: ");
        int price = sc.nextInt();

        Inverntory item1 = new Inverntory(itemName, itemCode, price);
        System.out.println("Item name: " + item1.getItemName());
        System.out.println("Item code : " + item1.getItemCode());
        System.out.println("Item price: Rs." + item1.getItemPrice());
    }
}

// Sample Case
// Enter the Item name: Lays
// Enter the Item code: 101
// Enter the Item price: 20

// Ouput
// Item name: Item name: Lays
// Item code : 101
// Item price: Rs.20
