import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket2 extends Actor
{
    public int x;
    public int y;
    boolean disparo;
    /**
     * Act - do whatever the rocket2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        controlanave();
        dispara();
    }    
    
    public rocket2(){
        
        
        
        
        
        
    }
    public void controlanave(){
        int y = getY();
        int x = getX();
        
        if(Greenfoot.isKeyDown("up")&& y>305)
                y= y - 5;
        else if (Greenfoot.isKeyDown("down")&&y>305)
                y= y + 5;
            
        setLocation(x,y);
        
        
        
        
}
    public void dispara(){
        if (Greenfoot.isKeyDown("enter") && disparo == true){
            getWorld().addObject(new MisselNave2(), getX()+58, getY()+2);
            disparo = false;
        }
        else if (!Greenfoot.isKeyDown("enter"))
            disparo = true;
            
        
        
        
        
    }
}

