
public class ThueMorse {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] pattern = new int[n];
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) pattern[i] = 1 - pattern[i-1];
            else pattern[i] = pattern[i/2];
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (pattern[i] == pattern[j])
                System.out.print("+  ");
                else
                System.out.print("-  ");

            }

            System.out.println();
        }
    }

}
