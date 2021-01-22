import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ansgar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ansgar extends Figuren
{
    /**
     * Act - do whatever the Ansgar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        bewegen();
    }    
    
    public void bewegen() 
    {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("W")) y--;
        if(Greenfoot.isKeyDown("S")) y++;
        if(Greenfoot.isKeyDown("A")) x--;
        if(Greenfoot.isKeyDown("D")) x++;
        setLocation(x,y);
    }
}