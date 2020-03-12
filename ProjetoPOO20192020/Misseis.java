import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Misseis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Misseis extends Actor
{
    private int speed = 15;
    private int acertado = 0;
    
    public void act() 
    {
        // Add your action code here.
    }    
    public void movemissel(){        
        setLocation(getX()+ speed, getY());     
        
        
    }    
    public void removedomundo(){        
         if (isAtEdge()||colisao1() /*|| colisao2()*/){
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


