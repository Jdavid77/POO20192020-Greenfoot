import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background2 extends World
{
    
    /**
     * Constructor for objects of class Background2.
     * 
     */
    public Background2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
       
        prepare();
        setPaintOrder(Boneco.class,Ecoponto.class);
        
    }

    public void act(){
        adicionanuvem();

    }
    public void adicionanuvem(){
        if(Greenfoot.getRandomNumber(250) < 3){
            int x = getWidth();
            int y = Greenfoot.getRandomNumber(getHeight())-350;

            addObject(new Nuvem1(),x,y);

        }
        else if(Greenfoot.getRandomNumber(300) < 3){
            int x = getWidth();
            int y = Greenfoot.getRandomNumber(getHeight())-350;
            addObject(new Nuvem2(),x,y);

        }
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Nuvem1 nuvem1 = new Nuvem1();
        addObject(nuvem1,187,91);
        nuvem1.setLocation(146,71);
        Nuvem2 nuvem2 = new Nuvem2();
        addObject(nuvem2,270,155);
        nuvem2.setLocation(292,150);
        Nuvem2 nuvem22 = new Nuvem2();
        addObject(nuvem22,429,52);
        nuvem22.setLocation(441,62);
        Nuvem2 nuvem23 = new Nuvem2();
        addObject(nuvem23,828,71);
        nuvem23.setLocation(899,63);
        Nuvem1 nuvem12 = new Nuvem1();
        addObject(nuvem12,681,34);
        nuvem12.setLocation(656,72);
        Nuvem1 nuvem13 = new Nuvem1();
        addObject(nuvem13,768,176);
        Nuvem1 nuvem14 = new Nuvem1();
        addObject(nuvem14,523,164);
        Nuvem1 nuvem15 = new Nuvem1();
        addObject(nuvem15,76,146);
        nuvem15.setLocation(84,162);

        Boneco1 boneco1 = new Boneco1();
        addObject(boneco1,78,425);

        Boneco2 boneco2 = new Boneco2();
        addObject(boneco2,78,494);
        
        Azul azul = new Azul();
        addObject(azul,176,426);
        
        Amarelo amarelo = new Amarelo();
        addObject(amarelo,90,426);
        

        boneco2.setLocation(54,513);
        boneco1.setLocation(59,469);
        
        boneco2.setLocation(61,520);
        boneco1.setLocation(55,471);
        
    }
}
