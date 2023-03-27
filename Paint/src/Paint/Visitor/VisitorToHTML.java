package Paint.Visitor;

import Paint.Maths.Geometry.*;

public class VisitorToHTML implements Visitor
{

    @Override
    public String visit(Circle circle)
    {
        return "<div style='width: " + (circle.getRadius() * 2) + "px; height: " + (circle.getRadius() * 2) + "px; border-radius: 50%; background-color: " + circle.getColor() + ";'></div> <br>";
    }

    @Override
    public String visit(Rectangle rectangle)
    {
        return "<div style='width: " + rectangle.getWidth() + "px; height: " + rectangle.getHeight() + "px; background-color: " + rectangle.getColor() + ";'></div> <br>";
    }

    @Override
    public String visit(Triangle triangle)
    {
        return "<div style='width: 0; height: 0; border-left: " + triangle.getBase() / 2 + "px solid transparent; border-right: " + triangle.getBase() / 2 + "px solid transparent; border-bottom: " + triangle.getHeight() + "px solid " + triangle.getColor() + ";'></div><br>";
    }

}
