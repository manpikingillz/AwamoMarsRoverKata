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
                case 'L':
                    turnLeft();
                    break; //when it is a Turn Left , turn the rover left
                case 'R':
                    turnRight();
                    break; //when it is a Turn Right Command, turn the rover right
                case 'F':
                    moveForward();
                    break; //when it is a Move Forward command, move the rover forward
                case 'B':
                    moveBackward();
                    break; //when it is a move backward command, move the rover backward
                default:
                    break;
            }
        }
    }

    //method to make the rover turn left
    private void turnLeft() {
        char currentDirectionOfRover = getDirection();

        switch (currentDirectionOfRover) {
            case 'N':
                setDirection('W');
                break;
            case 'S':
                setDirection('E');
                break;
            case 'E':
                setDirection('N');
                break;
            case 'W':
                setDirection('S');
                break;
            default:
                break;
        }
        System.out.println("Rover turned left, new direction is: "+ this.getDirection());
    }

    private void turnRight() {
        char currentDirectionOfRover = getDirection();

        switch (currentDirectionOfRover) {
            case 'N':
                setDirection('E');
                break;
            case 'S':
                setDirection('W');
                break;
            case 'E':
                setDirection('S');
                break;
            case 'W':
                setDirection('N');
                break;
            default:
                break;
        }
        System.out.println("Rover turned right, new direction is: "+ this.direction);
    }

    private void moveForward() {
        char currentDirectionOfRover = getDirection();
        int x = getPositionX();
        int y = getPositionY();

        switch (currentDirectionOfRover) {
            case 'N':
                y+=1; 
                setPositionY(y);
                break;
            case 'S':
                y-=1;
                setPositionY(y);
                break;
            case 'E':
                x+=1;
                setPositionX(x);
                break;
            case 'W':
                x-=1;
                setPositionX(x);
                break;
            default:
                break;
        }
        System.out.println("Rover moved forward towards " + this.getDirection() + " , new position is, X: " + this.getPositionX() + ", Y: "+ this.getPositionY());
    }

    private void moveBackward() {
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AwamoMarsRoverKata roverKata = new AwamoMarsRoverKata(3, 0, 'E');
        roverKata.roverReceiveAndProcessCommands("F");
    }
}
