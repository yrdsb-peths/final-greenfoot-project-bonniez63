import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Egg Collector", 100);
    
    public TitleScreen()
    {    
        super(900, 600, 1); 
        addObject(titleLabel, 450, 200);
        //prepare();
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
    
    /* private void prepare()
    {
        Chicken chicken = new Chicken();
        GreenfootImage c = chicken.getImage();
        c.scale(120, 220);
        chicken.setImage(c);
        addObject(chicken, 400, 400);
        
        Egg egg = new Egg();
        GreenfootImage e = egg.getImage();
        e.scale(150, 150);
        egg.setImage(e);
        addObject(egg, 600, 400);
    }
    */
}
