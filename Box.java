package lab8;

import java.awt.Graphics;

public class Box
{
    private int x;
    private int y;
    private int w;
    private int h;

    public Box(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.w = 15;
        this.h = 15;
    }

    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }

    public int getWidth()
    {
        return this.w;
    }

    public int getHeight()
    {
        return this.h;
    }

    public void draw(Graphics g)
    {
        g.drawRect(x, y, w, h);
    }

    public void drawTurn(Graphics g, char turn)
    {
        g.drawChars(new char[] {turn}, w, h, x, y);
    }

    public boolean contains(int mx, int my)
    {
        boolean inX = ((mx > this.x) && (mx < this.x + this.w));
        boolean inY = ((my > this.y) && (my < this.y + this.h));
        return (inX && inY);
    }
}
