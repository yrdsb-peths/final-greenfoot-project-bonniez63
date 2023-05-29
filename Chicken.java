import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Chicken is the main character of our game, and will be crossing the street.
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class Chicken extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y - 3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y + 3);
        }
    }
}
