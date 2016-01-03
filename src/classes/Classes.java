package classes;

class Figure{
    int x, y;
    
    public Figure(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    public void print(){
        System.out.println("Figure coordinates: x="+x+", y="+y);
    }
}

class Point extends Figure{
    public Point(int x, int y) {
        super(x, y);
    }
    @Override
    public void print(){
        System.out.println("Point coordinates: x="+x+", y="+y);
    }    
}

class Square extends Point{
    int h; //height

    public Square(int x, int y, int h) {
        super(x, y);
        this.h = h;
    }
    public void multiply(double k){
        this.h *= k;
    }
    @Override
    public void print(){
        System.out.println("Square coordinates: x="+x+", y="+y+", height ="+h);
    }
}

class Rectangle extends Square{
    int w; //width

    public Rectangle(int x, int y, int h, int w) {
        super(x, y, h);
        this.w = w;
    }
    @Override
    public void multiply(double k){
        super.multiply (k);
        this.w *= k;
    }
    @Override
    public void print(){
        System.out.println("Rectangle coordinates: x="+x+", y="+y+", h="+h+", w="+w);
    }
}

class Triangle extends Figure{
    double x2, y2, x3, y3; //corner coordinates

    public Triangle(int x, int y, double x2, double y2, double x3, double y3) {
        super(x, y);
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }
    @Override
    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
        x2+=dx;
        y2+=dy;
        x3+=dx;
        y3+=dy;
    }
    public void multiply(double k){
        x2=x+(x2-x)*k;
        y2=y+(y2-y)*k;
        x3=x+(x3-x)*k;
        y3=y+(y3-y)*k;
    }
    @Override
    public void print(){
        System.out.println("Triangle coordinates: x1="+x+", y1="+y+", x2="+x2+", y2="+y2+", x3="+x3+", y3="+y3);
    }
}

public class Classes {
    public static void main(String[] args) {
        Square sq = new Square(12,15,5);
        sq.move(-1, 6);
        sq.print();
        Rectangle rec = new Rectangle(3,1,7,6);
        rec.move(-1, 17);
        rec.print();
        rec.multiply(3);
        rec.print();
        Triangle tr = new Triangle(0,0,5.4,6.2,9,10.2);
        tr.print();
        tr.multiply(1.1);
        tr.print();
        System.exit(0);
    }
}
