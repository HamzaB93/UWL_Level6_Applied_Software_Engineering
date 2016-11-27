package appliedsoftwareengineeringassignment;

public class RegionFactory {
    
    // To return different regions as Region type
    public Region makeRegion(String regionName) {
        
        // Return London object
        if (regionName.equalsIgnoreCase("LONDON")) {
            return new London();
        }
        // Return Midlands object
        else if (regionName.equalsIgnoreCase("MIDLANDS")){
            return new Midlands();
        }
        // Return SouthEast object
        else if (regionName.equalsIgnoreCase("SOUTH EAST")){
            return new SouthEast();
        }
        // Return SouthWest object
        else if (regionName.equalsIgnoreCase("SOUTH WEST")){
            return new SouthWest();
        }
        // Return NorthEast
        else if (regionName.equalsIgnoreCase("NORTH EAST")){
            return new NorthEast();
        }
        // Return NorthWest object
        else if (regionName.equalsIgnoreCase("NORTH WEST")){
            return new NorthWest();
        }
        // Otherwise return nothing
        return null;
    }
}
