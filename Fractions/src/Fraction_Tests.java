public class Fraction_Tests {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Fraction f = new Fraction();
        f.setNum(3);
        f.setDen(4);
        System.out.println(f.getNum()+"\\" +f.getDen());


        Fraction g = f;
        g.setNum(7);
        f.setDen(9);
        //System.out.println ("g=" +g.num +"\\" +g.den);
        //	System.out.println ("f=" +f.num +"\\"+f.den);

        Fraction f2= new Fraction();
        f2.setNum(3);
        f2.setDen(4);
        //System.out.println(f.size());
        //	System.out.println(f2.size());

        System.out.println (f2.compare(f));
        /*
         * Whichever object calls the method that uses the "this" class, that object becomes the "this" variable.
         * This, in this case, equals F2,
         * the other variable in the method becomes F.
         * X.larger(Y), X = "This", Y =Other
         */

        Fraction h = f.compare(f2);
        System.out.println(h.getNum() +"\\" +h.getDen());
        f.setNum(2);
        System.out.println(h.getNum() +"\\" +h.getDen());
        h = f2;
        System.out.println(h.getNum() +"\\" +h.getDen());

        h = f.Multiply(f2);
        System.out.println(h.getNum() +"\\" +h.getDen());

    }
}
