import java.awt.*;

public class Square
{
    private Point location;
    private int width;
    private boolean isSelected;

    public Square() {
        this.location = new Point(0, 0);
        this.width = 1;
        this.isSelected = false;
    }

    public Square(Point location, int width)
    {
        this.location = location;
        this.width = width;
        this.isSelected = false;
    }

    public Square(Point p1, Point p2) throws Exception
    {
        int width = Math.abs(p1.x - p2.x);
        int height = Math.abs(p1.y - p2.y);

        if (width != height)
        {
            throw new Exception("The two points does not form a square : width=" + width + " height=" + height);
        }

        this.location = new Point(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y));
        this.width = width;
        this.isSelected = false;
    }

    public void print() {
        System.out.print(toString());
        System.out.flush();
    }

    public void select()
    {
        isSelected = !isSelected;
    }

    public Point getLoc()
    {
        return location;
    }

    public void setLoc(Point location)
    {
        this.location = location;
    }

    public Rectangle getBounds()
    {
        return new Rectangle(location.x, location.y, width, width);
    }

    public void translate(int dx, int dy)
    {
        location.translate(dx, dy);
    }

    @Override
    public String toString()
    {

        return "Square : location=" + location.x + "|" + location.y + " ; width=" + width + " ; isSelected=" + isSelected;
    }
}
