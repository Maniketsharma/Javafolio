public class o2{
    // Attributes
    private String name;
    private String breed;

    // Constructor
    public o2(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        // Create instances of the Dog class
        o2 dog1 = new o2("Buddy", "Golden Retriever");
        o2 dog2 = new o2("Max", "Labrador");

        // Print initial information about the dogs
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modify attributes using setter methods
        dog1.setName("Charlie");
        dog2.setBreed("German Shepherd");

        // Print updated information about the dogs
        System.out.println("\nAfter Modification:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}
