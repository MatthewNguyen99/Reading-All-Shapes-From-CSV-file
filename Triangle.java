
class Triangle extends Shape{
    Triangle() {
        super();
    }
    Triangle(double measurement){
        super(measurement);
    }
    @Override
    public double getPerimeter(){
        return measurement * 3;
    }
    @Override
    public double getArea(){
        return (Math.sqrt(3)/4)*(measurement * measurement);
    }

    @Override
    public String getType() {
        return "triangle";
    }
}
