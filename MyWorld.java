import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1, false);
        Chicken chicken = new Chicken();
        addObject(chicken, 300, 315);
    }
}
