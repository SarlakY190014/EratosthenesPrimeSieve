import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve {
    private int oberGrenze;

    // Create a boolean array "prime[0..n]" and initialize
    private boolean prime[];

    public EratosthenesPrimeSieve(int oberGrenze) {
        this.oberGrenze = oberGrenze;
        prime = new boolean[oberGrenze + 1];

        // all entries it as true. A value in prime[i] will
        for (int i = 0; i <= oberGrenze; i++)
            prime[i] = true;
    }//Konstruktor

    public static void main(String[] args) {
        System.out.println("Grenze eingeben:");
        Scanner scanner = new Scanner(System.in);
        int grenze = scanner.nextInt();
        System.out.println("Folgenden sind Primzahlen kleiner als oder gleich:\n");
        EratosthenesPrimeSieve a = new EratosthenesPrimeSieve(grenze);
        a.eratosthenesPrimeSieve();
        a.printPrimes();
    }

    public void eratosthenesPrimeSieve() {
        for (int p = 2; p * p <= oberGrenze; p++) {
            // If prime[p] is not changed, then it is a prime
            if (isPrime(p))//prime[p] == true
            {
                for (int i = p * p; i <= oberGrenze; i += p)
                    prime[i] = false;
            }
            // Update all multiples of p
        }
    }

    @Override
    public boolean isPrime(int p) {
        if (prime[p] == true) {
            return true;
        }
        return false;
    }

    @Override
    public void printPrimes() {
        for (int i = 2; i <= oberGrenze; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
}//Ende
