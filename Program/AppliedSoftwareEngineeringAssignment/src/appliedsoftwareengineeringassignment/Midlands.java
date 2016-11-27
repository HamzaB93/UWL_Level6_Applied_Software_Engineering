package appliedsoftwareengineeringassignment;

import java.util.ArrayList;
public class Midlands implements Region {
    
    //// Properties ////
    // Name of the Region
    private String regionName;
    // The list of sites
    private ArrayList<Site>sites;
    
    //// Constructor ////
    // No need for parameterised
    public Midlands() {
        regionName = "Midlands";
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
        return "Region: Midlands\nList of sites: " + sites + "\n";
    }
}
