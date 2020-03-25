import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boneco1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boneco2 extends Boneco
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
    public Boneco2(){
         
        imagens = new GreenfootImage [3];
        imagens[0] = new GreenfootImage("Boneco23.png");
        imagens[1] = new GreenfootImage("Boneco21.png");
        imagens[2] = new GreenfootImage("Boneco22.png");
        
        setImage(imagens[0]);
        
        
        
        
    }
    public void anima(){
        if (Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("S")){
        indice = indice + 1;
        
        if (indice >= imagens.length){
            
            indice = 0;
        
        }
        
        setImage(imagens[indice]);
    }
}
    public void movimento(){
        
        if(Greenfoot.isKeyDown("D")){
            move(4);
        
        
        }
        else if(Greenfoot.isKeyDown("A")){
            
            move(-4);
            
        }
        else if(Greenfoot.isKeyDown("W")){
            
            setLocation(getX(),getY() - 4);
            
        }   
        else if(Greenfoot.isKeyDown("S")){
        
            setLocation(getX(), getY() + 4);

        }
    }
}
