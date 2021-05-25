public class Trapezoid extends Quadrilateral
{
    private Point topLeft;
    private Point botLeft;
    private Point botRight;
    private Point topRight;
    public Trapezoid(String lbl, Point tL, Point bL, Point bR, Point tR)
    {
        //<for you to complete 4 points>
        super(lbl);
        topLeft = tL;
        botLeft = bL;
        botRight = bR;
        topRight = tR;
    }
    public double perimeter()
    {
        //<for you to complete 8 points>
        double d1 = super.distance(topLeft, topRight);
        double d2 = super.distance(topRight, botRight);
        double d3 = super.distance(botRight, botLeft);
        double d4 = super.distance(botLeft, topLeft);
        
        return (d1+d2+d3+d4);
        
    }
    public double area()
    {
        //<for you to complete 8 points>
        double height = topLeft.getY() - botLeft.getY();
        double base1 = super.distance(topLeft, topRight);
        double base2 = super.distance(botLeft, botRight);
        double avgBase = (base1 + base2)/2;
        
        return height * avgBase;
        
    }
    
   
}