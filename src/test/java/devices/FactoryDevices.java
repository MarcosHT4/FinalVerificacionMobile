package devices;

import java.util.HashMap;
import java.util.Map;

public class FactoryDevices {

    private static Map<String, IDevice> devicesMap = new HashMap<>();

    public static IDevice make(String type){
        devicesMap.put("android",new Android());
        devicesMap.put("ios",new iOS());
        devicesMap.put("cloud",new AndroidCloud());
        return devicesMap.containsKey(type.toLowerCase()) ? devicesMap.get(type.toLowerCase()) : devicesMap.get("android");
    }

}
