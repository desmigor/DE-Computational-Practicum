package sample;

public class MyFunction implements Function {
    @Override
    public double getFunctionValue(double x, double y) {
        return ((1/(Math.cos(x)))- (y * Math.tan(x)));
    }

    @Override
    public double getSolvedFunctionValue(double c, double x, double y) {
        double expression = c * Math.cos(x) + Math.sin(x);

        return expression;
    }

    @Override
    public double getCoefficient(double x0, double y0){
        return ((y0 - Math.sin(x0))/Math.cos(x0)) ;
    }
}
