import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Amarelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amarelo extends Ecoponto
{
    /**
     * Act - do whatever the Amarelo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public Amarelo(){
    GreenfootImage amarelo = getImage();
        int alturanova = amarelo.getHeight()/16;
        int larguranova = amarelo.getWidth()/16;
        amarelo.scale(larguranova,alturanova);
        
    }
}
