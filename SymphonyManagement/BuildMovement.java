package SymphonyManagement;

/**
 *
 * @author Erik Njolstad
 * @version 1.0
 */
class BuildMovement {
    private String movementID;
    private String movementName;
    
    public Movement build() {
        return Movement.getMovement(this);
    }
    
    public BuildMovement() {
        
    }
    
    public BuildMovement movementID(String constructMovementID) {
        this.movementID = constructMovementID;
        return BuildMovement.this;
    }
    
    public BuildMovement movementName(String inMovementName) {
        this.movementName = inMovementName;
        return BuildMovement.this;
    }
    
    public String getMovementID() {
        return this.movementID;
    }
    
    public String getMovementName() {
        return this.movementName;
    }
}
