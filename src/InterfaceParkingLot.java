import java.util.ArrayList;

public interface InterfaceParkingLot {
    int totalSpaces();
    int remainingSpaces();
    boolean isFull();
    boolean isEmpty();
    boolean isCompactFull();
    boolean isRegularFull();
    void addVehicle(Vehicle vehicle);
    void removeVehicle(Vehicle vehicle);
    ArrayList<String> spacesByVehicle(Vehicle vehicle);
}