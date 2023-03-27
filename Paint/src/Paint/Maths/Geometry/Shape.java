package Paint.Maths.Geometry;

import Paint.Visitor.Visitor;

import java.awt.*;

/**
 * The type Shape.
 */
public abstract class Shape
{
    public abstract String accept(Visitor visitor);
    /**
     * The Color.
     */
    protected Color color;

    /**
     * Instantiates a new Shape.
     *
     * @param color the color
     */
    public Shape(Color color)
    {
        this.color = color;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public abstract double getArea();

    /**
     * Gets color.
     *
     * @return the color
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(Color color)
    {
        this.color = color;
    }
}



