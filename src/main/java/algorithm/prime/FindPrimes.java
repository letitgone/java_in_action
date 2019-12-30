package algorithm.prime;

/**
 * @Author ZhangGJ
 * @Date 2019/12/31 07:27
 */
public class FindPrimes {
    public static void main(String[] args) {
        int max = 100;
        // Get the max value from the command line,
        // if the argument has been provided:
        if (args.length != 0)
            max = Integer.parseInt(args[0]);
        for (int i = 1; i < max; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}
