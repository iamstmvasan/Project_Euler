import java.util.Scanner;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the N th prime number?
Sample Input 0

2
3
6
Sample Output 0

5
13
 */
public class NthPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter TestCase : ");
        int t = in.nextInt();
        int[] prime = new int[10000];
        prime[0]=2;
        int k=1;
        int i=3;
        int count =1;
        while(count<10000){
            boolean flag = true;
            int stopValue = (int)Math.sqrt(i);
            for(int j=2;j<=stopValue;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }

            }

            if(flag==true){
                prime[k]=i;
                count++;
                k++;

            }
            i=i+2;

        }
        for(int a0 = 0; a0 < t; a0++){
            System.out.println("Enter Num : ");
            int n = in.nextInt();
            System.out.println(prime[n-1]);
        }
    }
}
