package appliedsoftwareengineeringassignment;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({appliedsoftwareengineeringassignment.SouthEast.class, 
    appliedsoftwareengineeringassignment.Site.class, 
    appliedsoftwareengineeringassignment.RegionFactory.class, 
    appliedsoftwareengineeringassignment.NorthEast.class, 
    appliedsoftwareengineeringassignment.Midlands.class, 
    appliedsoftwareengineeringassignment.Region.class, 
    appliedsoftwareengineeringassignment.NorthWest.class, 
    appliedsoftwareengineeringassignment.SaxonSystem.class, 
    appliedsoftwareengineeringassignment.SouthWest.class, 
    appliedsoftwareengineeringassignment.London.class, 
    appliedsoftwareengineeringassignment.SaxonApplication.class})

public class SaxonUnitTesting extends TestCase{
    
    // Objects needed to test
    SaxonSystem saxonTest;
    Site siteTest1;
    Site siteTest2;
    Site siteTest3;
    RegionFactory factoryTest;
    Region londonTest;
    Region midlandsTest;
    Region northEastTest;
    Region northWestTest;
    Region southEastTest;
    Region southWestTest;
    
    // Setting up the objects for testing
    // Objects can be created using the default or parameterised constructors
    protected void setUp() throws Exception {
        // Set up saxon
        saxonTest = new SaxonSystem();
        
        // Set up some sites to test
        siteTest1 = new Site("Test site 1" , 10000, "Silver");
        siteTest2 = new Site();
        siteTest3 = new Site("Test site 2" , 3, "Gold");
        
        // Set up the regions with the factory
        factoryTest = new RegionFactory();
        londonTest = factoryTest.makeRegion("LONDON");
        midlandsTest = factoryTest.makeRegion("MIDLANDS");
        northEastTest = factoryTest.makeRegion("NORTH EAST");
        northWestTest = factoryTest.makeRegion("NORTH WEST");
        southEastTest = factoryTest.makeRegion("SOUTH EAST");
        southWestTest = factoryTest.makeRegion("SOUTH WEST");
        
        // Adding sites to regions
        londonTest.addSite(siteTest1); 
        londonTest.addSite(siteTest2);
        londonTest.addSite(siteTest3);
        midlandsTest.addSite(siteTest1);
        northEastTest.addSite(siteTest2);
        northWestTest.addSite(siteTest3);
        southEastTest.addSite(siteTest1);
        southEastTest.addSite(siteTest2);
        southWestTest.addSite(siteTest2);
        
        // Adding sites to saxon
        saxonTest.addSite(siteTest1);
        saxonTest.addSite(siteTest2);
        saxonTest.addSite(siteTest3);  
        
        // Add regions to saxon
        saxonTest.addRegion(londonTest);
        saxonTest.addRegion(midlandsTest);
        saxonTest.addRegion(northEastTest);
        saxonTest.addRegion(northWestTest);
        saxonTest.addRegion(southEastTest);
        saxonTest.addRegion(southWestTest);
    }
    
    // Testing precondition
    // Test if default constructed site is Bronze rating
    public void testDefaultSiteRating() {
        String siteRating = siteTest2.getSitePopularity();
        assertEquals(siteRating, "Bronze");
    }
    
    // Testing precondition
    // Test should be true as long as there is a site within it
    public void testCheckForSites() {
        ArrayList<Site> sitesTest = londonTest.getSites();
        int i;
        for (i = 0 ; i < sitesTest.size() ; i++) {
            i = i+1;
        }
        
        assertTrue(i > 0);
    }
    
    // Test getVisitors to see if it works
    public void testGetVisitors() {
        int visitors = siteTest1.getSiteVisitors();
        assertEquals(visitors, 10000);
    }
    
    // Test setPopularity to see if it works 
    public void testSetPopularity() {
        Site st = new Site("Temp site", 2, "Gold");
        st.setSitePopularity("Bronze");
        assertTrue(st.getSitePopularity() == "Bronze");
    }
    
    // Testing part of the updateSitePopularity 
    // Testing setPopualrity in different cases
    public void testChangePopularityByVisitors() {
        // In case of siteTest1, end up as Silver
        // In case of siteTest3, end up as Bronze
        
        //int visitors = siteTest1.getSiteVisitors();
        int visitors = siteTest3.getSiteVisitors();

        if(visitors < 10000) {
            siteTest3.setSitePopularity("Bronze");
        } else if (visitors >= 10000 && visitors <= 30000) {
            siteTest3.setSitePopularity("Silver");
        } else if (visitors > 30000) {
            siteTest3.setSitePopularity("Gold");
        }
        //assertEquals(siteTest1.getSitePopularity(), "Silver");
        assertEquals(siteTest3.getSitePopularity(), "Bronze");
    }
    
    // Testing the logic for the prioritise site method
    // Test prioritiseSite to see if the correct site is added to the list
    public void testPrioritiseSite() {
        boolean added = false;
        
        // Should be false, wont be added
//        if(siteTest1.getSiteVisitors() < 5000){
//            saxonTest.addToPriorities(siteTest1);
//            added = true;
//        }
        
        // Should be true, will be added
        if (siteTest2.getSiteVisitors() < 5000) {
            saxonTest.addToPriorities(siteTest2);
            added = true;
        }
        
        // Should be true, will be added
//        if (siteTest3.getSiteVisitors() < 5000) {
//            saxonTest.addToPriorities(siteTest3);
//            added = true;
//        }

        assertTrue(added);
    }
    
}
