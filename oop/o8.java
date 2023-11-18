import java.util.Date;
import java.util.Calendar;

public class o8{
    // Attributes
    private String name;
    private double salary;
    private Date hireDate;

    // Constructor
    public o8(String name, double salary, Date hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        Calendar currentDate = Calendar.getInstance();
        Calendar hireDateCalendar = Calendar.getInstance();
        hireDateCalendar.setTime(hireDate);

        int years = currentDate.get(Calendar.YEAR) - hireDateCalendar.get(Calendar.YEAR);

        if (currentDate.get(Calendar.DAY_OF_YEAR) < hireDateCalendar.get(Calendar.DAY_OF_YEAR)) {
            // Adjust years if the current date is before the hire date in the same year
            years--;
        }

        return years;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an Employee object with initial values
        Date hireDate = new Date(110, 4, 15); // Year is offset by 1900, so 110 corresponds to 2010
        o8 employee = new o8("John Doe", 50000, hireDate);

        // Displaying employee information
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Hire Date: " + employee.getHireDate());

        // Calculating and displaying years of service
        int yearsOfService = employee.calculateYearsOfService();
        System.out.println("\nYears of Service: " + yearsOfService + " years");
    }
}
