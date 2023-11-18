import java.util.ArrayList;
import java.util.List;

class o9{
    private String name;
    private int grade;
    private List<String> courses;

    // Constructor
    public o9(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<java.lang.String>();
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " has been added to the student's courses.");
    }

    // Method to remove a course
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(course + " has been removed from the student's courses.");
        } else {
            System.out.println("The student is not enrolled in " + course + ".");
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses Enrolled: " + courses);
    }

    public static void main(String[] args) {
        // Create a new student
        o9 student1 = new o9("Mohan das", 10);

        // Add courses
        student1.addCourse("Math");
        student1.addCourse("English");
        student1.addCourse("Science");

        // Display student information
        System.out.println("\nStudent Information:");
        student1.displayInfo();

        // Remove a course
        student1.removeCourse("English");

        // Display updated student information
        System.out.println("\nUpdated Student Information:");
        student1.displayInfo();
    }
}
