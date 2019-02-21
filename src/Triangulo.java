
public class Triangulo extends Figura {



    private double base;
    private double altura;


    public Triangulo(double a, double b) {

        this.base =a ;
        this.altura =b;

    }

    public double area()
    {
        double area;
        area = this.base * this.altura*1/2;
        return area;

    }

}
