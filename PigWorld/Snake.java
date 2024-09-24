// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * We make the snake move randomly around the world
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        kill();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * We make the snake move randomly around the world
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * if the snake catches the pig(byintersecting) , we remove the pig and the game is over
     */
    public void kill()
    {
        Actor Pig = getOneIntersectingObject(Pig.class);
        if (Pig != null) {
            World world = getWorld();
            world.removeObject(Pig);
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * we spawn the game over world
     */
    public void transitionToGameOverWorld()
    {
        World GameOverWorld =  new GameOverWorld();
        Greenfoot.setWorld(GameOverWorld);
    }

    /**
     * we check if the game is over by checking whether there is a pig on the map or not!
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
