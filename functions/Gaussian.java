
public class Gaussian {
    public static double pdf(double x) //probability distribution function
    {
        return Math.exp(-x*x / 2) / Math.sqrt(2 * Math.PI);
    }

    public static double pdf(double x, double mu, double sigma)
    {
        return Math.exp(-(x - mu) * (x - mu) / (2 * sigma * sigma)) / Math.sqrt(2 * Math.PI);
    }

    public static double cdf(double z)
    {
        if ( z < -8.0) return 0.0;//negligible
        if (z >   8.0) return 1.0;
        double sum = 0.0, term = z;
        for (int i = 3; sum + term != sum; i+= 2) //taylor series
        {
            sum = sum + term;
            term = term * z * z / i;
        } 
        return 0.5 + sum * pdf(z);
    }

    public static double cdf(double z, double mu, double sigma)
    {
        return cdf((z - mu) / sigma);
    }

    public static void main(String[] args) {
        double z = Double.parseDouble(args[0]);
        double mu = Double.parseDouble(args[1]);
        double sigma = Double.parseDouble(args[2]);
        int N = Integer.parseInt(args[3]);
        StdDraw.setXscale(-4.0, 4.0);//draw a plot of phi(x,0,1) in (-4,4)
        StdDraw.setYscale(0, 0.5);
        StdDraw.setPenRadius(0.01);
        double[] x = new double[N];
        double[] y = new double[N];
        for (int i = 0; i <= N; i++)
        {
            x[i] = -4.0 + 8.0 * i / N;
            y[i] = pdf(x[i]);
        }
        for (int i = 0; i < N; i++)
        {
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
        }
        StdOut.println(cdf(z, mu, sigma));
    }
}