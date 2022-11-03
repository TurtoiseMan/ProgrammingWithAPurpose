
public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = args.length;
        int[] freq = new int[n];
        int m = Integer.parseInt(args[0]);
        for (int i = 1; i < n; i++)
            {   if( i == 1)
                freq[i] = Integer.parseInt(args[i]);
                else 
                freq[i] = freq[i-1] + Integer.parseInt(args[i]);
            }
            
        for ( int i = 0; i < m; i++)
        {
            int r = 1 + (int) (Math.random()*(n-1));
            System.out.print(r+ " ");
        }
        
        }

}
