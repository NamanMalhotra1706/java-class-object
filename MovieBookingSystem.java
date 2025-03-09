import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    // book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at Seat No: " + seatNumber);
        } else {
            System.out.println("Sorry! Seat " + seatNumber + " is already booked.");
        }
    }

    // display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("\n---- Ticket Details ----");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket booked for Seat No: " + seatNumber);
        }
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter Ticket Price: ₹");
        double price = sc.nextDouble();

        // MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);


        ticket.bookTicket();

    
        ticket.displayTicketDetails();

    }
}


// Enter Movie Name: Harry Potter
// Enter Seat Number: 25
// Enter Ticket Price: ?1500
// Ticket booked successfully for Harry Potter at Seat No: 25  

// Output
// ---- Ticket Details ----
// Movie Name: Harry Potter
// Seat Number: 25
// Price: ?1500.0