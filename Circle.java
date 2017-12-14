class Circle extends Shape{
    Circle(double measurement){
        super(measurement);
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * measurement;
    }
    @Override
    public double getArea(){
        return Math.PI * measurement * measurement;
    }

    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public String getLengthName() {
        return "radius";
    }
}
