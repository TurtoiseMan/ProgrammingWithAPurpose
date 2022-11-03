
public class Birthday2 {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        
        int[] count = new int[n];
        boolean[] bdayCheck = new boolean[n];

        for ( int i = 0; i < trials; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                int r = (int) (Math.random()*(n-1));
                if(bdayCheck[r] == true)
                {
                    count[j]++;
                    break;
                }
                
                else
                bdayCheck[r] = true;
            }
        }

        for ( int i = 0; i < n; i++)
        {
            int sum = 0;
            sum+= count[i];
            if (sum/(double)trials < 0.50)
            {
                System.out.println((i+1) + "        "+ sum + "      "+ sum/(double) trials);
            }
            else
            break;
        }
        
    }

}