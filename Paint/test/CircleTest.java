import Paint.Maths.Geometry.*;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        int expected = 5;
        Circle c =  new Circle(Color.red, expected);

        assertEquals(expected, c.getRadius(), "Circ Circle should have radius 5");
    }

    @Test
    void setRadius() {
    }

    @Test
    void accept() {
    }

    @Test
    void getArea() {
    }
}