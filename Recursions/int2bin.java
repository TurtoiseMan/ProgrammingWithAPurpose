public class int2bin{
    public static String convert(int N)
    {
        if (N == 1) return "1";
        return convert(N/2) + (N % 2);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String binary = convert(N);
        StdOut.println(binary);
    }

}