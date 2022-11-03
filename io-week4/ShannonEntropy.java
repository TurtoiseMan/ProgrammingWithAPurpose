
public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] arr = new int[m+1];
        int count = 0;
        double pi = 0.000;
        double piLog = 0.000;
        
        while(!StdIn.isEmpty())
        {   int r = StdIn.readInt();
            arr[r]++;
            count++;
        }
        //StdOut.println(count);
        for (int i = 1; i <= m; i++)
        {   if(arr[i] != 0)
            {pi = arr[i] /(double) count;
             piLog += -pi * (Math.log(pi)) / (Math.log(2));}
        }
       StdOut.println(piLog);
    }

}