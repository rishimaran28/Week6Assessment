public class HallTicket {
    // Fields
    String studentName;
    int seatNumber;

    // Constructor to initialize studentName and seatNumber
    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {
        // Create one HallTicket object for Priya
        HallTicket priya = new HallTicket("Priya", 0);

        // Assign a second variable to point at that same object (reference copy)
        HallTicket copy = priya;

        // Through the second variable, change seatNumber
        copy.seatNumber = 45;

        // Print the field's value as seen through the first variable
        System.out.println("Priya's seatNumber (via first variable):");
        System.out.println(priya.seatNumber);

        // Print whether the two reference variables are == to each other
        System.out.println("copy == priya: " + (copy == priya));

        // Create a third, separate HallTicket object with identical field values
        HallTicket separate = new HallTicket("Priya", 45);

        // Print whether it is == to the first
        System.out.println("separate == priya: " + (separate == priya));
    }
}