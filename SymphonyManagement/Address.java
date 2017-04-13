/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

public class Address {

    private String address;
    private String postal;

    
    void setAddress(String address) {
        this.address = address;
    }

    void setPostal(String postal) {
        this.postal = postal;
    }

    String getAddress() {
        return this.address;
    }

    String getPostal() {
        return this.postal;
    }
}
