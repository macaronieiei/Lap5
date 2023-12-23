package Lip;

public class MoveablePoint extends Point {
    private double speed;
    
    public MoveablePoint(){
        this(0,0,0);
    }
    public MoveablePoint(double x,double y,double speed){
        super(x,y);
        this.setSpeed(speed);
    }
//Speed
    public double getSpeed(){
        return this.speed;
    }
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
//Forward
    public void Forward(){
        setX(getX()+this.speed);
        setY(getY()+this.speed);
    }
    public void Backward(){
        setX(getX()-this.speed);
        setY(getY()-this.speed);
    }
//Tostring
    public String toString(){
    return "( "+this.getX()+" , "+this.getY()+" , "+speed+" )";
}
}
