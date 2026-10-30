public class CompanyEmployee {
    // Instance fields
    private String empName;
    private double salary;

    // Static fields shared across all instances
    private static String companyName = "Bright Horizon Technologies";
    private static int employeeCount = 0;

    // Constructor: sets instance fields and increments static employeeCount
    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    // Static method that prints company information without referencing any instance field
    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        // Create three Employee objects
        CompanyEmployee emp1 = new CompanyEmployee("Alice", 50000);
        CompanyEmployee emp2 = new CompanyEmployee("Bob", 60000);
        CompanyEmployee emp3 = new CompanyEmployee("Charlie", 70000);

        // Call printCompanyInfo through the class name, not through an object
        CompanyEmployee.printCompanyInfo();
    }
}