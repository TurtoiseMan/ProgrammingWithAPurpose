
public class Chaos {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);

        double c = Math.sqrt(3.0) / 2.0;
        double[] cx = {0.000, 1.000, 0.500};
        double[] cy = {0.000, 0.000, c};
        StdDraw.setPenRadius(0.01);
        double x = 10.0, y= 10.0;
        for( int i = 0; i < trials; i++)
        {
            int r = (int) (Math.random()*3);
            x = (x + cx[r]) / 2.0;
            y = (y + cy[r]) / 2.0;
            StdDraw.point(x, y);
        }
    
    }

}