package SymphonyManagement;

import java.util.ArrayList;

/**
 *
 * @author Erik Njolstad
 * @version 1.0
 * @param <Concert>
 */
public class Season<Concert> extends ArrayList<Concert> {
    private Date openDate;
    private int seasonLength;
    private static Season season = new Season();
    
    public Season() {
        
    }
    
    /**
     * Parameterized Constructor taking openDate and seasonLength 
     * as its arguments.
     * @param constructOpenDate The open date for the concert
     * @param constructSeasonLength The length of the concert season
     */
    public Season(Date constructOpenDate, int constructSeasonLength) {
        this.openDate = constructOpenDate;
        this.seasonLength = constructSeasonLength;
    }
    
    public Date getOpenDate() {
        return this.openDate;
    }
    
    public int getSeasonLength() {
        return this.seasonLength;
    }
    
    public static Season season() {
        return season;
    }
}
