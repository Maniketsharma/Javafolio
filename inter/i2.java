// Animal interface
interface Animal {
    void bark();
}

// Dog class implementing Animal interface
class Dog implements Animal {
    // Implementation of bark() for Dog
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class for testing
public class i2{
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog();

        // Calling the bark method on the Dog instance
        dog.bark();
    }
}
