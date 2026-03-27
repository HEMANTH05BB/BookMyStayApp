import java.util.HashMap;
import java.util.Map;

 class RoomInventory {

    // Map to store room type (Key) and available count (Value)
    private Map<String, Integer> roomAvailability;


    public RoomInventory() {
        this.roomAvailability = new HashMap<>();
        initializeInventory();
    }


    private void initializeInventory() {
        // Registering room types with initial counts
        roomAvailability.put("Single", 10);
        roomAvailability.put("Double", 7);
        roomAvailability.put("Suite", 3);
        roomAvailability.put("Penthouse", 1);
    }


    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }


    public void updateAvailability(String roomType, int count) {
        if (roomAvailability.containsKey(roomType)) {
            roomAvailability.put(roomType, count);
        } else {
            System.out.println("Error: Room type '" + roomType + "' does not exist.");
        }
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {
        // 1. Initialize the inventory component
        RoomInventory inventory = new RoomInventory();

        System.out.println("--- Initial Room Inventory ---");
        displayInventory(inventory);

        // 2. Perform a controlled update (e.g., a "Double" room was booked)
        System.out.println("\nUpdating 'Double' room availability to 6...");
        inventory.updateAvailability("Double", 6);

        // 3. Display the updated state
        System.out.println("--- Updated Room Inventory ---");
        displayInventory(inventory);
    }


    private static void displayInventory(RoomInventory inventory) {
        Map<String, Integer> currentStatus = inventory.getRoomAvailability();

        for (Map.Entry<String, Integer> entry : currentStatus.entrySet()) {
            System.out.println("Room Type: " + entry.getKey() + " | Available: " + entry.getValue());
        }
    }
}