import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{

    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2(boolean venceu)
    {    
        
        super(1000, 600, 1);
        
        if ( venceu)
            setBackground("YouWin.jpg");
        else 
            setBackground("YouLose.png");
    }
}
