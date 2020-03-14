import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dez extends Actor
{
    private GreenfootImage imagem;
    /**
     * Act - do whatever the dez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fading();
        movimento();
    }    
    public dez(){
        GreenfootImage gas = getImage();
        int alturanova = gas.getHeight()/35;
        int larguranova = gas.getWidth()/40;
        gas.scale(larguranova,alturanova);
    }
    public void fading(){
        imagem = getImage();
        int transparenciaAtual = imagem.getTransparency();
        if (transparenciaAtual < 10)
            getWorld().removeObject(this);
        else
            imagem.setTransparency(transparenciaAtual -10);
        
        
        
        }
    public void movimento(){
        
        setLocation(getX(), getY() +10);
     
    }
}
