import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem extends Actor
{
    int vSpeed =0;
    int accel = 0;
    /**
     * Act - do whatever the Personagem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        jump();
        checkFalling();
        fall();
        
    }
    
    public void fall()
    {
        setLocation(getX(),getY() + vSpeed);
    }
    public void checkFalling()
    {
        if(!isTouching(Chao.class))
        {
            vSpeed++;
        }
        else
            vSpeed =0;
    }
    public void jump(){
        if(Greenfoot.isKeyDown("space") )
                vSpeed= vSpeed - 15;
        
    }
}
