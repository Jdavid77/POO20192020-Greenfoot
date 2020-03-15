import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ozono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ozono extends Actor
{
    /**
     * Act - do whatever the Ozono wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage imagem;
    public void act() 
    {
        // Add your action code here.
    }
    public void buraco(int x){
        imagem = getImage();

        int transparenciaAtual = imagem.getTransparency();
        if (transparenciaAtual < 1)
            getWorld().removeObject(this);
        else{
            imagem.setTransparency(transparenciaAtual -x*5);
            
        }
    }
}
