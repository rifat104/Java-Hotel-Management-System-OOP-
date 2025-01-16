import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelManagement hotel = new HotelManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("*************************************\n********** East West Hotel **********\n*************************************");
            System.out.println("\n1. CheckIn Customer");
            System.out.println("2. Add Guest");
            System.out.println("3. View Customers");
            System.out.println("4. Search Customer");
            System.out.println("5. CheckOut Customer");
            System.out.println("6. Add Employee");
            System.out.println("7. View Employees");
            System.out.println("8. Delete Employee");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Customer
                    System.out.print("Enter Room Number: ");
                    String roomNumber = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Nationality: ");
                    String nationality = sc.nextLine();
                    System.out.print("Enter Period: ");
                    String period = sc.nextLine();
                    System.out.print("Enter Arrival Date: ");
                    String arrivalDate = sc.nextLine();

                    hotel.addCustomer(new Customer(roomNumber, name, address, phoneNumber, email, nationality, period, arrivalDate));
                    break;

                case 2: // Add Guest
                    System.out.print("Enter Room Number: ");
                    String guestRoomNumber = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String guestName = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String guestAddress = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String guestPhoneNumber = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String guestEmail = sc.nextLine();
                    System.out.print("Enter Nationality: ");
                    String guestNationality = sc.nextLine();
                    System.out.print("Enter Period: ");
                    String guestPeriod = sc.nextLine();
                    System.out.print("Enter Arrival Date: ");
                    String guestArrivalDate = sc.nextLine();
                    System.out.print("Enter Guest Type (VIP/Regular): ");
                    String guestType = sc.nextLine();

                    hotel.addGuest(new Guest(guestRoomNumber, guestName, guestAddress, guestPhoneNumber, guestEmail, guestNationality, guestPeriod, guestArrivalDate, guestType));
                    break;

                case 3: // View Customers
                    hotel.viewCustomers();
                    break;

                case 4: // Search Customer
                    System.out.print("Enter Room Number to Search: ");
                    Customer foundCustomer = hotel.searchCustomer(sc.nextLine());
                    if (foundCustomer != null) {
                        foundCustomer.printDetails();
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 5: // Delete Customer
                    System.out.print("Enter Room Number to CheckOut: ");
                    hotel.deleteCustomer(sc.nextLine());
                    break;

                case 6: // Add Employee
                    System.out.print("Enter Employee ID: ");
                    String empId = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String empName = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String empAddress = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String empPhone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String empEmail = sc.nextLine();
                    System.out.print("Enter Role: ");
                    String empRole = sc.nextLine();

                    hotel.addEmployee(new Employee(empId, empName, empAddress, empPhone, empEmail, empRole));
                    break;

                case 7: // View Employees
                    hotel.viewEmployees();
                    break;

                case 8: // Delete Employee
                    System.out.print("Enter Employee ID to Delete: ");
                    hotel.deleteEmployee(sc.nextLine());
                    break;

                case 9: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
