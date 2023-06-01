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
        for(int i = 0; i < carsRight.length; i++)
        {
            carsRight[i] = new GreenfootImage("images/cars/car" + i + ".png");
        }
        for(int i = 0; i < carsLeft.length; i++)
        {
            carsLeft[i] = new GreenfootImage("images/cars/car" + i + ".png");
        }
        
        setImage(carsRight[0]);
    }
    
    public void createCar()
    {
        int rightSpawnLocationY[] = {375, 475};
        int leftSpawnLocationY[] = {125, 225};
        
    }
    
    public void act()
    {
        move(3);
    }
}
