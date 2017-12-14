abstract class Shape{

    protected double measurement;

    /**
     * Creates a shape with an initial measurement of 0.
     */
    public Shape(){
        this(0.0);
    }

    /**
     * Creates a shape with the specified measure.
     * @param measurement Shape's measurement
     */
    public Shape(double measurement){
        this.measurement = measurement;
    }

    /**
     * Returns the measurement of the shape.
     * @return the mesurement of the shape
     */
    public double getMeasurement() {
        return measurement;
    }

    /**
     * Sets the measurement of the shape to the specified value.
     * @param measurement the new measurement of the shape
     */
    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    /**
     * Returns the perimeter of the shape.
     * @return The perimeter of the shape
     */
    public abstract double getPerimeter();

    /**
     * Calculates and returns the area of the shape
     * @return The area of the shape
     */
    public abstract double getArea();

    /**
     * Returns the english name of the shape
     * @return the name of the shape
     */
    public abstract String getType();

    /**
     * Returns the name of the side of the shape.
     * Ex. Square uses "side length"; circle uses "radius", etc.
     * @return THe name of the side of the shape.
     */
    public String getLengthName() {
        return "side length";
    }
}
