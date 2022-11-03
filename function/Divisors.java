
public class Divisors {
    public static int gcd(int a, int b)
    {
        int x = Math.abs(a);
        int y = Math.abs(b);
        while (y != 0)
        {
            int temp;
            temp = x;
            x = y;
            y = temp % x;
        }
        return x;
    }
    
    public static int lcm(int a, int b)
    {   if ( a == 0 && b == 0)
        return 0;
        else
        return (Math.abs(a) / gcd(a, b)) * Math.abs(b);
    }

    public static boolean areRelativelyPrime(int a, int b)
    {
        if (gcd(a, b) == 1)
        return true;
        else 
        return false;
    }

    public static int totient(int n)
    {   int count = 0;
        for ( int i = 1; i <= n; i++)
        {
            if (areRelativelyPrime(i, n))
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        StdOut.println("gcd("+ a + "," + b +") = " + gcd(a, b));
        StdOut.println("lcm("+ a + "," + b +") = " + lcm(a, b));
        StdOut.println("areRelativelyPrime("+ a + "," + b +") = " + areRelativelyPrime(a, b));
        StdOut.println("totient("+ a + ") = " + totient(a));
        StdOut.println("totient("+ b +") = " + totient(b));
    }

}