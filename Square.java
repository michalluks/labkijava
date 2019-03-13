public class Square extends Figure
implements Interface {
    double a;

    public Square(double a) throws Exception{
        if(a<=0)
        {
         throw new IllegalArgumentException();
        }
        else {
            this.a = a;
        }
    }

    @Override
    public void print() {
        System.out.println("Side of the square: "+a);
        System.out.println("Area: "+calculateArea());
        System.out.println("Perimeter: "+calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return (a*a);
    }

    @Override
    public double calculatePerimeter() {
        return (a*4);
    }
}