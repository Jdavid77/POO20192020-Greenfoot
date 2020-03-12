import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave2 extends Nave
{
    int x,y;
    boolean disparo;
    public void act() 
    {
        controlanave();
        naveAsteroide();
    }
    public void controlanave(){
        int y = getY();
        int x = getX();        
        if(Greenfoot.isKeyDown("up")&& y>=350)
                y= y - 5;
        else if (Greenfoot.isKeyDown("down"))
                y= y + 5;            
        setLocation(x,y);
        if (Greenfoot.isKeyDown("enter") && disparo == true){
            getWorld().addObject(new MisselNave2(), getX()+58, getY()+2);
            disparo = false;
        }
        else if (!Greenfoot.isKeyDown("enter"))
            disparo = true;     
        
}
}
