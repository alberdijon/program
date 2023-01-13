package model;

public class MyCircle {
    private MyPoint center;
    private int radius;


    public MyCircle(){

        center = new MyPoint(0,0);
        radius = 1;

    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public double distance(MyCircle another){
        double distance;

        distance = this.center.distance(another.center);

        return distance;
    }

    public boolean isInside(MyPoint puntua){

        boolean inside;

        double distance =this.center.distance(puntua);

        if(distance <= radius){

            inside = true;

        }else{

            inside = false;

        }

        return inside;

    }

    public double getArea(){

        double area = radius * radius * Math.PI;

        return area;

    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle [center=" + center + ", radius=" + radius + "]";
    }

}
