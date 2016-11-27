package appliedsoftwareengineeringassignment;

public class SaxonApplication {

    public static void main(String[] args) {
        //// Make the SaxonSystem object ////
        SaxonSystem saxon = new SaxonSystem();
        
        //// Making Sites ////
        // Make 2 sites to go in each Region
        // SITES FOR LONDON
        Site londonSite1 = new Site("London Place 1", 200, "Silver");
        Site londonSite2 = new Site("London Place 2" , 10000, "Bronze");
        
        // SITES FOR MIDLANDS
        Site midlandsSite1 = new Site("Midlands Place 1", 100, "Bronze");
        Site midlandsSite2 = new Site("Midlands Place 2" , 30000, "Gold");
        
        // SITES FOR NORTHEAST
        Site northEastSite1 = new Site("North East Place 1", 0, "Gold");
        Site northEastSite2 = new Site("North East Place 2", 1, "Silver");
        
        // SITES FOR NORTHWEST
        Site northWestSite1 = new Site("North West Place 1", 40000, "Silver");
        Site northWestSite2 = new Site("North West Place 2", 20000, "Silver");
        
        // SITES FOR SOUTHEAST
        Site southEastSite1 = new Site("South East Place 1", 1000, "Gold");
        Site southEastSite2 = new Site("South East Place 2", 60000, "Gold");
        
        // SITES FOR SOUTHWEST
        Site southWestSite1 = new Site("South West Place 1", 2, "Gold");
        Site southWestSite2 = new Site("South West Place 2", 30000, "Silver");
        
        //// Using the factory to make regions ////
        RegionFactory regionFactory = new RegionFactory();
        // Making the regions 
        Region london = regionFactory.makeRegion("LONDON");
        Region midlands = regionFactory.makeRegion("MIDLANDS");
        Region northEast = regionFactory.makeRegion("NORTH EAST");
        Region northWest = regionFactory.makeRegion("NORTH WEST");
        Region southEast = regionFactory.makeRegion("SOUTH EAST");
        Region southWest = regionFactory.makeRegion("SOUTH WEST");
        
        //// Add the sites to the regions, 2 sites for each regions ////
        london.addSite(londonSite1);
        london.addSite(londonSite2);
        midlands.addSite(midlandsSite1);
        midlands.addSite(midlandsSite2);
        northEast.addSite(northEastSite1);
        northEast.addSite(northEastSite2);
        northWest.addSite(northWestSite1);
        northWest.addSite(northWestSite2);
        southEast.addSite(southEastSite2);
        southEast.addSite(southEastSite2);
        southWest.addSite(southWestSite1);
        southWest.addSite(southWestSite2);
        
        saxon.addSite(londonSite1);
        saxon.addSite(londonSite2);
        saxon.addSite(midlandsSite1);
        saxon.addSite(midlandsSite2);
        saxon.addSite(northEastSite1);
        saxon.addSite(northEastSite2);
        saxon.addSite(northWestSite1);
        saxon.addSite(northWestSite2);
        saxon.addSite(southEastSite2);
        saxon.addSite(southEastSite2);
        saxon.addSite(southWestSite1);
        saxon.addSite(southWestSite2);

        
        // Add the Regions to the saxon System
        saxon.addRegion(london);
        saxon.addRegion(midlands);
        saxon.addRegion(northEast);
        saxon.addRegion(northWest);
        saxon.addRegion(southEast);
        saxon.addRegion(southWest);
        
        System.out.println("Before update");
        System.out.println(saxon);
        System.out.println("\n\n");
        
        System.out.println(saxon.updateSitePopularity());
        
        System.out.println("\n\n\n\n\n");
        System.out.println(saxon.printPrioritisedSites());
        
    }
    
}
