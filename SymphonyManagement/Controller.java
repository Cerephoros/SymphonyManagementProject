/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

import java.util.ArrayList;

/**
 *
 * @author Sony
 */
public class Controller {
    private static Season season = new Season();
    private static Concert mainConcert;
    private static Movement mainMovement;
    private static Composition mainComposition;
    private static Date mainDate;
    private static Conductor mainConductor;
    private static Site mainSite;
    private static Performance mainPerformance;
    
    public static void addConcert(Concert concert) {
            season.add(concert);
        }
    
    public static void main (String [] args) {
        mainMovement = new BuildMovement().movementName("Something").movementID("movement_id").build();
        ArrayList<Movement> movementList = new ArrayList<>();
        movementList.add(mainMovement);
        
        mainComposition = new BuildComposition("composition_id", "Some composition").movement(movementList).build();
        
        mainPerformance = new Performance();
        mainDate = new Date(2017,4,13, new Time(6,1));
        mainPerformance.setPerformDate(mainDate);
        mainPerformance.add(mainComposition);
        
        mainConductor = new Conductor("conductor_id", "Some conductor's name", "Some address", "613-320-3252");
        
        mainSite = new Site();
        mainSite.setSeats(300);
        mainSite.setAddress("95 Someplace Avenue");
        mainSite.setPostal("T5D-7R4");
        
        mainConcert = new BuildConcert("concert_id", mainDate, mainSite).conductor(mainConductor).performances(mainPerformance).build();
        addConcert(mainConcert);
        
        System.out.printf("%s, %s, %s, %s", mainConductor.getId(), mainConductor.getName(), mainConductor.getAddress(), mainConductor.getPhone() + "\n");
        System.out.printf("%s, %s, %s", mainSite.getSeats(), mainSite.getAddress(), mainSite.getPostal() + "\n");
        System.out.printf("%s", mainDate.toString() + "\n");
    }
}
