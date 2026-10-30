public class Employee {
    // Fields
    private String empId;
    private String empName;
    private double salary;
    private boolean isIntern;

    // Constructor for permanent employees (isIntern set to false)
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for interns chaining to the 3-argument constructor with salary = 0, then setting isIntern to true
    public Employee(String empId, String empName) {
        this(empId, empName, 0.0);
        this.isIntern = true;
    }

    // Prints all four fields on one formatted line
    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }

    public static void main(String[] args) {
        // Create permanent employee
        Employee permanentEmployee = new Employee("E-101", "Divya", 65000);

        // Create intern employee
        Employee internEmployee = new Employee("E-102", "Arjun");

        // Print profiles
        permanentEmployee.printProfile();
        internEmployee.printProfile();
    }
}