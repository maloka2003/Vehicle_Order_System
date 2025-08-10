import java.util.Map;

public class Cars extends VehicleOrderSystem.Vehicle {

    Cars(String regNum, String type, String fuel, Map<String, Object> feats) {
        super(regNum, type, fuel, feats);
    }
}