import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nuvem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nuvem extends Actor
{
    /**
     * Act - do whatever the Nuvem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    public void movimento(){
        
        setLocation(getX()-2,getY());
        
        if(getX() == 0){
            getWorld().removeObject(this);
        }
        
        
        
        
    }
}
