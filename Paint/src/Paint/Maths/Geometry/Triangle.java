package Paint.Maths.Geometry;


import Paint.Visitor.Visitor;

import java.awt.*;

/**
 * The type Triangle.
 */
public class Triangle extends Shape
{
    private double base;
    private double height;

    public Triangle(Color color, double base, double height)
    {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getHeight()
    {
        return height;
    }


    public void setHeight(double height)
    {
        this.height = height;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getArea()
    {
        return 0.5 * base * height;
    }
}