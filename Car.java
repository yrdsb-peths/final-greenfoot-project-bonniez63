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
    
    public void createCar()
    {
        int y = getY();
        int carIndex = Greenfoot.getRandomNumber(5);
        if(y == 375 || y == 475)
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
        int y = getY();
        if(y == 125 || y == 225)
        {
            move(-3);
        }
        else
        {
            move(3);
        }
    }

    public void act()
    {
        createCar();
        move();
    }
}
