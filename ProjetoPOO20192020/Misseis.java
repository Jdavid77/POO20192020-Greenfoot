import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Misseis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Misseis extends Actor
{
    private int speed = 20;    
    public void act() 
    {
        
    }    
    public void movemissel(){        
        setLocation(getX()+ speed, getY());   
    }    
    public void removedomundo(){        
         if (isAtEdge()||colisao1()){
            getWorld().removeObject(this); 
        }     
    }
    public boolean colisao1(){
        gas1 acertado1 = (gas1)getOneIntersectingObject(gas1.class);        
        Background world = (Background)getWorld();
        if (acertado1 != null)
        {
         world.removegas1(acertado1);
         return true;
        }
        return false;
    }       
}


