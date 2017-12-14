class Square extends Shape{

    Square(){
        super();
    }

    Square(double measurement){
        super(measurement);
    }
    @Override
    public double getPerimeter(){
        return measurement * 4;
    }
    @Override
    public double getArea(){
        return measurement * measurement;
    }

    @Override
    public String getType() {
        return "square";
    }

}
