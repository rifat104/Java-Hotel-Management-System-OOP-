public class Guest extends Customer {
    private String guestType; // e.g., VIP, Regular, etc.

    public Guest(String roomNumber, String name, String address, String phoneNumber, String email, 
                 String nationality, String period, String arrivalDate, String guestType) {
        super(roomNumber, name, address, phoneNumber, email, nationality, period, arrivalDate);
        this.guestType = guestType;
    }
    public String getGuestType() {
        return guestType;
    }
    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    // Print details method for Guest
    @Override
    public void printDetails() {
        super.printDetails();  // Print customer details
        System.out.println("Guest Type: " + guestType);
    }
}
