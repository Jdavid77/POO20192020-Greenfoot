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
     else if(getX()>50){
         rasto();
        }
    }
    public asteroide(){
        GreenfootImage asteroide = getImage();
        int alturanova = asteroide.getHeight();
        int larguranova = asteroide.getWidth();
        asteroide.scale(larguranova,alturanova);
    }
    public void rasto(){
        contador++;
        if (contador == 3){
            getWorld().addObject(new Fogo(),getX()+70, getY());
            contador = 0;
        
    }
   
    
    }   
    
}
