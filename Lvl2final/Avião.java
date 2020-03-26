import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avião here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avião extends Actor
{
    /**
     * Act - do whatever the Avião wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + 5, getY());
        GeraOleo();
    }
    public void GeraOleo(){
        
        Background2 world = (Background2)getWorld();
        Óleo oleo1 = new Óleo();
        Óleo oleo2 = new Óleo();
        if(getX() == 500){
            world.addObject(oleo1,452,378);
            world.addObject(oleo2,539,379);
        }
   
    }
    
}
