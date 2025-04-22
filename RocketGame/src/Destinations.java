import java.util.HashMap;
import java.util.Map;

public class Destinations {
    Map<String, Long> planetDistances = new HashMap<>();

    public Destinations () {

    
    planetDistances.put("Moon", 384400L);
    planetDistances.put("Mars", 225000000L);
    planetDistances.put("Jupiter", 778500000L); 
    }
}
