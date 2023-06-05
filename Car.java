import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The car is our chicken's obstacle, which the player has to dodge.
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class Car extends Actor
{
    GreenfootImage[] carsRight = new GreenfootImage[5];
    GreenfootImage[] carsLeft = new GreenfootImage[5];
    
    public Car()
    {
        for(int i = 0; i < carsLeft.length; i++)
        {
            carsLeft[i] = new GreenfootImage("images/cars/car" + i + ".png");
            carsLeft[i].mirrorHorizontally();
        }
        for(int i = 0; i < carsRight.length; i++)
        {
            carsRight[i] = new GreenfootImage("images/cars/car" + i + ".png");
        }
    }
    
    public void addedToWorld(World world)
    {
        int y = getY();
        int carIndex = Greenfoot.getRandomNumber(5);
        if(y == 225 || y == 475)
        {
            setImage(carsRight[carIndex]);
        }
        else
        {
            setImage(carsLeft[carIndex]);
        }
    }
    
    public void move()
    {
        int speed = 3 + getWorldOfType(MyWorld.class).level;
        int y = getY();
        if(y == 125 || y == 375)
        {
            move(-1 * speed);
        }
        else
        {
            move(speed);
        }
    }
    
    public void crash()
    {
        //The game ends when the car crashes into the chicken.
        if(isTouching(Chicken.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
        }
    }

    public void act()
    {
        if(!getWorldOfType(MyWorld.class).gameRunning) 
        {
            return;
        }
        move();
        crash();
    }
}
