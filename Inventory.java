import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    // List to store all vehicles
    static List<VehicleOrderSystem.Vehicle> inventory;


    public  Inventory() {
        inventory = new ArrayList<>();
        // Initialize with some vehicles
        Map<String, Object> carFeatures = new HashMap<>();
        carFeatures.put("sunroof", true);
        carFeatures.put("transmission", "Automatic");
        inventory.add(new Inventory().Vehicle("ABC123", "Car", "Petrol", carFeatures));

        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        inventory.add(new Inventory().Vehicle("XYZ789", "Truck", "Diesel", truckFeatures));
    }

    private VehicleOrderSystem.Vehicle Vehicle(String abc123, String car, String petrol, Map<String, Object> carFeatures) {
        return null;
    }
}
