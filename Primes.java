public class Primes {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        if (n < 2) {
            System.out.println("n must >= 2");
            return;
        }

        boolean[] isPrime = new boolean[n + 1];
        int p = 2;

        while (p <= n) {
            isPrime[p] = true;
            p++;
        }

        p = 2;
        while (p * p <= n) {
            if (isPrime[p]) {
                int multiple = p * p;
                while (multiple <= n) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (count * 100 / n) + "% are primes)");
    }
}
