
public class deck {
    
    public static void main(String[] args) {
        String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A" };
        String[] suit = { "C", "D", "H", "S" };
        String[] deck = new String[52];

        for(int i = 0; i < 13; i++)
            for( int j = 0; j < 4; j++)
                deck[4*i + j] = rank[i] + suit[j];

        int N = Integer.parseInt(args[0]);
        //suffle non duplicate
        for( int i = 0; i < 52; i++ )
        {
            int r = i + (int ) (Math.random() * (52-i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }
        //deal
        for( int i = 0; i < N; i++)
        System.out.println(deck[i]);
        //shuffle duplicate
        // for( int i = 0; i < N ; i++)
        // {
        //     int r = (int) (Math.random()*52);
        //     System.out.println(deck[r]);
        // }

        // for (int i = 0; i < 52; i++)
        // System.out.print(deck[i] + " ");
        // System.out.println();

    }

}
