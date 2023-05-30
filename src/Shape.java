interface ShapeName{
    String shapeName();
}

public class Shape implements ShapeName{
    private String shapeName;
     public String shapeName(){
         return shapeName;
     }
}
