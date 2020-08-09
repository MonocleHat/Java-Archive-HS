public class clothesTester {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Jeans j1 = new Jeans("8");
        System.out.println(j1.clean());
        Clothes j2 = new Jeans("10");
        System.out.println(((Jeans) j2).clean());
        System.out.println(j1);

        Sweatshirt sw1 = new Sweatshirt("7", "black", false);
        System.out.println(sw1);

        TShirt ts1 = new TShirt("11", "orange", "cotton");
        System.out.println(ts1);

        System.out.println(j2 instanceof TShirt);



    }
}
