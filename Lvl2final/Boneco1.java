import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boneco1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boneco1 extends Boneco
{
    private GreenfootImage [] imagens;
    private int indice;
    /**
     * Act - do whatever the Boneco1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        anima();
        movimento();
    }    
    public Boneco1(){
         
        imagens = new GreenfootImage [3];
        imagens[0] = new GreenfootImage("Boneco.png");
        imagens[1] = new GreenfootImage("Boneco1.png");
        imagens[2] = new GreenfootImage("Boneco2.png");
        
        setImage(imagens[0]);
        
        
        
        
    }
    public void anima(){
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down")){
        indice = indice + 1;
        
        if (indice >= imagens.length){
            
            indice = 0;
        
        }
        
        setImage(imagens[indice]);
    }
    }
    public void movimento(){
        
        if(Greenfoot.isKeyDown("right")){
            move(4);
        
        
        }
        else if(Greenfoot.isKeyDown("left")){
            
            move(-4);
            
        }
        else if(Greenfoot.isKeyDown("up")){
            
            setLocation(getX(),getY() - 4);
            
        }   
        else if(Greenfoot.isKeyDown("down")){
        
            setLocation(getX(), getY() + 4);
    }
}
}
