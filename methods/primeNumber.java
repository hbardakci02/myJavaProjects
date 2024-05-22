public class primeNumber {
    public static void main(String[] args) {
        int n = 100;
        int counterArray = 0;
        int counterArray2 = 0;
        int prime[] = new int[n];
        int notPrime[] = new int[n];

        for (int i = 1; i < n; i++) {
            Boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                prime[counterArray] = i;
                counterArray++;
            } else if (isPrime == false) {
                notPrime[counterArray2] = i;
                counterArray2++;
            }

        }
        System.out.println("Prime: ");
        for (int i = 0; i < counterArray; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("Not Prime: ");
        for (int i = 0; i < counterArray; i++) {
            System.out.println(notPrime[i]);
        }

    }

}
