import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gas2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gas2 extends Gas
{
    public int vida = 2;
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
    public void atingido2(){
        Actor missile = getOneIntersectingObject(Misseis.class);
        if (missile != null){
            getWorld().removeObject(missile);
            vida--;
        }
        else if (vida== 0){
            getWorld().removeObject(this);
            getWorldOfType(Background.class).adicionapontos(20);
        }
        else if (getY() == 0)
            getWorld().removeObject(this);
        }
    
}
