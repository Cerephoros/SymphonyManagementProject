/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

/**
 *
 *
 * @author Richard
 *
 */
class PersonalInfo {

    private String name;
    private Address address;
    private Contact contact;

    PersonalInfo() {
        address = new Address();
        contact = new Contact();
    }

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address.setAddress(address);
    }

    void setPhone(String phone) {
        contact.setPhone(phone);
    }

    void setEmail(String email) {
        contact.setEmail(email);
    }

    String getName() {
        return this.name;
    }

    String getAddress() {
        return this.address.getAddress();
    }

    String getPhone() {
        return this.contact.getPhone();
    }

    String getEmail() {
        return this.contact.getEmail();
    }
}
