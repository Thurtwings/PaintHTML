package Paint.Maths.Geometry;
import Paint.Visitor.Visitor;

import java.awt.*;

public class Circle extends Shape
{
    private double radius;

    public Circle(Color color, double radius)
    {
        super(color);
        this.radius = radius;
    }


    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor)
    {
        return visitor.visit(this);
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}
