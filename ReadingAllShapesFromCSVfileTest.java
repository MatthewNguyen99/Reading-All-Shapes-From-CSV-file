import junit.framework.TestCase;

public class ReadingAllShapesFromCSVfileTest  extends TestCase  {

    private final Square SQUARE_TEST     = new Square(5);
    private final Pentagon PENTAGON_TEST = new Pentagon(3);
    private final Triangle TRIANGLE_TEST = new Triangle(2.5);
    private final Circle CIRCLE_TEST     = new Circle(2);

    public void testGetPerimeterSquare() throws Exception {
        assertEquals(SQUARE_TEST.getPerimeter(), 20.00 );
    }

    public void testGetAreaSquare() throws Exception {
        assertEquals(SQUARE_TEST.getArea(), 25.00 );
    }

    public void testGetPerimeterPentagon() throws Exception {
        assertEquals(PENTAGON_TEST.getPerimeter(), 15.00 );
    }

    public void testGetAreaPentagon() throws Exception {
        assertEquals(PENTAGON_TEST.getArea(), 15.48 );
    }

    public void testGetPerimeterTriangle() throws Exception {
        assertEquals(TRIANGLE_TEST.getPerimeter(), 7.50 );
    }

    public void testGetAreaTriangle() throws Exception {
        assertEquals(TRIANGLE_TEST.getArea(), 2.71 );
    }

    public void testGetPerimeterCircle() throws Exception {
        assertEquals(CIRCLE_TEST.getPerimeter(), 12.57  );
    }

    public void testGetAreaCircle() throws Exception {
        assertEquals(CIRCLE_TEST.getArea(), 12.57  );
    }

    public void assertEquals(double value, double verification) {
        if (value != verification) {
            throw new RuntimeException("Assert failed: " + value + " != " + verification);
        }
    }
}
