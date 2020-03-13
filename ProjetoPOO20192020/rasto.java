import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rasto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rasto extends Actor
{
    private GreenfootImage imagem;
    /**
     * Act - do whatever the rasto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fading();
    }    
    public rasto(){
        GreenfootImage gas = getImage();
        int alturanova = gas.getHeight()/4;
        int larguranova = gas.getWidth()/5;
        gas.scale(larguranova,alturanova);
        setRotation(180);
        
        
        
        
        
    }
    public void fading(){
        imagem = getImage();
        int transparenciaAtual = imagem.getTransparency();
        if (transparenciaAtual < 10)
            getWorld().removeObject(this);
        else
            imagem.setTransparency(transparenciaAtual -10);
        
        
        
        }
}