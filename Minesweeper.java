
public class Minesweeper {

    public static void main(String[] args) {
        
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] bombs = new boolean[m+2][n+2];
        for (int i = 1; k != 0 ; i++)
        { bombs[i+(int) (Math.random()*(m+1-i))][i+(int) (Math.random()*(n+1-i))] = true; k--; }

        int[][] mineField = new int[m+2][n+2];
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                for (int row = i-1; row <= i+1; row++)
                    for (int col = j-1; col <= j+1; col++)
                        if (bombs[row][col])
                            mineField[i][j]++;
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++)
                 if (bombs[i][j]) System.out.print("*  ");
                else System.out.print(mineField[i][j] + "  ");
                System.out.println(); }
        
    }

}