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
        score = 0;
    }
    
    public void addgas1(){
        addObject(new gas1(), Greenfoot.getRandomNumber(600)+300,600);
    }
    public void addgas2(){
        addObject(new gas2(), Greenfoot.getRandomNumber(600)+300,600);
    }
    public void addbomba(){
        addObject(new bomba(),Greenfoot.getRandomNumber(600)+300,600);
    }
    public void removegas1(gas1 GAS1)
    {
        removeObject(GAS1);
        score += 10;
    }
    public void removegas2(gas2 GAS2)
    {
        removeObject(GAS2);
        score += 20;
    }
    public void act(){
        showText("Score: " + score,50,50);
        if(Greenfoot.getRandomNumber(100)<2)
            addgas1();
        else if(Greenfoot.getRandomNumber(150)<1)
           addgas2();
        else if(Greenfoot.getRandomNumber(200)<1)
            addbomba();
    }
    
    
}
