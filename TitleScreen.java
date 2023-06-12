import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Egg Collector", 125);
    Label instructionsLabel = new Label("Use \u2190 \u2191 \u2192 \u2193 to Move", 75);
    Label startLabel = new Label("Press Space to Start", 85);
    
    public TitleScreen()
    {    
        super(900, 600, 1); 
        addObject(titleLabel, 450, 100);
        addObject(instructionsLabel, 450, 415);
        addObject(startLabel, 450, 475);
        prepare();
    }
    
    public void act()
    {
        //Starts the game.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    //Displays actors of the game without any act methods.
    private void prepare()
    {
        Image chicken = new Image();
        GreenfootImage c = new GreenfootImage("images/chicken_idle/idle0.png");
        c.scale(110, 200);
        chicken.setImage(c);
        addObject(chicken, 350, 275);
        
        Egg egg = new Egg();
        GreenfootImage e = egg.getImage();
        e.scale(150, 150);
        egg.setImage(e);
        addObject(egg, 550, 275);
    }
}
