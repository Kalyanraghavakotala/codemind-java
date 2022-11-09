import java.util.*;
 
class GFG {
    static void numbersWith3Divisors(int N)
    {
        //System.out.println("Numbers with 3 divisors : ");
    int c=0;
        for (int i = 2; i * i <= N; i++) {
 
            
            if (isPrime(i)) {
                if (i * i <= N) {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
 
    // Check if a number is prime or not
    public static boolean isPrime(int N)
    {
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
 
        // Function call
        numbersWith3Divisors(N);
    }
}