public class Customer extends Person {
    private String roomNumber;
    private String nationality;
    private String period;
    private String arrivalDate;

    public Customer(String roomNumber, String name, String address, String phoneNumber, String email, String nationality, String period, String arrivalDate) {
        super(name, address, phoneNumber, email);
        this.roomNumber = roomNumber;
        this.nationality = nationality;
        this.period = period;
        this.arrivalDate = arrivalDate;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getPeriod() {
        return period;
    }
    public void setPeriod(String period) {
        this.period = period;
    }
    public String getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    // Print details method for Customer
    @Override
    public void printDetails() {
        super.printDetails();  // Print common details from Person
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Nationality: " + nationality);
        System.out.println("Period: " + period);
        System.out.println("Arrival Date: " + arrivalDate);
    }
}
