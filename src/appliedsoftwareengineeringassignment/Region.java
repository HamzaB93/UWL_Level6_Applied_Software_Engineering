package appliedsoftwareengineeringassignment;

import java.util.ArrayList;

public interface Region {
    
    // All classes implementing this interface should have addSite
    public void addSite(Site siteToAdd);
    // Only needed for testing purposes
    public ArrayList<Site> getSites();
}
