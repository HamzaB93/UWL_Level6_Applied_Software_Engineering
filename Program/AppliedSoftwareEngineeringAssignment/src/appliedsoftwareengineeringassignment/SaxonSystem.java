package appliedsoftwareengineeringassignment;

import java.time.LocalDate;
import java.util.ArrayList;

public class SaxonSystem {

    //// Properties ////
    private ArrayList<Region> regions;
    private ArrayList<Site> sites;
    private ArrayList<Site> prioritsedSites;
    private LocalDate currentDate;
    
    // Will be used as a way of checking if the current data is 30th
    private LocalDate date = LocalDate.parse("2016-12-30");
      
    //// Constructor ////
    
    // Default, no need for parameterised
    public SaxonSystem() {
        regions = new ArrayList<Region>();
        sites = new ArrayList<Site>();
        prioritsedSites = new ArrayList<Site>();
        currentDate = LocalDate.parse("2016-12-30");
    }

    //// Getter ////
    
    // Return the currentDate
    public LocalDate getCurrentDate() {
        return currentDate;
    }    


    //// Setter ////
    // Set the currentDate to compare
    public void setCurrentDate(String d) {
        this.currentDate = currentDate.parse(d);
    }

    //// Add methods ////
    
    // Adding region objects
    public void addRegion(Region regionToAdd) {
        regions.add(regionToAdd);
    }

    // Adding site objects
    public void addSite(Site siteToAdd) {
        sites.add(siteToAdd);
    }

    // BUSINESS LOGIC - Add a site to priority
    public void addToPriorities(Site siteToAdd) {
        prioritsedSites.add(siteToAdd);
    }
    
    // USE CASE - Update the site popularity
    // Checks date, loops through Sites, gets the siteVisitors,
    // sets a new sitePopularity based on visitors, 
    // Checks if marketting needed, finishes
    public String updateSitePopularity() {       
        if (currentDate.equals(date)) {
            Site s;
            
            for (int i = 0; i < sites.size(); i++) {   
                s = sites.get(i);
                
                int visitors = s.getSiteVisitors();

                if (visitors < 10000) {
                    s.setSitePopularity("Bronze");
                } else if (visitors >= 10000 && visitors < 30000) {
                    s.setSitePopularity("Silver");  
                } else {
                    s.setSitePopularity("Gold");
                }
                
                prioritiseSiteForMarketing(s);
            }
                return ("All site popularity ratings have been updated"
                    + "\n" + regions);
                
        } else {
            return ("Cant Update Popularity yet. Wait till 30th Dec");
        }
    }

    // USE CASE - Identify if site needs marketing 
    // Site as argument, check siteVisitors, add to martketting
    public void prioritiseSiteForMarketing(Site siteToPrioritise){      
        if(siteToPrioritise.getSiteVisitors() < 5000) {
            // Add it to a list
            prioritsedSites.add(siteToPrioritise);
        }     
    }
    
    //// toString ////
    
    // To print out the list of prioritised sites
    public String printPrioritisedSites() {
        return ("Sites that are now priorities\n" + prioritsedSites);
    }
    
    // To print out the object as string
    public String toString() {
        return "Saxon System\nRegion Details:\n" + regions;
    }
}
