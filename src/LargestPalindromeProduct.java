import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
A palindromic number reads the same both ways.
The smallest 6 digit palindrome made from the product of two 3-digit numbers is 101101 = 143 X 707 .

Find the largest palindrome made from the product of two 3-digit numbers which is less than N.
Sample Input 0

2
101110
800000
Sample Output 0

101101
793397
Explanation 0

101110 is product of 143 and 707 .
793397 is product of 869 and 913 .
 */
public class LargestPalindromeProduct {
    public static void main(String[] args) {
        // initially we create a list to store the palindrome number that are the product of two 3-digits numbers,
        List<Integer> list = new ArrayList<>();
        for(int i=100;i<1000;i++)
            for(int j=100;j<1000;j++){
                int mul = i * j;
                String first = String.valueOf(mul);
                StringBuffer dummy = new StringBuffer(first);
                dummy.reverse();
                String second = new String(dummy);
                if(first.equals(second))
                    list.add(mul);
            }
        //we sort the list to find correct answer
        Collections.sort(list);
        int length = list.size();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Testcase : ");
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            System.out.println("Enter Num : ");
            int n = in.nextInt();
            // reverse for loop for finding the largest palindrome less than N
            for(int i=length-1;i>=0;i--){
                // if n is less than the palindrome number in our list, that's the answer
                if(list.get(i) < n){
                    System.out.println(list.get(i));
                    break;
                }

            }
        }
    }
}
