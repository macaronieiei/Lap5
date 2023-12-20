import Lip.Point;

public class Main {

    public static void main(String[] args) {
        Point A = new Point();
        A.setX(20);
        A.setY(50);
        Point B = new Point(30,15);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(A.Distance(B));
        System.out.println(A.Distance());
        System.out.println(B.Distance(10,100));
        System.out.println(Point.getCount());
    }
}