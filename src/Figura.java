public abstract class Figura{

   /* public Figura(){

    }
    */
    public abstract double  area();

    public int compareTo(Figura l) {

        return (int)(this.area() - l.area());
    }
}
