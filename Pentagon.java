class Pentagon extends Shape{
    Pentagon() {
        super();
    }

    Pentagon(double measurement){
        super(measurement);
    }
    @Override
    public double getPerimeter(){
        return measurement * 5;
    }
    @Override
    public double getArea(){
        return (5 * Math.pow(measurement, 2)) / (4 * Math.tan(Math.PI /5));
    }

    @Override
    public String getType() {
        return "pentagon";
    }
}
