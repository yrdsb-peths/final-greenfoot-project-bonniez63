import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Records the highest scores that the players acheived
 * 
 * @author Bonnie Zhuang
 * @version June 2023
 */
public class ScoreBoard extends World
{
    Label currentScoreTitle = new Label("New Score:" , 100);
    int score = 0;
    Label currentScoreLabel = new Label(score, 250);
    Label highScoreTitle = new Label("High Scores", 100);
    int highScore1 = 0;
    Label highScore1Label = new Label("1. " + highScore1, 100);
    int highScore2 = 0;
    Label highScore2Label = new Label("2. " + highScore2, 100);
    int highScore3 = 0;
    Label highScore3Label = new Label("3. " + highScore3, 100);
    
    public ScoreBoard()
    {    
        super(900, 600, 1); 
        addObject(currentScoreTitle, 250, 200);
        addObject(currentScoreLabel, 250, 350);
        addObject(highScoreTitle, 650, 125);
        addObject(highScore1Label, 650, 250);
        addObject(highScore2Label, 650, 350);
        addObject(highScore3Label, 650, 450);
    }
}
