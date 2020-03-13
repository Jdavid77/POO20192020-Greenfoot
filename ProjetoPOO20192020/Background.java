import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Background extends World
{
    int score;
    private int x,y;
    HealthBar vida = new HealthBar();
    int VIDA;
    private int tempo=3600;
    public Background()
    {        
        super(1000, 600, 1); 
        Nave1 rocket1 = new Nave1();
        addObject(rocket1, 128 , 115);
        Nave2 rocket = new Nave2();
        addObject(rocket, 128 ,438);
        factory fabrica1 = new factory();
        addObject(fabrica1,769,570);
        factory fabrica2 = new factory();
        addObject(fabrica2,496,570);
        score = 0;        
        addObject(vida,900,50);
        setPaintOrder(asteroide.class,Fogo.class);
    }    
    public HealthBar getHealthBar(){
        return vida;
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
    public void addasteroide(){        
        x = 1000;
        y = Greenfoot.getRandomNumber(600);
        //addObject(new Fogo(), x, y);
        addObject(new asteroide(), x, y);
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
    public void removeGas2(gas2 GAS2)
    {
        HealthBar barra = getHealthBar();
        removeObject(GAS2);
        barra.perdeVida(2);        
    }
    public void removeGas1(gas1 GAS1)
    {
        HealthBar barra = getHealthBar();
        removeObject(GAS1);
        barra.perdeVida(1);        
    }
    public void act(){
        tempo--;
        int segundos = tempo/60;
        showText("Score: " + score,50,50);
        if(Greenfoot.getRandomNumber(100)<2)
            addgas1();
        else if(Greenfoot.getRandomNumber(150)<1)
           addgas2();
        else if(Greenfoot.getRandomNumber(200)<1)
            addbomba();
        else if(Greenfoot.getRandomNumber(400)<1)
            addasteroide();
        showText("Tempo Restante: " + segundos,900,10);
        objetivo();
    }
    public void objetivo(){
        int naves = getObjects(Nave.class).size();
        if (naves ==0)
            Greenfoot.setWorld(new Nivel2(false));
        else if (naves>0 && tempo ==0){
            Greenfoot.setWorld(new Nivel2(true));
        }
    }
}
