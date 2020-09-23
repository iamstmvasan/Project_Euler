import java.util.Scanner;

/*
The sum of the squares of the first ten natural numbers is,
        1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
        (1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
        (1 + 2 + ... + 10)^2 = 55^2 = 3025
Find the difference between the sum of the squares of the first N numbers and the square of the sum.
 Sample Input 0

2
3
10
Sample Output 0

22
2640

Explanation

For N = 3, (1+2+3)^2 - (1^2 + 2^2 + 3^2) => 22

For N = 10, (1+2+...+10)^2 - (1^2 + 2^2 +...+ 10^2) => 2640
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Testcase : ");
        int T = in.nextInt();
        for(int j = 0; j < T; j++){
            System.out.println("Enter Num : ");
            long N = in.nextLong();

            long sumOfSquare = 0;
            long squareOfSum = 0;

            for(long i=1;i<=N;i++){
                sumOfSquare += i * i;
                squareOfSum += i;
            }

            squareOfSum = squareOfSum * squareOfSum;
            System.out.println(squareOfSum - sumOfSquare);

        }
    }
}
