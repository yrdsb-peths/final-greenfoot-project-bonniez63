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
    public int highScore = 0;
    public int level = 0;
    Label scoreLabel;
    Label gameOverLabel;
    Label endScoreLabel;
    Label continueLabel;
    int[] spawnLocationY = {125, 225, 375, 475};
    public boolean gameRunning = true;
    SimpleTimer carTimer = new SimpleTimer();
    
    public MyWorld()
    {    
        super(900, 600, 1, false);
        
        Chicken chicken = new Chicken();
        addObject(chicken, 450, spawnLocationY[Greenfoot.getRandomNumber(4)]);
        
        scoreLabel = new Label(0, 125);
        addObject(scoreLabel, 825, 60);
        
        createEgg();
    }
    
    public void act() 
    {
        createCar();
        if(!gameRunning)
        {
            if(Greenfoot.isKeyDown("space"))
            {
               ScoreBoard scoreBoard = new ScoreBoard();
                Greenfoot.setWorld(scoreBoard);
            }
        }
    }
    
    public void createCar()
    {
        if(!gameRunning) 
        {
            return;
        }
        if(carTimer.millisElapsed() > 2500 - score * 100)
        {
            Car car = new Car();
            int y = spawnLocationY[Greenfoot.getRandomNumber(4)];
            int x = 0;
            if(y == 125 || y == 375)
            {
                x = getWidth();
            }
            addObject(car, x, y);
            
            carTimer.mark();
        }
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
        level = score/5;
    }
    
    public void gameOver()
    {
        gameOverLabel = new Label("Game Over", 150);
        endScoreLabel = new Label("Score: " + score, 75);
        continueLabel = new Label("Press Space to Continue", 90);
        
        addObject(gameOverLabel, 450, 250);
        addObject(endScoreLabel, 450, 375);
        addObject(continueLabel, 450, 475);
        gameRunning = false;
    }
}
