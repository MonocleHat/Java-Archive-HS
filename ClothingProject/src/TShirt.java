public class TShirt extends Clothes{
    private String fabric;

    public TShirt(String size, String color, String fab){
        super(size,color);
        this.fabric = fab;
    }
    public String getFabric(){
        return fabric;
    }

    public String toString(){
        String s = "fabric = " +fabric +"\n";
        s+= super.toString();
        return s;
    }
}
