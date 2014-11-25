/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

/**
 *
 * @author Jordan, Garfield, Jacob
 */
public class Pong
{
    // class variables:
    //  variables for the ball
    private int xSpeed, ySpeed, xPos, yPos, radius;
    private double direction;
    //  variables for the AI paddle
    private int pXPos, pYPos, pXSpeed, pYSpeed, length, width;
    
    // Constructor: ball starts at the origin of the canvas with
    //   an initial speed of 10 pixels per second
    public Pong()
    {
        this.xPos = 50;
        this.yPos = 50;
        this.xSpeed = 10;
        this.ySpeed = 10;
    }
    
    // Accessors
    public int getXSpeed()
    {
        return xSpeed;
    }
    public int getYSpeed()
    {
        return ySpeed;
    }
    public int getXPos()
    {
        return xPos;
    }
    public int getYPos()
    {
        return yPos;
    }
    public int getRadius()
    {
        return radius;
    }
    public int getWidth()
    {
        return width;
    }
    public int getLength()
    {
        return length;
    }
    // Return the Y-Position / X-Position
    public double getDirection()
    {
        return yPos / xPos;
    }
    
    // Mutators
    public void setXSpeed(int xSpeed)
    {
        this.xSpeed = xSpeed;
    }
    public void setYSpeed(int ySpeed)
    {
        this.ySpeed = ySpeed;
    }
    public void setXPos(int xPos)
    {
        this.xPos = xPos;
    }
    public void setYPos(int yPos)
    {
        this.yPos = yPos;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
}
