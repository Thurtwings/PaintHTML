package Paint.Visitor;
import Paint.Maths.Geometry.*;
public interface Visitor
{

  public String visit(Circle circle);
  public String visit(Rectangle rectangle);
  public String visit(Triangle triangle);

}
