public abstract class Figura implements Comparable<Figura>{

   /* public Figura(){

    }
    */
    public abstract double  area();

    public int compareTo(Figura l) {

        return (int)(this.area() - l.area());
    }
}
