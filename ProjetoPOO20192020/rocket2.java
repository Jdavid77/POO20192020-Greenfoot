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
        GreenfootImage foguete = getImage();
        int alturanova = foguete.getHeight()/12;
        int larguranova = foguete.getWidth()/9;
        foguete.scale(larguranova,alturanova);
        setRotation(90);
        
        
        
        
        
    }
    public void controlanave(){
        int y = getY();
        int x = getX();
        
        if(Greenfoot.isKeyDown("up"))
                y= y - 5;
        else if (Greenfoot.isKeyDown("down"))
                y= y + 5;
            
        setLocation(x,y);
        
        
        
        
}
    public void dispara(){
        if (Greenfoot.isKeyDown("enter") && disparo == true){
            getWorld().addObject(new MisselNave2(), getX()+58, getY());
            disparo = false;
        }
        else if (!Greenfoot.isKeyDown("enter"))
            disparo = true;
            
        
        
        
        
    }
}

