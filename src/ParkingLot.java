import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public abstract class ParkingLot implements InterfaceParkingLot {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private int compactSpaces;
    private int regularSpaces;
    private int compactSpacesUsed;
    private int regularSpacesUsed;

    public ParkingLot(int compactSpaces, int regularSpaces) {
        this.compactSpaces = compactSpaces;
        this.regularSpaces = regularSpaces;
    }

    public ArrayList<Vehicle> getVehicles() {
        List<String> vehicleTypes = this.vehicles.stream().map(vehicle -> vehicle.getType()).collect(Collectors.toList());
        System.out.println(vehicleTypes);
        return vehicles;
    }

    @Override
    public int totalSpaces() {
        int output = compactSpaces + regularSpaces;
        System.out.println("Total spaces: " + output);
        System.out.println("Compact spaces: " + compactSpaces);
        System.out.println("Regular spaces: " + regularSpaces);
        return output;
    }



    private void removeSpaceBySize(int size) {
        if (size == 1 || size == 2 && this.regularSpacesUsed >= 1) {
            this.regularSpacesUsed -= 1;
            return;
        }

        if (size == 1 || size == 2 && this.compactSpacesUsed >= 1) {
            this.compactSpacesUsed -= 1;
            return;
        }

        if (size == 3 && (this.regularSpacesUsed >= 3)  ) {
            this.regularSpacesUsed -= 3;
            return;
        }


    }
}
