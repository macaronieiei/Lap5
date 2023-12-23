import Lip.MoveablePoint;

public class Main {

    public static void main(String[] args) {
    MoveablePoint C = new MoveablePoint(20,60,5);
    System.out.println(C.toString());
    C.Forward();
    System.out.println(C.toString());
    C.Backward();
    System.out.println(C.toString());
}
}
