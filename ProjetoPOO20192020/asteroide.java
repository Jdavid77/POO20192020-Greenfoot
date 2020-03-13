import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroide extends Actor
{
    /**
     * Act - do whatever the asteroide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int contador;
    public void act() 
    {
     
     setLocation(getX()-10,getY());
     turn(4);
     if (getX()==0)
            getWorld().removeObject(this);
     rasto();
     
          
    }
    public asteroide(){
        GreenfootImage asteroide = getImage();
        int alturanova = asteroide.getHeight()*2;
        int larguranova = asteroide.getWidth()*2;
        asteroide.scale(larguranova,alturanova);
    }
    public void rasto(){
        contador++;
        if (contador == 3){
            getWorld().addObject(new rasto(),getX()+55, getY());
            contador = 0;
        
    }
}
}
