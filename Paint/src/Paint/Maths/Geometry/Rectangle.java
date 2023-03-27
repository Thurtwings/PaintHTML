package Paint.Maths.Geometry;
import Paint.Visitor.Visitor;

import java.awt.*;


public class Rectangle extends Shape  {
    private double width;
    private double height;


    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
