import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    int price;

    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getPhoneBrand(){
        return "Phone brand is " + brand;
    }

    public String getPhoneModel(){
        return "Phone Model is " + model;
    }

    public int getPhonePrice(){
        return price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Phone model: ");
        String model = sc.next();

        System.out.print("Enter the phone brand: ");
        String brand = sc.next();

        System.out.print("Enter the phone price: ");
        int price = sc.nextInt();

        MobilePhone samsung = new MobilePhone(brand, model, price);
        System.out.println(samsung.getPhoneBrand());
        System.out.println(samsung.getPhoneModel());
        System.out.println(samsung.getPhonePrice());

    }
}

// Sample Case
// Enter the Phone model: F-14
// Enter the phone brand: Samsung
// Enter the phone price: 15000

// Output
// Phone brand is Samsung
// Phone Model is F-14
// 15000
