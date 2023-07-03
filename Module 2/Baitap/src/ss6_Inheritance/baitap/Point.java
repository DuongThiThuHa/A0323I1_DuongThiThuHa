package ss6_Inheritance.baitap;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x , float y){
        setX(getX());
        setY(getY());
    }

    public float[] getXY(){
        float[] Arrays = {getX(),getY()};
        return Arrays;
    }

    @Override
    public String toString() {
        String result = "Point is x = "+getX()+" , and y = "+getY();
        for (int i = 0; i < getXY().length; i++) {
            result += getXY()[i];
        }
        return result;
    }
}

class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y) {
        super(x, y);
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void getSpeed( float xSpeed , float ySpeed){
        setxSpeed(getxSpeed());
        setySpeed(getySpeed());
    }

    public float[] getSpeed(){
        float[] Arrays = {getxSpeed(),getySpeed()};
        return Arrays;
    }

    @Override
    public String toString() {
        return "MovablePoint have x = "+getX() +" and y = "+getY()+ " ;xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
    }
}

class Main2{
    public static void main(String[] args) {
        Point point = new Point(5,3);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(2,4,1,2);
        System.out.println(movablePoint);
    }
}
