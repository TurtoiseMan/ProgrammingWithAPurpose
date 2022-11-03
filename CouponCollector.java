
public class CouponCollector {
    public static void main(String[] args) {
        
        int M = Integer.parseInt(args[0]);
        boolean[] found = new boolean[M];
        int cards = 0;
        int distinct = 0;

        while( distinct < M )
        {
            int r = (int) (Math.random() * M);
            cards++;
            if(!found[r])
            {
                distinct++;
                found[r] = true;
            }
        }
        // cards = M log M + 0.57721M
        System.out.println(cards);
    }

}