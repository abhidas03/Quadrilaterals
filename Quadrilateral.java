public abstract class Quadrilateral
{
    private String label; // i.e. “ABCD”
    public Quadrilateral(String lbl)
    {
        label = lbl;
    }
    public String getLabel()
    {
        return label;
    }
    protected double distance(Point one, Point two)
    {
        int x1 = one.getX();
        int y1 = one.getY();
        int x2 = two.getX();
        int y2 = two.getY();
        double ans = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        return ans;
    }
    public abstract double perimeter();
    public abstract double area();
    
    public String toString()
    {
        //Did research on best way to format decimals, this is was something I found and I liked it
        String roundP = String.format("%.1f", this.perimeter());
        String roundA = String.format("%.1f", this.area());
        return label + "\t" + roundP + "\t\t" + roundA;
    }
    
}