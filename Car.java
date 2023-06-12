import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The cars are our chicken's obstacle, which the player has to dodge.
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class Car extends Actor
{
    GreenfootImage[] carsRight = new GreenfootImage[7];
    GreenfootImage[] carsLeft = new GreenfootImage[7];
    GreenfootSound hurtChicken = new GreenfootSound("angry-chicken-imitation-89241.mp3");
    
    public Car()
    {
        //Spawns random car out of array os car images.
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
        //Makes sure that the cars go in one direction in each lane.
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
        int speed = 2 + getWorldOfType(MyWorld.class).level;
        int y = getY();
        //The car moves left in the 1st and 3rd lane, and right in 2nd and 4th.
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
            hurtChicken.play();
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
