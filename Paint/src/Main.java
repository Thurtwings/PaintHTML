import Paint.Maths.Geometry.*;
import Paint.Maths.Geometry.Rectangle;
import Paint.Maths.Geometry.Shape;
import Paint.Visitor.*;

import java.awt.*;



public class Main
{

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(Color.orange, 500, 500);
        Circle circle = new Circle(Color.red, 90);
        Triangle triangle = new Triangle(Color.cyan, 500, 305);

        export(rectangle);
        export(circle);
        export(triangle);
        Visitor visitor = new VisitorToHTML();

        String html = rectangle.accept(visitor)+circle.accept(visitor)+triangle.accept(visitor);
        Utils.writeHTMLToIndex(html);


    }

    public static void export(Shape shape)
    {
        VisitorToHTML visitor = new VisitorToHTML();
        System.out.println(shape.accept(visitor));

    }

}