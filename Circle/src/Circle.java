public class Circle {
    private double radius;
    private String colour;



    //Default Constructor
    public Circle(){
        radius=1;
        colour="black";
    }

    public Circle (double r){
        radius=r;
        colour="black";
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }


}
