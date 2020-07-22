//object class for "Fraction" objects
public class Fraction {
    //defining fields
    private int num;
    private int den;


    /*
    calculating magnitude of the fraction
    @return a double - magnitude of the fraction
     */
    public int getNum(){
        return this.num;
    }

    public int getDen(){
        return this.den;
    }

    public void setNum(int n){
        this.num = n;
    }

    public void setDen(int d){
        this.den = d;
    }
    public double size(){
        return Math.abs((double)getNum()/getDen());
    }

    public Fraction(){
        this.num = 0;
        this.den = 1;
    }

    public Fraction (Fraction g){
        this.num = g.num;
        this.den = g.den;
    }

    public Fraction (int n, int d){
        this.num = n;
        this.den = d;
    }

    public Fraction compare(Fraction other){
        if (this.size() >= other.size()){
            return this;
        }else{
            return other;
        }
    }

    public Fraction Multiply(Fraction other){
        Fraction temp = new Fraction();
        temp.setNum(this.getNum()* other.getNum());
        temp.setDen(this.getDen()* other.getDen());
        return temp;
    }

    public void timesEquals (Fraction p){
        this.setNum(this.getNum() * p.getNum());
        this.setDen(this.getDen() * p.getDen());
    }

    public void plus (Fraction f){
        this.setNum(this.getNum() + f.getNum());
        this.setDen(this.getDen() + f.getDen());
    }

}
