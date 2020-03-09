import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private int score;
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Rocket rocket1 = new Rocket();
        addObject(rocket1, 128 , 115);
        rocket2 rocket = new rocket2();
        addObject(rocket, 128 ,438);
        factory fabrica1 = new factory();
        addObject(fabrica1,769,570);
        factory fabrica2 = new factory();
        addObject(fabrica2,496,570);
        
        
    }
    
    public void addgas1(){
        addObject(new gas1(), Greenfoot.getRandomNumber(600)+300,600);
        
        
        
    }
    public void addgas2(){
        addObject(new gas2(), Greenfoot.getRandomNumber(600)+300,600);
        
        
        
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100)<2)
            addgas1();
        else if(Greenfoot.getRandomNumber(120)<1)
            addgas2();
        
        
        
    }
    public void adicionapontos(int pontos){
        score = score + pontos;
        
        
        
    }
}
