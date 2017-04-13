package SymphonyManagement;

import java.util.ArrayList;

/**
 *
 * @author Erik Njolstad
 * @version 1.0
 */
public class Composition {

    private String compositionID;
    private String compositionName;
    private String composer;
    private ArrayList<Movement> movement;

    private Composition(BuildComposition builder) {
        this.compositionID = builder.getCompositionID();
        this.compositionName = builder.getCompositionName();
        this.composer = builder.getComposer();
        this.movement = builder.getMovement();
    }

    public static Composition getComposition(BuildComposition builder) {
        return new Composition(builder);
    }
}
