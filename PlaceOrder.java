import java.util.Map;

public class PlaceOrder {
    public void placeOrder(String type, Map<String, Object> desiredFeatures) {
        if (VehicleOrderSystem.checkAvailability(type, desiredFeatures)) {
            VehicleOrderSystem.Vehicle v = VehicleOrderSystem.reserveVehicle(type, desiredFeatures);
            double price = VehicleOrderSystem.calculatePrice(v);
            System.out.println("Vehicle reserved: " + v.registrationNumber);
            System.out.println("Total price: $" + price);
        } else {
            System.out.println("No available vehicle matches your criteria.");
        }
    }
}
