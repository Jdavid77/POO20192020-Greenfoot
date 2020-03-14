import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosao2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosao2 extends Actor
{
      private GreenfootImage[] imagens;
    private int indice;
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
    public Explosao2(){
        imagens = new GreenfootImage [40];
        for (int i = 0; i < imagens.length ; i++){
            imagens[i] = new GreenfootImage("Photo Explosion.Png");
            imagens[i].scale(5*i + 5,5*i + 5);
           
        }
        setImage(imagens[0]);
    }
}
