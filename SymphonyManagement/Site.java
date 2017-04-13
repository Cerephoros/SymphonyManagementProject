package SymphonyManagement;

/**
 *
 * @author Erik Njolstad
 * @version 1.0
 */
class Site extends Address {
    
    private int seatsAvailable;
    
    @Override
    void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    void setPostal(String postal) {
        super.setPostal(postal);
    }

    void setSeats(int seats) {
        this.seatsAvailable = seats;
    }

    @Override
    String getAddress() {
        return super.getAddress();
    }

    @Override
    String getPostal() {
        return super.getPostal();
    }

    int getSeats() {
        return seatsAvailable;
    }
}
