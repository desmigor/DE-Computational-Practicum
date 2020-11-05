package sample;

public class Variables {

    private double N;
    private double x0;
    private double y0;
    private double X;
    private double n0;
    private double nN;

    Variables(){
        setN(20);
        setX0(1.6);
        setY0(1);
        setX(4.6);
        setN0(1);
        setnN(10);
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return y0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getN0() {
        return n0;
    }

    public void setN0(double n0) {
        this.n0 = n0;
    }

    public double getnN() {
        return nN;
    }

    public void setnN(double nN) {
        this.nN = nN;
    }

    public double getN() {
        return N;
    }

    public void setN(double n) {
        N = n;
    }
}
