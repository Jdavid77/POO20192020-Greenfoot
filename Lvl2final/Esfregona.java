import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Esfregona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Esfregona extends Actor
{
    /**
     * Act - do whatever the Esfregona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public Esfregona(){
        GreenfootImage esfregona = getImage();
        int alturanova = esfregona.getHeight()/16;
        int larguranova = esfregona.getWidth()/16;
        esfregona.scale(larguranova,alturanova);
        
    }
}
