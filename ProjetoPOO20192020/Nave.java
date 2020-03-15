import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int naves = 0;
    public void act() 
    {
        
        naveAsteroide();
        
    }
    public void naveAsteroide(){
        Background world = (Background)getWorld();
        
        asteroide acertado1 = (asteroide)getOneIntersectingObject(asteroide.class);
        if (acertado1 != null && naves <2){
            naves++;
            world.addObject(new Explosao2(), getX()+20, getY());
            world.removeObject(this);
            world.removenave();
                        
        } 
        
            
    }
    
    
}
