package SymphonyManagement;

import java.util.ArrayList;

/**
 *
 * @author Erik Njolstad
 * @version 1.0
 */
public class Performance extends ArrayList<Composition> {
    private Date performDate;
    
    public Performance() {
    }
    
    public void setPerformDate(Date inPerformDate) {
        this.performDate = inPerformDate;
    }
    
    public Date getPerformDate() {
        return this.performDate;
    }
}
