import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa1 extends Casa
{
    /**
     * Act - do whatever the Casa1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        geraLixo();
        move(-1);
        addCasa1();
    }    
    public void addCasa1(){
            Casa1 casa1 = new Casa1();
            if(getX() == 0){
                getWorld().addObject(casa1,1000,getY());
                getWorld().removeObject(this);
            }
            
        }
   
}
