package awamomarsroverkata;

/**
 *
 * @author GILBERT
 */
public class AwamoMarsRoverKata {

    int positionX = 0;
    int positionY = 0;
    char direction = 'N';

    //Rover constructor that sets the starting point (x,y) and initial direction
    AwamoMarsRoverKata(int initialPositionX, int initialPositionY, char initialDirection) {
        positionX = initialPositionX;
        positionY = initialPositionY;
        direction = initialDirection;
    }

    /* Rover receives and processes character array of commands.
        The commands can be a combination of L - turn left, R - turn right, F - move forward, B - move backward
        e.g LLFF, FFBL, RFBL
     */
    public void roverReceiveAndProcessCommands(String commands) {

        //ensure we don't process empty commands 
        if (!commands.isEmpty()) {

            //get the first command from the received character array of commands
            char command = commands.charAt(0);

            switch (command) {
                case 'L':  turnLeft(); //when it is a Turn Left , turn the rover left
                case 'R':  turnRight(); //when it is a Turn Right Command, turn the rover right
                case 'F':  moveForward(); //when it is a Move Forward command, move the rover forward
                case 'B':  moveBackward(); //when it is a move backward command, move the rover backward
            }
        }

    }
 
    private void turnLeft() {
    }

    private void turnRight() {
    }

    private void moveForward() {
    }

    private void moveBackward() {
    }
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
