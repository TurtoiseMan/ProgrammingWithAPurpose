
public class ActivationFunction {
    public static double heaviside(double x)
    {
        if (x < 0) return 0;
        else if (x == 0) return 0.5;
        else if (x > 0) return 1.0;
        else return Double.NaN;
    }

    public static double sigmoid(double x)
    {
        return 1.0 / (1.0 + Math.exp(-x));
    }

    public static double tanh(double x)
    {
        double a = Math.exp(x);
        double b = Math.exp(-x);
        return (a - b) / (a + b);
    }

    public static double softsign(double x)
    {
        return x / (1.0 + Math.abs(x));
    }

    public static double sqnl(double x)
    {
        if (x <= -2) return -1.0;
        else if (x > -2 && x < 0) return x + (x * x / 4);
        else if (x >= 0 && x < 2) return x - (x * x / 4);
        else if (x >= 2) return 1.0;
        else return x;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + x + ") = " + heaviside(x));
        StdOut.println("  sigmoid(" + x + ") = " + sigmoid(x));
        StdOut.println("     tanh(" + x + ") = " + tanh(x));
        StdOut.println(" softsign(" + x + ") = " + softsign(x));
        StdOut.println("     sqnl(" + x + ") = " + sqnl(x));

    }
}