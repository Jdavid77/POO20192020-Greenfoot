import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gas1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gas1 extends Gas
{
    /**
     * Act - do whatever the gas1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movegas();
        atingido();
        
    }    
    public gas1(){
        GreenfootImage gas = getImage();
        int alturanova = gas.getHeight()/7;
        int larguranova = gas.getWidth()/9;
        gas.scale(larguranova,alturanova);
        
        
        
        
        
        
    }
    public void atingido(){
        Actor missile = getOneIntersectingObject(Misseis.class);
        if (missile != null){
            getWorld().removeObject(missile);
            getWorld().removeObject(this);
            
        }
        else if(getY() == 0){
            getWorld().removeObject(this);
        }
        
        
        
        
        
    }
    
    
}
