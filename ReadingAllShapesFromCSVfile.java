import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by matthewnguyen99 on 2017-10-14.
 */

public class ReadingAllShapesFromCSVfile{
    public ArrayList<Shape> readFile() throws FileNotFoundException {
        ArrayList<Shape> arrListShape = new ArrayList<>();

        Scanner scan = new Scanner(new FileReader("src/inputCSV.txt"));
        while(scan.hasNext()){
            String item = scan.nextLine(); //item: square,5   pentagon,3   triangle,2.5   circle,2

            String [] arrShape = new String[0];
            arrShape = item.split(",");

            String type = arrShape[0];
            double measurement = Double.parseDouble(arrShape[1]);

            switch(type){
                case "square":
                    Square square = new Square(measurement);
                    arrListShape.add(square);
                    break;
                case "pentagon":
                    Pentagon pentagon = new Pentagon(measurement);
                    arrListShape.add(pentagon);
                    break;
                case "triangle":
                    Triangle triangle = new Triangle(measurement);
                    arrListShape.add(triangle);
                    break;
                case "circle":
                    Circle circle = new Circle(measurement);
                    arrListShape.add(circle);
                    break;
            }
        }
        return arrListShape;
    }

    public void printInfo(ArrayList<Shape> arrListShape){
        for(int index = 0; index < arrListShape.size(); index++){
            Shape currentShape = arrListShape.get(index);

            System.out.printf("Shape %d is a %s, with %s of %.2f,\nhaving a perimeter of %.2f and an area of %.2f units square.\n\n",
                    index + 1,
                    currentShape.getType(),
                    currentShape.getLengthName(),
                    currentShape.getMeasurement(),
                    currentShape.getPerimeter(),
                    currentShape.getArea());
        }
    }

    public static void main(String [] args){
        ReadingAllShapesFromCSVfile shape = new ReadingAllShapesFromCSVfile();
        ArrayList<Shape> arrListShape = new ArrayList<>();
        try{
            arrListShape = shape.readFile();
        }
        catch(FileNotFoundException e){
            System.out.println("NO file");
        }

        shape.printInfo(arrListShape);
    }
}
