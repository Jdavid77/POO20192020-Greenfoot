import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gas extends Actor
{
    /**
     * Act - do whatever the Gas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void movegas(){
        setLocation(getX(),getY()-3);
       
        
    }
    public void removegas(){
        if (isAtEdge())
            getWorld().removeObject(this);
        
    }
}
