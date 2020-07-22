public class OOP_Fractions {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Fraction p = new Fraction();
        Fraction q = new Fraction();
        Fraction r = new Fraction();
        p.setNum(1);
        p.setDen(3);
        q.setNum(4);
        q.setDen(5);
        r = p.compare(q);
        System.out.println(r.getNum() +"\\" +r.getDen()  +" q is larger");
        p.setNum(7);
        p.setDen(-5);
        q.setNum(-9);
        q.setDen(-7);
        r = p.compare(q);
        System.out.println(r.getNum() +"\\" +r.getDen()  +" p is larger");
        p.setNum(5);
        p.setDen(6);
        q.setNum(-25);
        q.setDen(-30);
        r = p.compare(q);
        System.out.println(r.getNum() +"\\" +r.getDen()  +" p is larger");
        p.setNum(-9);
        p.setDen(-12);
        q.setNum(-3);
        q.setDen(4);
        r = p.compare(q);
        System.out.println(r.getNum() +"\\" +r.getDen()  +" p is larger");
        p.setNum(5);
        p.setDen(8);
        q.setNum(13);
        q.setDen(20);
        r = p.compare(q);
        System.out.println(r.getNum() +"\\" +r.getDen()  +" q is larger");
    }
}
