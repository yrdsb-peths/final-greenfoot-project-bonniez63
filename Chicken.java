import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Chicken is the main character of our game, and will be crossing the street.
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class Chicken extends Actor
{
    GreenfootImage[] idleRight = new GreenfootImage[4];
    GreenfootImage[] idleLeft = new GreenfootImage[4];
        
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Chicken()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/chicken_idle/idle" + i + ".png");
            idleRight[i].scale(40, 70);
        }
            
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/chicken_idle/idle" + i + ".png");
            idleLeft[i].scale(40, 70);
            idleLeft[i].mirrorHorizontally();
        }
        
        setImage(idleRight[0]);
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    public void animateChicken()
    {
        //Animates the chicken.
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {    
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y - 3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y + 3);
        }
        animateChicken();
    }
}
