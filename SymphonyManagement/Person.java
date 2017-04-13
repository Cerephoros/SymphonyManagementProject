/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

class Person extends PersonalInfo {

    Person(String name, String address, String phone) {
        super.setName(name);
        super.setAddress(address);
        super.setPhone(phone);
    }

    @Override
    void setName(String name) {
        super.setName(name);
    }

    @Override
    void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    void setPhone(String phone) {
        super.setPhone(phone);
    }

    @Override    
    void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    String getName() {
        return super.getName();
    }

    @Override
    String getAddress() {
        return super.getAddress();
    }

    @Override
    String getPhone() {
        return super.getPhone();
    }

    @Override
    String getEmail() {
        return super.getEmail();
    }
}
