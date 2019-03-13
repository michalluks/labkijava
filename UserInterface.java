import java.util.Scanner;


public class UserInterface {
    public static void main(String[] args) throws Exception {
        int a;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.flush();
            System.out.println("Choose function: ");
            System.out.println("1.Square.");
            System.out.println("2.Triangle.");
            System.out.println("3.Circle.");
            System.out.println("4.Prism.");
            System.out.println("0.Exit.");
            a = scanner.nextInt();
            if (a == (0)) {
                break;
            }
            switch (a) {
                case 1:
                    System.out.println("Square side lenght: ");
                    double side = scanner.nextDouble();
                    try {
                        Square square = new Square(side);
                        square.print();
                    } catch (IllegalArgumentException exc) {
                        System.out.println("Illegal arguments!!!");
                    }
                    break;
                case 2:
                    System.out.println("Triangle sides lenghts: ");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    try {
                        Triangle triangle = new Triangle(side1, side2, side3);
                        triangle.print();
                    } catch (IllegalArgumentException exc) {
                        System.out.println("Illegal arguments!!!");
                    }
                    break;
                case 3:
                    System.out.println("Radius of circle: ");
                    double rad = scanner.nextDouble();
                    try {
                        Circle circle = new Circle(rad);
                        circle.print();
                    } catch (IllegalArgumentException exc) {
                        System.out.println("Illegal arguments!!!");
                    }
                    break;
                case 4:
                    System.out.println("Base of prism: ");
                    System.out.println("1.Square: ");
                    System.out.println("2.Triangle: ");
                    System.out.println("3.Circle: ");
                    a = scanner.nextInt();
                    System.out.println("Height of prism: ");
                    double h = scanner.nextDouble();
                    switch (a) {
                        case 1:
                            System.out.println("Square side lenght: ");
                            side = scanner.nextDouble();
                            try {
                                Square square = new Square(side);
                                Prism prism = new Prism(h,square.calculateArea(),square.calculatePerimeter());
                                prism.print();
                            } catch (IllegalArgumentException exc) {
                                System.out.println("Illegal arguments!!!");
                            }
                            break;
                        case 2:
                            System.out.println("Triangle sides lenghts: ");
                            side1 = scanner.nextDouble();
                            try {
                                Triangle triangle = new Triangle(side1, side1, side1);
                                Prism prism = new Prism(h,triangle.calculateArea(),triangle.calculatePerimeter());
                                prism.print();
                            } catch (IllegalArgumentException exc) {
                                System.out.println("Illegal arguments!!!");
                            }
                            break;
                        case 3:
                            System.out.println("Radius of circle: ");
                            rad = scanner.nextDouble();
                            try {
                                Circle circle = new Circle(rad);
                                Prism prism = new Prism(h,circle.calculateArea(),circle.calculatePerimeter());
                                prism.print();
                            } catch (IllegalArgumentException exc) {
                                System.out.println("Illegal arguments!!!");
                            }
                            break;
                    }
                    break;
                    default:
                        System.out.flush();
                        System.out.println("Wrong input, press anything to continue and try again!");
                        System.in.read();


            }

        }


    }
}