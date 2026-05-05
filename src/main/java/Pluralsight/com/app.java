package Pluralsight.com;

public class app {
    public static void main(String[] args) {
        Room room101 = new Room(2, 159.00, false, false);
        Room room201 = new Room(2, 159.00, false, false);

        if (room101.isAvailable()) {
            room101.checkIn();
        }

    }
}