import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Passou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Passou extends World
{
    private Background img0,img1;
    public int camada=100, naves=2, cfc, co2, bombas, pontos;
    
    
    
    
    /**
     * Constructor for objects of class Passou.
     * 
     */
    public Passou(boolean venceu)
    {    
        super(1000, 600, 1);
        if ( venceu){
            setBackground("lvl1.png");
            showText(camada+" %",870,155);
            showText(naves+"",870,198);
            showText(cfc+"",870,241);
            showText(co2+"",870,284);
            showText(bombas+"",870,327);
            showText(pontos+"",870,370);
            
            
            
    }
     else 
            setBackground("YouLose.png");
    }
    
}
