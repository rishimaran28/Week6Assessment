public class PayrollAccount {
    // Private fields to prevent unauthorized external access
    private double basicSalary;
    private double bonus;

    // Public constructor: initializes basic salary, defaults to 0 with warning if negative
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Basic salary cannot be negative. Initialized to 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0.0;
    }

    // Credits bonus if amount > 0, otherwise rejects with message
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid bonus amount: " + amount + ". Bonus must be greater than 0.");
            return;
        }
        this.bonus += amount;
        System.out.println("Bonus credited: Rs " + amount);
    }

    // Deducts tax as a percentage from basicSalary, rejecting percent outside 0-100 range
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percent: " + percent + "%. Must be between 0 and 100.");
            return;
        }
        this.basicSalary -= (this.basicSalary * percent / 100.0);
        if (percent == (long) percent) {
            System.out.println("Tax deducted: " + (long) percent + "%");
        } else {
            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    // Read-only getter for net salary (basicSalary + bonus)
    public double getNetSalary() {
        return basicSalary + bonus;
    }

    public static void main(String[] args) {
        // Sample execution
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}