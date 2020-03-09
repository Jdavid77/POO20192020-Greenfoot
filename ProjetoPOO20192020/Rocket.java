import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    public int y;
    public int x;
    boolean disparo;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        controlanave();
        dispara2();
        
    }    
    
    public void controlanave(){
        int y = getY();
        int x = getX();
        
        if(Greenfoot.isKeyDown("W"))
                y= y - 5;
        else if (Greenfoot.isKeyDown("S"))
                y= y + 5;
            
        setLocation(x,y);
    }
    public void dispara2(){
        if (Greenfoot.isKeyDown("space") && disparo == true){
            getWorld().addObject(new MisselNave1(), getX()+62, getY()+20);
            disparo = false;
        }
        else if(!Greenfoot.isKeyDown("space"))
            disparo = true;
        
        
        
    }
        
}
        
        
    
    

