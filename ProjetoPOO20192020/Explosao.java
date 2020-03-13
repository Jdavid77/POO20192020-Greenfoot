import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosao extends Actor
{
    private GreenfootImage[] imagens;
    private int indice;
    /**
     * Act - do whatever the Explosao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animaexplosao();
    }    
    public void animaexplosao(){
        indice++;
        if (indice < imagens.length)
            setImage(imagens[indice]);
        else
            getImage().clear();
   
        
    }
    public Explosao(){
        imagens = new GreenfootImage [20];
        for (int i = 0; i < imagens.length ; i++){
            imagens[i] = new GreenfootImage("Explosion View.Png");
            imagens[i].scale(5*i + 5,5*i + 5);
           
        }
        setImage(imagens[0]);
    }
}
