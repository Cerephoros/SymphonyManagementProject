package SymphonyManagement;

/**
 *
 * @author Erik Njolstad
 * @version 1.0
 */
public class BuildConcert {
    private String concertId;
    private Site concertSite;
    private Date concertDate;
    private Conductor concertConductor;
    private Performance concertPerformances;
    
    public Concert build() {
        return Concert.getConcert(this);
    }
    
    public BuildConcert(String constructConcertID, Date constructConcertDate, Site constructConcertSite) {
        this.concertId = constructConcertID;
        this.concertDate = constructConcertDate;
        this.concertSite = constructConcertSite;
    }
    
    public BuildConcert conductor(Conductor buildConcertConductor) {
        this.concertConductor = buildConcertConductor;
        return BuildConcert.this;
    }
    
    public BuildConcert performances(Performance buildConcertPerformances) {
        this.concertPerformances = buildConcertPerformances;
        return BuildConcert.this;
    }
    
    public String getConcertID() {
        return this.concertId;
    }
    
    public Site getConcertSite() {
        return this.concertSite;
    }
    
    public Date getConcertDate() {
        return this.concertDate;
    }
    
    public Conductor getConcertConductor() {
        return this.concertConductor;
    }
    
    public Performance getConcertPerformances() {
        return this.concertPerformances;
    }
}
