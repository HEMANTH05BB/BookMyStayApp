


abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    // Constructor used by child classes
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    // Displays room details
    public void displayRoomDetails() {
        System.out.print("Beds: " + numberOfBeds +
                " | Size: " + squareFeet + " sq ft" +
                " | Price: $" + pricePerNight);
    }
}


class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 800, 5000.0);
    }
}

// 3. MAIN CLASS - The Entry Point
public class BookMyStayApp {
    public static void main(String[] args) {
        // Welcome Message (from Use Case 1)
        System.out.println("========================================");
        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Version: 2.0 (Object Oriented)");
        System.out.println("========================================\n");

        // Step 1: Create Room Objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRm = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Step 2: Static Availability (Simple Variables)
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 1;

        // Step 3: Display Domain and State
        System.out.print("[SINGLE ROOM] -> ");
        single.displayRoomDetails();
        System.out.println(" | Available: " + singleAvailable);

        System.out.print("[DOUBLE ROOM] -> ");
        doubleRm.displayRoomDetails();
        System.out.println(" | Available: " + doubleAvailable);

        System.out.print("[SUITE ROOM ] -> ");
        suite.displayRoomDetails();
        System.out.println(" | Available: " + suiteAvailable);

        System.out.println("\nSystem started and terminated successfully.");
    }
}