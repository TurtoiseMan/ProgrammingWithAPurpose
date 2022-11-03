
public class Birthday {
    public static void main(String[] args) {
      int d = Integer.parseInt(args[0]);
      int trials = Integer.parseInt(args[1]);
      int pep = 0;
      int[]pCount = new int[300];
    
      for (int t = 0; t < trials; t++)
      {
          boolean[] days = new boolean[d];
          pep = 0;
          while (true)
          {
              pep++;
              int r = (int) (d * Math.random());
              if (days[r])
              {
                pCount[pep]++;
                break;
              }
              days[r] = true;
          }
      }
      int sum = 0;
      int i;
      for (i = 1; sum/ (double) trials < 0.50; i++, sum += pCount[i])
      {
        System.out.println(i+ "    "+ pCount[i]+ "       "+ sum/ (double) trials);
      }
      System.out.println(i+ "    "+ pCount[i]+ "       "+ sum/ (double) trials);
        
    }
    
}
