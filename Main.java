import java.util.HashMap;
import java.util.Map;

public class Main {
public  static void main(String[] args)  {
    VehicleOrderSystem system = new VehicleOrderSystem();

    // Example order for a Car with sunroof and automatic transmission
    Map<String, Object> features = new HashMap<>();
    features.put("sunroof", true);
    features.put("transmission", "Automatic");
    system.placeOrder("Car", features);

    // Example order for a Truck with cargo capacity 1500
    Map<String, Object> truckFeatures = new HashMap<>();
    truckFeatures.put("cargoCapacity", 1500);
    system.placeOrder("Truck", truckFeatures);
}}
