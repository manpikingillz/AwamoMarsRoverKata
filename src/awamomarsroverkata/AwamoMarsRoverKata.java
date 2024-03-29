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
    public void roverReceiveAndProcessCommands(String commands) throws Exception {

        int commandIndex = 0;
        
        //ensure we don't process empty commands 
        if (!commands.isEmpty()) {

            while(commands.length() > commandIndex){
                //get the first command from the received character array of commands
                char command = commands.charAt(commandIndex);
                
                switch (Character.toUpperCase(command)) {
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
                    throw new Exception("Command "+ command + " not recognized! Please ensure your command input are a combination of L, R, F, B.");
            }
                commandIndex += 1;
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

    //method to make the rover turn right
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

    //method to make the rover move forward
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
        System.out.println("Rover moved forward while facing in the " + this.getDirection() + " , new position is, X: " + this.getPositionX() + ", Y: "+ this.getPositionY());
    }

    //method to make the rover move backward
    private void moveBackward() {
        char currentDirectionOfRover = getDirection();
        int x = getPositionX();
        int y = getPositionY();

        switch (currentDirectionOfRover) {
            case 'N':
                y-=1; 
                setPositionY(y);
                break;
            case 'S':
                y+=1;
                setPositionY(y);
                break;
            case 'E':
                x-=1;
                setPositionX(x);
                break;
            case 'W':
                x+=1;
                setPositionX(x);
                break;
            default:
                break;
        }
        System.out.println("Rover moved backward while facing in the " + this.getDirection() + " , new position is, X: " + this.getPositionX() + ", Y: "+ this.getPositionY());

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
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        //Testing the rover functionality
        //initialize the rover
        AwamoMarsRoverKata roverKata = new AwamoMarsRoverKata(3, 0, 'S');
        //provide a character array of commands to the rover
        roverKata.roverReceiveAndProcessCommands("LbFFBBRRRRFFB");
    }
}
