import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{
    private Background img0,img1;
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2(boolean venceu)
    {    
     super(1000, 600, 1);
     
     if ( venceu){
            setBackground("Nivel2.png");
            Personagem boneco = new Personagem();    
            Chao chao = new Chao();
            addObject(chao,500,568);
            addObject(boneco, 100 , 500);
    }
     else 
            setBackground("YouLose.png");
    }
    
}
