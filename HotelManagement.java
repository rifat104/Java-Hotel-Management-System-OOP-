import java.util.*;

public class HotelManagement {
    private List<Customer> customers;
    private List<Employee> employees; //fields will store collections of Customer and Employee objects.
    private final FileManager<Customer> customerFileManager;
    private final FileManager<Employee> employeeFileManager;//customer and employee data read and write

    public HotelManagement() {
        customerFileManager = new FileManager<>("customers.dat");
        employeeFileManager = new FileManager<>("employees.dat"); //file create 
        customers = customerFileManager.loadData();
        employees = employeeFileManager.loadData();
    }

    // Add Customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
        customerFileManager.saveData(customers);
        System.out.println("Customer Check In successfully!");
        System.out.println("*************************************\n************** Invoice **************\n*************************************");
        customer.printDetails(); 
    }

    // Add Guest
    public void addGuest(Guest guest) {
        customers.add(guest);
        customerFileManager.saveData(customers);
        System.out.println("Guest added successfully!");
    }

    // Add Employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        employeeFileManager.saveData(employees);
        System.out.println("Employee added successfully!");
    }

    // View Customers
    public void viewCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customer records found.");
        } else {
            for (Customer customer : customers) {
                System.out.println("*************************************");
                customer.printDetails(); 
                System.out.println("*************************************"); // Explicitly call printDetails() on each customer
            }  // Using printDetails instead of toString
        }
    }

    // View Employees
    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
        } else {
            for (Employee employee : employees) {
                employee.printDetails();  // Explicitly call printDetails() on each employee
            } 
        }
    }

    // Search Customer by Room Number
    public Customer searchCustomer(String roomNumber) {
        for (Customer customer : customers) {
            if (customer.getRoomNumber().equalsIgnoreCase(roomNumber)) {
                return customer;
            }
        }
        return null;  // Return null if not found
    }
    

    // Search Employee by Employee ID
    public Employee searchEmployee(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equalsIgnoreCase(employeeId)) {
                return employee;
            }
        }
        return null;  // Return null if not found
    }
    

    // Delete Customer
    public void deleteCustomer(String roomNumber) {
        Customer customer = searchCustomer(roomNumber);
        if (customer != null) {
            customers.remove(customer);
            customerFileManager.saveData(customers);
            System.out.println("Customer CheckOut successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    // Delete Employee
    public void deleteEmployee(String employeeId) {
        Employee employee = searchEmployee(employeeId);
        if (employee != null) {
            employees.remove(employee);
            employeeFileManager.saveData(employees);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
