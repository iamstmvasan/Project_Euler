import java.util.Scanner;

/*
Find the greatest product of K consecutive digits in the N digit number.
Sample Input 0

2
10 5
3675356291
10 5
2709360626
Sample Output 0

3150
0

Explanation

-> For 3675356291 and selecting K = 5 consequetive digits, we have 36753, 67535, 75356, 53562, 35629, and 56291
   where 6 x 7 x 5 x 3 x 5 gives maximum product as 3150
-> For 2709360626, 0 lies in all selection of 5 consequetive digits hence maximum product remains 0
*/
public class LargestProductSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Testcase : ");
        int T = in.nextInt();
        for(int start = 0; start < T; start++){
            System.out.println("Enter N and K : ");
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println("Enter Number : ");
            String num = in.next();
            int maxProduct = 0;
            for(int i=0;i<=n-k;i++){
                int product = 1;
                for(int j=0;j<k;j++){
                    char ch = num.charAt(i+j);
                    int dummy = Integer.valueOf(String.valueOf(ch));
                    product *= dummy;
                }
                if(product > maxProduct)
                    maxProduct = product;
            }
            System.out.println(maxProduct);
        }
    }
}
