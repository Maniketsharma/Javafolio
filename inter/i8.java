// Playable interface
interface Playable {
    void play();
}

// Football class implementing Playable interface
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football. Goal!");
        // Add code for playing football
    }
}

// Volleyball class implementing Playable interface
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball. Spike!");
        // Add code for playing volleyball
    }
}

// Basketball class implementing Playable interface
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball. Slam dunk!");
        // Add code for playing basketball
    }
}

// Main class to test the Playable interface and sports classes
public class i8
{
    public static void main(String[] args) {
        // Create instances of each sport
        Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        // Play each sport
        playSport(football);
        playSport(volleyball);
        playSport(basketball);
    }

    // Helper method to play any sport implementing the Playable interface
    public static void playSport(Playable sport) {
        sport.play();
    }
}
