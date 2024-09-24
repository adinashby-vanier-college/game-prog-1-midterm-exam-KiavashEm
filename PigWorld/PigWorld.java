// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new Burger();
        addObject(burger, 87, 49);
        Burger burger2 =  new Burger();
        addObject(burger2, 174, 73);
        Burger burger3 =  new Burger();
        addObject(burger3, 119, 120);
        Burger burger4 =  new Burger();
        addObject(burger4, 62, 292);
        Burger burger5 =  new Burger();
        addObject(burger5, 145, 351);
        Pig pig =  new Pig();
        addObject(pig, 154, 188);
        Burger burger6 =  new Burger();
        addObject(burger6, 468, 39);
        Burger burger7 =  new Burger();
        addObject(burger7, 423, 90);
        Burger burger8 =  new Burger();
        addObject(burger8, 398, 309);
        Burger burger9 =  new Burger();
        addObject(burger9, 523, 241);
        Snake snake =  new Snake();
        addObject(snake, 525, 338);
    }
}
