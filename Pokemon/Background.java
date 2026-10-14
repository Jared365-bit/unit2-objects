import greenfoot.*;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private static final int WORLD_WIDTH = 600;
    private static final int WORLD_HEIGHT = 400;
    private static final int CELL_SIZE = 1;

    /**
     * Constructor for objects of class Background.
     *
     */
    public Background()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WORLD_WIDTH, WORLD_HEIGHT, CELL_SIZE);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Add objects here if needed.
    }
}
