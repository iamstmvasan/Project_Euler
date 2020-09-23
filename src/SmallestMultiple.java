import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to N?
Sample Input 0

2
3
10
Sample Output 0

6
2520
Explanation 0

You can check 6 is divisible by each of{1,2,3} , giving quotient of {6,3,2} respectively.
You can check 2520 is divisible by each of{1,2,3,4,5,6,7,8,9,10}
 */
public class SmallestMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Test Case : ");
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println("Enter Num : ");
            int n = in.nextInt();
            // initially we create a list with 1 to N,
            List<Integer> numList = new ArrayList<>();
            for(int j=1;j<=n;j++)
                numList.add(j);
            //we initialize result with N value,
            int result = n;
            while(true){
                //we check whether all number(1 to N) should divide the result...
                boolean flag = true;
                for(Integer num : numList)
                    // if any of the number should not divide the result we break and change result value
                    if(result % num != 0 ){
                        flag = false;
                        break;
                    }
                // if all number should divide result, the flag will be true. That means we found smallest multiple.
                if(flag){
                    System.out.println(result);
                    break;
                }
                // other wise ,increment result by n
                else
                    result += n;
            }

        }
    }
}
