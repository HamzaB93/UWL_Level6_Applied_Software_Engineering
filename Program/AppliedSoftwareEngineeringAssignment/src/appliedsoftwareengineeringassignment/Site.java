package appliedsoftwareengineeringassignment;

public class Site implements SiteInterface{
    //// Properties ////
    private String siteName;
    private int siteVisitors;
    private String sitePopularity;
    
    //// Constructor ////
    //Default
    public Site() {
        siteName = "New Site";
        siteVisitors = 0;
        sitePopularity = "Bronze";
    }
    // Parameterised
    public Site(String siteName, int siteVisitors, String sitePopularity) {
            this.siteName = siteName;
            this.siteVisitors = siteVisitors;
            this.sitePopularity = sitePopularity;
    }
    
    //// Getters ////
    
    // Get the name
    public String getSiteName() {
        return siteName;
    }
    
    // Get the amount of visitorts
    public int getSiteVisitors() {
        return siteVisitors;
    }
    
    // Get the popularity of the site
    public String getSitePopularity() {
        return sitePopularity;
    }
    
    //// Setters ////
    
    // Set a new name for the site
    public void setSiteName(String newSiteName) {
        this.siteName = newSiteName;
    }
    
    // Set a new visitor count for the site
    public void setSiteVisitors(int newSiteVisitors) {
        this.siteVisitors = newSiteVisitors;
    }
    
    // Set a new popualrity rating
    public void setSitePopularity(String newSitePopularity) {
        this.sitePopularity = newSitePopularity;
    }

    //// toString ////
    
    // Output object as string
    public String toString() {
        return ("\nSite Name: " + siteName + "; Visitors: " + siteVisitors 
                + "; Popularity Rating: " + sitePopularity );
    }
}
