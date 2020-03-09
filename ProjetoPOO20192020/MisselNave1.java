import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MisselNave1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MisselNave1 extends Misseis
{
    /**
     * Act - do whatever the MisselNave1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movemissel();
        removedomundo();
    }    
    public MisselNave1(){
        GreenfootImage missel = getImage();
        int alturanova = missel.getHeight()/8;
        int larguranova = missel.getWidth()/6;
        missel.scale(larguranova,alturanova);
        
        
        
        
        
    }
}
