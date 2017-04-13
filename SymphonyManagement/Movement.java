package SymphonyManagement;

/**
 *
 * @author Erik Njolstad
 * @version 1.0
 */
public class Movement {
    private String movementID;
    private String movementName;
    
    private Movement(BuildMovement builder) {
        this.movementID = builder.getMovementID();
        this.movementName = builder.getMovementName();
    }
    
    public static Movement getMovement(BuildMovement builder) {
        return new Movement(builder);
    }
}
