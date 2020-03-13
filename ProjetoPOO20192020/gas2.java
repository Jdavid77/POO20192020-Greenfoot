import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gas2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gas2 extends Gas
{
    public int vidaGas = 2;
    boolean tocando = false;
    /**
     * Act - do whatever the gas2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movegas();
        
        atingido2();        
        
    }    
    public gas2(){
        GreenfootImage gas2 = getImage();
        int alturanova = gas2.getHeight()/5;
        int larguranova = gas2.getWidth()/6;
        gas2.scale(larguranova,alturanova);
    }
    public void removedomundo(){        
         if (isAtEdge()){
            getWorld().removeObject(this);       
        
        }     
    }
    public void atingido2(){
        Actor missile = getOneIntersectingObject(Misseis.class);
        
        Background world = (Background)getWorld();
        
        if (missile != null){
            getWorld().removeObject(missile);
            vidaGas--;
        }
        else if (vidaGas== 0){
            world.removegas2(this);
            
        }
        else if (getY() == 0)
            world.removeGas2(this);
            
        }
    
}
    
        
    
    
    

