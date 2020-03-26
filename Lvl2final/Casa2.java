import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa2 extends Casa
{
    /**
     * Act - do whatever the Casa2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        geraLixo();
        move(-1);
        addCasa2();
    }    
    public void addCasa2(){
            Casa2 casa2 = new Casa2();
            if(getX() == 0){
                getWorld().addObject(casa2,1000,getY());
                getWorld().removeObject(this);
            }
            
        }
}
