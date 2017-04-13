package SymphonyManagement;

/**
 * 
 * @author Erik Njolstad
 * @version 1.0
 */
public class Concert {
    private String concertID;
    private Date concertDate;
    private Site concertSite;
    
    private Concert(String constructConcertID, Date constructConcertDate, Site constructConcertSite) {
        this.concertID = constructConcertID;
        this.concertDate = constructConcertDate;
        this.concertSite = constructConcertSite;
    }
    
    public static Concert getConcert(BuildConcert build) {
        return new Concert(build.getConcertID(), build.getConcertDate(), build.getConcertSite());
    }
}
