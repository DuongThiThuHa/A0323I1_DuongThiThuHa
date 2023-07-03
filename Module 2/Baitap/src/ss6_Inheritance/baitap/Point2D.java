package ss6_Inheritance.baitap;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    private Point2D Arrays;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] Arrays = {getX(), getY()};
        return Arrays;
    }

    @Override
    public String toString() {
        return "Point2D co diem x la : " + x + " va diem la y: " + y + " .Ket qua la =" + getXY()[0] + " , " + getXY()[1];
    }

}

class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {

        return z;
    }

    public void setZ(float z) {

        this.z = z;
    }

    public void getXYZ(float x, float y, float z) {
        setX(getX());
        setY(getY());
        setZ(getZ());
    }

    public float[] getXYZ() {
        float[] Arrays = {getX(), getY(), getZ()};
        return Arrays;
    }

    @Override
    public String toString() {
        String result = "Point3D co gia tri z la " + z + "Ket qua la : ";
        for (int i = 0; i < getXYZ().length; i++) {
            result += getXYZ()[i];
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 5);
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(2, 4, 1);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        System.out.println(point3D.toString());
    }
}

