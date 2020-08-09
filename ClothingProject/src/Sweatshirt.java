public class Sweatshirt extends Clothes{
    private boolean hasHood = false;
    public Sweatshirt(String size, String color, boolean hasHood){
        super(size,color);
        this.hasHood = hasHood;
    }
    public boolean getHood(){
        return hasHood;
    }
}
