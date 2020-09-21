/*
If we list all the natural numbers below  that are multiples of  or , we get  and . The sum of these multiples is .

Find the sum of all the multiples of  or  below .
Sample Input 0

2
10
100

Sample Output 0

23
2318
Explanation 0

For N = 10 , if we list all the natural numbers below 10  that are multiples of 3 or 5,
we get 3,5,6, and 9 . The sum of these multiples is 23.

Similarly for N =100 , we get 2318 .
 */
import java.util.Scanner;

public class MultiplesOf_3And5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Test CAse : ");
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println("Enter Num : ");
            long n = in.nextInt();
            long three = (n-1) / 3;
            long five = (n-1) / 5;
            long fivteen = (n-1) / 15;
            long sum = 3*three*(three+1)/2 + 5*five*(five+1)/2 -
                    15*fivteen*(fivteen+1)/2;
            System.out.println(sum);
        }
    }
}
