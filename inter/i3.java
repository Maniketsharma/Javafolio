// Flyable interface
interface Flyable {
    void fly_obj();
}

// Spacecraft class implementing Flyable interface
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

// Airplane class implementing Flyable interface
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Helicopter class implementing Flyable interface
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying in the air.");
    }
}

// Main class to test the Flyable interface implementation
public class i3{
    public static void main(String[] args) {
        // Create instances of each class
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        // Call fly_obj() method for each instance
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
