package marsroverimpl;


public class MainClass {

    public static void main(String args[]) {
        Rover rover = new Rover();
        // Giving the first Rover position
        rover.setPosition(1, 2, MarsRoverConstants.N);
        // Tell the Rover how to explore the plateau
        rover.executeCommand("LMLMLMLMM");
        rover.printPosition(); // prints 1 3 N
        // Giving the second Rover position
        rover.setPosition(3, 3, MarsRoverConstants.E);
        // Tell the Rover how to explore the plateau
        rover.executeCommand("MMRMMRMRRM");
        rover.printPosition(); // prints 5 1 E
    }

}