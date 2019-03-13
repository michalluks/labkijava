public class Prism extends Figure
        implements Interface{
        double h,a,perim;


    public Prism(double h, double a,double per) {
        if(h<0) {
            throw new IllegalArgumentException();
        }
        this.perim=per;
        this.h = h;
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return (2*a+perim*h);
    }

    public double calculateVolume(){
        return (h*a);
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }


    @Override
    public void print() {
        System.out.println("Area of prism: "+calculateArea());
        System.out.println("Volume of prism: "+calculateVolume());
    }
}
