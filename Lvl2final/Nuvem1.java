import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nuvem1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nuvem1 extends Nuvem
{
    /**
     * Act - do whatever the Nuvem1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movimento();
    }    
    public Nuvem1(){ //altera o tamanho
        GreenfootImage nuvem = getImage();
        int alturanova = nuvem.getHeight()/5;
        int larguranova = nuvem.getWidth()/4;
        nuvem.scale(larguranova,alturanova);
        
        
        
        
    }
}
