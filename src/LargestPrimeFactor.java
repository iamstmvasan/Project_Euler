import java.util.Scanner;

/*
The prime factors of 1395 are 5, 7, 13 and  29.

What is the largest prime factor of a given number N?
Sample Input 0

2
10
17
Sample Output 0

5
17
Explanation 0

Prime factors of 10 are (2,5), largest is 5.
Prime factor of  17 is  17 itself, hence largest is 17.
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Testcase : ");
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println("Enter num : ");
            long n = in.nextLong();
            /*
            long largestPrime = 0;
            for(int j=2;j<=n;j++)
                if(n % j == 0){
                    boolean isPrime = true;

                    int val = (int)Math.sqrt(j);
                    for(int k=2;k<=val;k++)
                        if(j % k == 0){
                            isPrime = false;
                            break;
                        }
                    if(isPrime && largestPrime < j)
                        largestPrime = j;
                }
            System.out.println(largestPrime);*/

            int div = 2;
            while(div <= (int)Math.sqrt(n)){
                if(n%div==0){
                    n /= div;
                }
                else{
                    div++;
                }
            }
            System.out.println(n);
        }
    }
}
