import java.util.*;

public class VehicleOrderSystem {
    public void placeOrder(String car, Map<String, Object> features) {
    }

    // Inner class to represent a Vehicle
    class Vehicle {
      private  String registrationNumber;
        String vehicleType; // e.g., Car, Motorcycle, Truck
        String fuelType; // Petrol, Diesel, Electric, Hybrid
        boolean isAvailable;
        Map<String, Object> features; // e.g., sunroof, cargo capacity, etc.

        Vehicle(String regNum, String type, String fuel, Map<String, Object> feats) {
            this.registrationNumber = regNum;
            this.vehicleType = type;
            this.fuelType = fuel;
            this.isAvailable = true;
            this.features = feats;
        }
    }


    // Method to check availability
    public static boolean checkAvailability(String type, Map<String, Object> desiredFeatures) {
        for (Vehicle v :Inventory.inventory) {
            if (v.vehicleType.equals(type) && v.isAvailable) {
                boolean matches = true;
                for (String key : desiredFeatures.keySet()) {
                    if (!v.features.containsKey(key) || !v.features.get(key).equals(desiredFeatures.get(key))) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to reserve a vehicle
   static public  Vehicle  reserveVehicle(String type, Map<String, Object> desiredFeatures) {
        for (Vehicle v : Inventory.inventory) {
            if (v.vehicleType.equals(type) && v.isAvailable) {
                boolean matches = true;
                for (String key : desiredFeatures.keySet()) {
                    if (!v.features.containsKey(key) || !v.features.get(key).equals(desiredFeatures.get(key))) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    v.isAvailable = false;
                    return v;
                }
            }
        }
        return null; // No matching vehicle available
    }

    // Method to calculate price based on vehicle and features
    public static double calculatePrice(Vehicle v) {
        double basePrice = 0;
        switch (v.vehicleType) {
            case "Car":
                basePrice = 50;
                if (v.features.containsKey("sunroof") && (Boolean) v.features.get("sunroof")) {
                    basePrice += 10;
                }
                break;
            case "Truck":
                basePrice = 80;
                if (v.features.containsKey("cargoCapacity")) {
                    basePrice += ((int) v.features.get("cargoCapacity")) * 0.05;
                }
                break;
            case "Motorcycle":
                basePrice = 30;
                break;
        }
        return basePrice;
    }



}
