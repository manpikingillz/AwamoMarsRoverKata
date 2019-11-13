package awamomarsroverkata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GILBERT
 */
public class AwamoMarsRoverKataTest {
    
    public AwamoMarsRoverKataTest() {
    }


    @Test
    public void testRoverReceiveAndProcessCommands() throws Exception {
        System.out.println("roverReceiveAndProcessCommands");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(0,0,'N');
        instance.roverReceiveAndProcessCommands("LBBRF");
        assertEquals('N', instance.getDirection());
        assertEquals(2, instance.getPositionX());
        assertEquals(1, instance.getPositionY());
    }
    
    @Test
    public void testMoveForward() throws Exception {
        System.out.println("moveForward");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(0,0,'N');
        instance.roverReceiveAndProcessCommands("F");
        assertEquals(1, instance.getPositionY());
        assertEquals(0, instance.getPositionX());
    }
    
    @Test
    public void testMoveBackward() throws Exception {
        System.out.println("moveBackward");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(0,0,'N');
        instance.roverReceiveAndProcessCommands("B");
        assertEquals(-1, instance.getPositionY());
        assertEquals(0, instance.getPositionX());
    }
    
    @Test
    public void testTurnRight() throws Exception {
        System.out.println("turnRight");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(0,0,'N');
        instance.roverReceiveAndProcessCommands("R");
        assertEquals('E', instance.getDirection());
    }
    
    @Test
    public void testTurnLeft() throws Exception {
        System.out.println("turnLeft");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(0,0,'N');
        instance.roverReceiveAndProcessCommands("L");
        assertEquals('W', instance.getDirection());
    }

    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(2, 3, 'S');
        int result = instance.getPositionX();
        assertEquals(2, result);
    }


    @Test
    public void testSetPositionX() {
        System.out.println("setPositionX");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(0, 0, 'N');
        instance.setPositionX(3);
        assertEquals(3, instance.getPositionX());

    }


    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(0, 5, 'N');
        int result = instance.getPositionY();
        assertEquals(5, result);
    }


    @Test
    public void testSetPositionY() {
        System.out.println("setPositionY");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(0, 0, 'E');
        instance.setPositionY(7);
        assertEquals(7, instance.getPositionY());

    }


    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(2, 3, 'E');
        char result = instance.getDirection();
        assertEquals('E', result);
    }


    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        AwamoMarsRoverKata instance = new AwamoMarsRoverKata(2, 3, 'W');
        instance.setDirection('S');
        assertEquals('S', instance.getDirection());
    }
    
}
