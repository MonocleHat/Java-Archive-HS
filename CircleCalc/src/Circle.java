public class Circle {

    private double Radius;
    private double xCent;
    private double yCent;

    //Constructor for default Circle
    public Circle(){
        this.Radius = 1;
        this.xCent = 0;
        this.yCent = 0;
    }
    //Sets circle size, makes sure radius isnt equal to neg size
    public Circle (double R, double X, double Y){
        this.Radius = Math.abs(R);
        this.xCent = X;
        this.yCent = Y;
    }

    //creates circle with same values as another circle object
    public Circle(Circle x){
        this.Radius = x.Radius;
        this.xCent = x.xCent;
        this.yCent = x.yCent;
    }

    public double getRadi(){
        return Radius;
    }

    public double getXCent(){
        return xCent;
    }

    public double getYCent(){
        return yCent;
    }

    public void setRadius(double R){
        this.Radius = R;
    }

    public void setXCent(double X){
        this.xCent = xCent;
    }

    public void setYCent(double yCent){
        this.yCent = yCent;
    }

    public double getArea(double R){
        double circleArea = 0;
        circleArea = 3.14159265359 * Math.pow (Radius, 2);
        return circleArea;
    }

    public Circle smaller(Circle other){
        if (this.Radius >= other.Radius){
            return other;
        }else{
            return this;
        }
    }

    public double distance (Circle c){
        double d = Math.sqrt(Math.pow((this.xCent-c.xCent),2)+Math.pow(this.yCent-c.yCent,2));
        return d;
    }

    public boolean isInside (Circle other){
        double d = distance(other);
        if (other.Radius >= (d+this.Radius)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isIdentical (Circle other){
        double d = distance(other);
        if (other.Radius == (d+this.Radius)&&other.xCent == (d+this.xCent) && other.yCent == (d+this.yCent)){
            return true;
        }else{
            return false;
        }
    }

    public String tostring(){
        String s = "Radius: " + this.Radius + ", Centre: " + this.xCent + ", " + this.yCent;
        return s;
    }

    public boolean equals(Circle h){
        return this.Radius == h.Radius && this.xCent == h.xCent && this.yCent == h.yCent;
    }
}
