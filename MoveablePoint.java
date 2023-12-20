package Lip;

public class MoveablePoint extends Point{
    private double speed;
    
    public MoveablePoint(){
        this(0,0,0);
    }
    public MoveablePoint(double x,double y,double speed){
        super(x,y);
        this.setSpeed(speed);
    }
    public double getSpeed(){
        return this.speed;
    }
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
}
