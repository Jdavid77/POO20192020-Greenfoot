import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gas1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gas1 extends Gas
{
    private int pontos=0;
    public void act() 
    {
        movegas();
        removegas();
    }    
    public gas1(){
        GreenfootImage gas = getImage();
        int alturanova = gas.getHeight()/7;
        int larguranova = gas.getWidth()/9;
        gas.scale(larguranova,alturanova);
    }
    public void removegas(){
        Background world = (Background)getWorld();
        if (getY()==0){
            getWorld().removeObject(this);
            world.removeGas1(this);
        } 
    }
}
