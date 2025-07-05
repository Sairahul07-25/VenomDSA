import java.util.*;

public class mathBasic {

    public static void main(String[] args) {
        // Your code here

        /**
         * Count no.of digits:
         * Input:
         * n = 4
         * Output:
         * 2
         * 
         * Input:14
         * Ouptu:2
         * 
         * */

         System.out.println("Count no.of digits:");
         int n1 = 25521;
         int count = 0;
         System.out.println(n1);
         while(n1>0){
         	count++;
         	n1/=10;
         }
         System.out.println(count);
         System.out.println();

         //Count no.of odd digits in a number
         /**
          * 
          * Input: 15
          * Output: 2
          * Input: 25
          * Output:1
          * */
          System.out.println("Count no.of odd digits in a number");
          int oddct = 0;
          int n2 = 1234;
          System.out.println(n2);
          while(n2>0){
          	int rem = n2%10;
          	if(rem%2!=0) oddct++;
          	n2/=10; 
          }
          System.out.println(oddct);
          System.out.println();

          //Reverse a Number
          /**
           * 
           * Input:25
           * Output:52
           * */
           System.out.println("Reverse a Number");
           int n3 = 1244;System.out.println(n3);
           int revnum = 0;
           while(n3>0){
           	int rem = n3%10;
           	revnum = revnum*10+rem;
           	n3/=10;
           }
           System.out.println(revnum);
           System.out.println();

           //Palindrome number
           System.out.println("Palindrome Number");
           int n4 = 123;System.out.println(n4);
           int temp = n4;
           int paln = 0;
           while(n4>0){
           	int rem = n4%10;
           	paln = paln*10+rem;
           	n4/=10;
           }
           if(paln == temp) System.out.println(true);
           else System.out.println(false);
           System.out.println();

           //Return the largest digit in a number
           

    }

}