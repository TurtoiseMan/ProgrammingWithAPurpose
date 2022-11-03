
public class AudioCollage {
    public static double[] amplify(double[] a, double alpha)
    {
        int n = a.length;
        double[] b = new double[n];
        for (int i = 0; i < n; i++)
        {
            b[i] = a[i] * alpha;
        }
        return b;
    }

    public static double[] reverse(double[] a)
    {
        int n = a.length;
        double[] b = new double[n];
        for (int i = 0; i < n; i++)
        {
            b[i] = a[n-1-i];
        }
        return b;
    }

    public static double[] merge(double[] a, double[] b)
    {
        int n1 = a.length;
        int n2 = b.length;
        double[] c = new double[n1 + n2];
        int i = 0;
        for (i = 0; i < n1; i++)
        c[i] = a[i];
        for (i = 0; i < n2; i++)
        c[n1 - 1 + i] = b[i];
        return c;
    }

    public static double[] mix(double[] a, double[] b)
    {
        int n1 = a.length;
        int n2 = b.length;
        
        if ( n1 > n2)
        {   double[] c = new double[n1];
            for (int i = 0; i < n1; i++)
            {
                if (i >= n2)
                c[i] = a[i] + 0.0;
                else
                c[i] = a[i] + b[i];
            }
            return c;
        }

        else 
        {   double[] c = new double[n2];
            for (int i = 0; i < n2; i++)
            {
                if (i >= n1)
                c[i] = b[i] + 0.0;
                else
                c[i] = b[i] + a[i];
            }
            return c;
        }
    }

    public static double[] changeSpeed(double[] a, double alpha)
    {
        int n = a.length;
        int n1 = (int) (n / alpha);
        double[] b = new double[n1+1];
        for (int i = 0; i < n1+1; i++ )
        b[i] = a[i] * alpha;
        return b;
    }

    public static void main(String[] args) {
        String beatbox = "beatbox.wav";
        String harp = "harp.wav";
        String cow = "cow.wav";
        String dialup = "dialup.wav";
        String chimes = "chimes.wav";
        double[] a = StdAudio.read(beatbox);
        double[] b = StdAudio.read(harp);
        double[] c = StdAudio.read(cow);
        double[] d = StdAudio.read(dialup);
        double[] e = StdAudio.read(chimes);

        double[] f = amplify(merge(changeSpeed(e, 2.0), merge(reverse(c), merge(a, mix(b, d)))), 2.0);
        StdAudio.play(f);
    }

}