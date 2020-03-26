import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa extends Actor
{
    
    /**
     * Act - do whatever the Casa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
    }
    public void geraLixo(){
        Background2 world = (Background2)getWorld();
        if(Greenfoot.getRandomNumber(1000)<1)
            world.addPlastico(getX(),getY()+100);
        else if(Greenfoot.getRandomNumber(1000)<1)
           world.addJornal(getX(),getY()+100);
    }
    
    
    }

