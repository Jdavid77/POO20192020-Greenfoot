import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boneco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boneco extends Actor
{
    /**
     * Act - do whatever the Boneco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public boolean apanhaesfregona(){
        Background2 world = (Background2)getWorld();
        Actor esfregona = getOneIntersectingObject(Esfregona.class);
        if(isTouching(Esfregona.class)){
            
            world.removeObject(esfregona);
            return true;
        }
        return false;
    }
    
    public void limpaóleo(){
        Background2 world = (Background2)getWorld();
        Actor oleo = getOneIntersectingObject(Óleo.class);
        if(apanhaesfregona() == true){
            world.removeObject(oleo);
        
        }
    }
    
    public void baldeesfregona(){
        Background2 world = (Background2)getWorld();
        Esfregona esfregona2 = new Esfregona();
        if(apanhaesfregona() == true){
            world.addObject(esfregona2,374,546);
            
        }
        
        
    }
}