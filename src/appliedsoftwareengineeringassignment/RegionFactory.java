package appliedsoftwareengineeringassignment;

public class RegionFactory {
    
    // To return different regions as Region type based on string argument
    public Region makeRegion(String regionName) {
        
        if (regionName.equalsIgnoreCase("LONDON")) {
            return new London();
        }
        else if (regionName.equalsIgnoreCase("MIDLANDS")){
            return new Midlands();
        }
        else if (regionName.equalsIgnoreCase("SOUTH EAST")){
            return new SouthEast();
        }
        else if (regionName.equalsIgnoreCase("SOUTH WEST")){
            return new SouthWest();
        }
        else if (regionName.equalsIgnoreCase("NORTH EAST")){
            return new NorthEast();
        }
        else if (regionName.equalsIgnoreCase("NORTH WEST")){
            return new NorthWest();
        }
        // Otherwise return nothing
        return null;
    }
}
