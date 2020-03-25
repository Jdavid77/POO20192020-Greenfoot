import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nuvem2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nuvem2 extends Nuvem
{
    private int speed;
    /**
     * Act - do whatever the Nuvem2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movimento(4);
    }    
    
    public void movimento(int speed){
        setLocation(getX()-speed,getY());
        
        if(getX() == 0){
            getWorld().removeObject(this);
        }
    }
    
}
