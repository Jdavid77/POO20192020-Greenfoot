import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int Vida = 50;
    int healthBarLargura = 100;
    int healthBarAltura = 25;
    int pixelPorVida = (int)healthBarLargura/Vida;
    public HealthBar(){
        update();
    }
    public void act() 
    {
        update();
    }
    public void update()
    {
        setImage(new GreenfootImage(healthBarLargura+2, healthBarAltura+2));
        GreenfootImage imagem = getImage();
        imagem.setColor(Color.WHITE);
        imagem.drawRect(0,0,healthBarLargura+1,healthBarAltura+1);
        imagem.setColor(Color.RED);
        imagem.fillRect(1,1, Vida*pixelPorVida, healthBarLargura);
        
    }
    public void perdeVida(int x)
    {
        Vida = Vida -x ;
        if (Vida < 1)
            Greenfoot.setWorld(new Nivel2(false));
    }
    
}
