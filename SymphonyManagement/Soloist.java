package SymphonyManagement;

class Soloist extends Person {

    private String id;

    Soloist(String id, String name, String address, String phone) {
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
