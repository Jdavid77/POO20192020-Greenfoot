import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomba extends Gas
{
    /**
     * Act - do whatever the bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movegas();
        gameover();

        
        
    }
    public void gameover(){
        if (acertou())
            Greenfoot.stop();
    }
    public boolean acertou()
    {
        Actor missile = getOneIntersectingObject(Misseis.class);
        Background world = (Background)getWorld();

        if (missile != null){
            world.removeObject(this);
            return true;
            
        }
        if (getY()==0)
            world.removeObject(this);
        return false;
    }
}
