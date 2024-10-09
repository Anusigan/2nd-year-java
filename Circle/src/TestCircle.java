
public class TestCircle {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println("The circle has a radius of "+c.getRadius() +" and the area of "+c.getArea());

        Circle c2=new Circle(10);
        System.out.println("The circle has a radius of "+c2.getRadius() +" and the area of "+c2.getArea());
    }
}