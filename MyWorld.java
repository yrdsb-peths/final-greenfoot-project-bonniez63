import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int[] spawnLocationY = {125, 225, 375, 475};
    
    public MyWorld()
    {    
        super(900, 600, 1, false);
        
        Chicken chicken = new Chicken();
        addObject(chicken, 450, spawnLocationY[Greenfoot.getRandomNumber(4)]);
        
        scoreLabel = new Label(0, 125);
        addObject(scoreLabel, 850, 55);
        
        createEgg();
    }
    
    public void createEgg()
    {
        Egg egg = new Egg();
        int x = Greenfoot.getRandomNumber(900);
        int y = spawnLocationY[Greenfoot.getRandomNumber(4)];
        addObject(egg, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
