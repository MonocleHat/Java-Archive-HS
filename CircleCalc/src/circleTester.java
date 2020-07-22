public class circleTester {

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.setXCent(4);
        c1.setYCent(-1);
        c1.setRadius(3);

        Circle c2 = new Circle();
        c2.setXCent(3);
        c2.setYCent(-2);
        c2.setRadius(5);

        System.out.println(c1.getArea(c1.getRadi()));
        System.out.println(c1.smaller(c2));

        boolean sPos = c1.isInside(c2);
        if (sPos = true){
            System.out.println("overlapping");
        }else{
            System.out.println("not overlapping");
        }

        Circle c3 = c1;
        Circle c4 = new Circle(c1.getRadi(),c1.getXCent(),c1.getYCent());
        System.out.println(c1==c3);
        System.out.println(c1==c4);
        System.out.println(c1.equals(c4));
    }
}
