package SymphonyManagement;

import java.util.ArrayList;

/**
 *
 * @author Erik Njolstad
 * @version 1.0
 */
public class BuildComposition {
    private String compositionID;
    private String compositionName;
    private String composer;
    private ArrayList<Soloist> soloist = new ArrayList<>();
    private ArrayList<Movement> movement = new ArrayList<>();
    
    public BuildComposition(String constructCompositionID, String constructCompositionName) {
        this.compositionID = constructCompositionID;
        this.compositionName = constructCompositionName;
    }
    
    public Composition build() {
        return Composition.getComposition(this);
    }
    
    public BuildComposition composer(String buildComposer) {
        this.composer = buildComposer;
        return BuildComposition.this;
    }
    
    public BuildComposition soloist(ArrayList<Soloist> buildSoloist) {
        this.soloist = buildSoloist;
        return BuildComposition.this;
    }
    
    public BuildComposition movement(ArrayList<Movement> buildMovement) {
        this.movement = buildMovement;
        return BuildComposition.this;
    }
    
    public String getCompositionID() {
        return this.compositionID;
    }
    
    public String getCompositionName() {
        return this.compositionName;
    }
    
    public String getComposer() {
        return this.composer;
    }
    
    public ArrayList<Soloist> getSoloist() {
        return this.soloist;
    }
    
    public ArrayList<Movement> getMovement() {
        return this.movement;
    }
}
