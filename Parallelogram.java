public class Parallelogram extends Quadrilateral
{
    private Point topLeft;
    private Point botLeft;
    private Point botRight;
    public Parallelogram(String lbl, Point tL, Point bL, Point bR)
    {
        
        super(lbl);
        topLeft = tL; 
        botLeft = bL;
        botRight = bR;
    }
    public double perimeter()
    {
        
        double d1 = super.distance(topLeft, botLeft);
        double d2 = super.distance(botLeft, botRight);
        
        return 2*(d1 + d2);
        
    }
    public double area()
    {
        
        double base = super.distance(botLeft, botRight);
        double height = topLeft.getY() - botLeft.getY();
        return base * height;
        
    }
    
   
}