import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Background extends World
{
    public int score;
    private int x,y;
    HealthBar vida = new HealthBar();
    Ozono ozono = new Ozono();
    int VIDA;
    private int tempo=600;
    public int camada=100, naves=2, cfc, co2, bombas, pontos;
    
    
    
    public Background()
    {        
        super(1000, 600, 1); 
        Nave1 rocket1 = new Nave1();
        addObject(rocket1, 128 , 115);
        Nave2 rocket = new Nave2();
        addObject(rocket, 128 ,438);
        factory fabrica1 = new factory();
        addObject(fabrica1,800,570);
        factory fabrica2 = new factory();
        addObject(fabrica2,600,570);
        factory fabrica3 = new factory();
        addObject(fabrica3,400,570);
        score = 0;        
        addObject(vida,900,50);
        addObject(ozono,499,59);
        setPaintOrder(asteroide.class,Fogo.class);
        setPaintOrder(Explosao2.class,asteroide.class);
        showText("PROTECT THE OZONE LAYER AT ALL COST!!!" ,500,50);
    }    
    public HealthBar getHealthBar(){
        return vida;
    }
    public Ozono getOzono(){
        return ozono;
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
        ozono.buraco(2);
        camada =-4;
        cfc++;
        
    }
    public void removeGas1(gas1 GAS1)
    {
        HealthBar barra = getHealthBar();
        removeObject(GAS1);
        barra.perdeVida(1);
        ozono.buraco(1);
        camada =-2;
        co2++;
    }
    public void act(){
        tempo--;
        int segundos = tempo/60;
        showText("Score: " + score,50,20);
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
            Greenfoot.setWorld(new Passou(false));
        else if (naves>0 && tempo ==0){
            Passou resultado = new Passou(true);
            resultado.pontos = score;
            resultado.naves = naves;
            resultado.cfc = cfc;
            resultado.co2 = co2;
            resultado.bombas=bombas;
            resultado.camada = camada;
            
            Greenfoot.setWorld(resultado);
        }
        
    }
    public void removenave(){
        naves--;
    }
    public void bombaa(){
        bombas++;
        
    }
}
