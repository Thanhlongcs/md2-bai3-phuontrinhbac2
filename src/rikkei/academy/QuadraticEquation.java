package rikkei.academy;


public class QuadraticEquation {
    //Khai báo trường dữ liệu a,b,c - thực chất trường dữ liệu (fields) là 1 biến được khai báo trong class
    private double a,b,c;

    //Viết Phương thức khởi tạo (constructor) với 3 tham số để khởi tạo các giá trị cho a, b và c.
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //Viết Phương thức getDiscriminant() trả về delta theo công thức delta = b2 - 4ac.
    public double getDelta() {
        return (this.b*this.b - 4 * this.a * this.c);
    }

    //Viết	Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình
    public double getRoot1() {
        return (-this.b + Math.pow(this.getDelta(),0.5))/(2*this.a) ;
    }
    public double getRoot2() {
        return (-this.b - Math.pow(this.getDelta(),0.5))/(2*this.a) ;
    }
}