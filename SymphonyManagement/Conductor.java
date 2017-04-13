/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

public class Conductor extends Person {

    private String id;

    public Conductor(String id, String name, String address, String phone) {
        super(name, address, phone);
        this.id = id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getId() {
        return this.id;
    }
}
