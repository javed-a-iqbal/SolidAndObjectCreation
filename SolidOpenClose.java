import java.awt.*;

interface Shape{
    public double drawArea();
}

class Triangle implements Shape{

    private double width;
    private  double height;

    public Triangle(double width, double height){
                    this.height=height;
                    this.width=width;

    }

    @Override
    public double drawArea() {
        return this.width*this.height;
    }
}
class Circle implements Shape{

        private  double redius;
    public Circle(double r){
        this.redius=r;

    }
    @Override
    public double drawArea() {
        return this.redius*this.redius*3.14;
    }
}
public class SolidOpenClose {

    public static void printArea(Shape shape){
        System.out.println("area..... is "+shape.drawArea());
    }

    public static  void main(String[] args){
         Circle cr= new Circle(2.5);
         printArea(cr);

            }
}
