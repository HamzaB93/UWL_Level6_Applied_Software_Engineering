package appliedsoftwareengineeringassignment;

import java.util.ArrayList;

public class SouthEast implements Region {
    
    //// Properties ////
    // Name of the Region
    private String regionName;
    // The list of sites
    private ArrayList<Site>sites;
    
    //// Constructor ////
    // No need for parameterised
    public SouthEast() {
        regionName = "South East";
        sites = new ArrayList<Site>();
    }
    
    // Method from RegionInterface
    @Override
    public void addSite(Site siteToAdd){
        sites.add(siteToAdd);
    }

    // Get the arrayList of sites
    @Override
    public ArrayList<Site> getSites() {
        return sites;
    }
    
    //// toString ////
    
    // To output object as string
    public String toString() {
        return "Region: South East\nList of sites: " + sites + "\n";
    }
}
