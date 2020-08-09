public class Clothes {
    private String Size;
    private String Color;

    public  Clothes (String size,String c){
        this.Size = size;
        this.Color = c;
    }

    public String getSize (){
        return Size;
    }
    public String getColor(){
        return Color;
    }
    public String toString(){
        String s = "Size = " +Size +"\n";
        s += "Color = " +Color;
        return s;
    }
}
