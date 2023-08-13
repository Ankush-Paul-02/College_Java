import java.util.*;

class Volume {
    //! Cube
    Volume(double side) {
        System.out.println("Volume of cube: " + side*side*side);
    }
    //! Rectangle
    Volume(double length, double width, double height) {
        System.out.println("Volume of rectangle: " + length*width*height);
    }
    //! Cylinder
    Volume(double radius, double height) {
        System.out.println("Volume of cylinder: " + 3.14*radius*radius*height);
    }
}

class Calculation {
    static Scanner sc = new Scanner(System.in);
    static Volume volume;

    public static void main(String[] args) {

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        volume = new Volume(side);

        System.out.print("Enter length, width, height of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height1 = sc.nextDouble();
        volume = new Volume(length, width, height1);

        System.out.print("Enter radius, height of cylinder: ");
        double radius = sc.nextDouble();
        double height2 = sc.nextDouble();
        volume = new Volume(radius, height2);
    }
}
