

public abstract class Shape{
    private String shapeName;
     public Shape(String shapeName){
         this.shapeName = shapeName;
         System.out.println(shapeName);
     }

    public static void main(String[] args) {
        new Triangle("Triangle");
        new Circle("Circle");
        new Quad("Quad");
        new Rectangle("Rectangle");
        new Trapezoid("Trapezoid");
    }

}
