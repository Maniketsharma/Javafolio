public class o1{
    // Attributes
    private String name;
    private int age;

    // Constructor
    public o1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create instances of the Person class
        o1 person1 = new o1("John", 25);
        o1 person2 = new o1("Alice", 30);

        // Print information about the first person
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Print information about the second person
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
