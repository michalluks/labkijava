public class Circle extends Figure
implements Interface{
    double rad;

    public Circle(double rad) {
        if(rad<0)
        {
            throw new IllegalArgumentException();
        }
        this.rad = rad;
    }

    @Override
    public double calculateArea() {
        return (rad*rad*Math.PI);
    }

    @Override
    public double calculatePerimeter() {
        return (2*rad*Math.PI);
    }

    @Override
    public void print() {
        System.out.println("Radius of the circle: "+rad);
        System.out.println("Area: "+calculateArea());
        System.out.println("Perimeter: "+calculatePerimeter());
    }
}