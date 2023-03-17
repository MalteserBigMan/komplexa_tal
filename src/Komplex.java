public class Komplex {
   double re;
   double im;

    public Komplex(double a, double b) {
        this.re = a;
        this.im = b;
    }

    @Override
    public String toString() {
        return  re + " + " + im + "i";

    }

    public Komplex add(Komplex B) {
        double Ca = this.re + B.re;
        double Cb = this.im + B.im;
        return new Komplex(Ca, Cb);

    }

    public Komplex multiply(Komplex b) {
        return new Komplex(0,0);
    }

    public double arg() {
        return 0;
    }

    public boolean equals(Komplex b){

    }
}
