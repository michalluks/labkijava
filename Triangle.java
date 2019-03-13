public class Triangle extends Figure
        implements Interface{
    double s1,s2,s3;

    public Triangle(double s1, double s2, double s3) {
        if (s1<0 || s2<0 || s3<0 || s1+s2<=s3 || s1+s3<=s2 || s2+s3<=s1){
            throw new IllegalArgumentException();
        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double calculateArea() {
        double p = (s1+s2+s3)/2;
        return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
    }

    @Override
    public double calculatePerimeter() {
        return (s1+s2+s3);
    }

    @Override
    public void print() {
        System.out.println("Sides of the triangle: "+s1+" "+s2+" "+s3);
        System.out.println("Area: "+calculateArea());
        System.out.println("Perimeter: "+calculatePerimeter());
    }
}