import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave1 extends Nave
{
    /**
     * Act - do whatever the Nave1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x,y;
    boolean disparo;
    public void act() 
    {
        controlanave();
        naveAsteroide();
    }
    public void controlanave(){
        int y = getY();
        int x = getX();
        
        if(Greenfoot.isKeyDown("W") )
                y= y - 5;
        else if (Greenfoot.isKeyDown("S") &&y <=250)
                y= y + 5;            
        setLocation(x,y);
        if (Greenfoot.isKeyDown("space") && disparo == true){
            getWorld().addObject(new MisselNave1(), getX()+62, getY()+2);
            disparo = false;
        }
        else if(!Greenfoot.isKeyDown("space"))
            disparo = true;
        
    }
}
