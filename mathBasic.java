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
           System.out.println("Return the largest digit in a number");
           int n5 = 7829;System.out.println(n5);
           int max = Integer.MIN_VALUE;
           while(n5>0){
           	int rem = n5%10;
           	if(rem>max){
           		max = rem;
           	}
           	n5/=10;
           }
           System.out.println(max);System.out.println();

           //Divisors of the number
           //MySolution 
           System.out.println("Divisors of a number(MySolution)");
           int n6 = 32;System.out.println(n6);
           ArrayList<Integer> ls = new ArrayList<>();
           ls.add(1);
           for(int i = 2;i<=32;i++){
           	if(n6%i==0) ls.add(i);
           }
           int[] div = new int[ls.size()];
           for(int i = 0;i<ls.size();i++){
           	div[i] = ls.get(i);
           }
           System.out.println(Arrays.toString(div));
           //Optimal
           System.out.println("Optimal Solution");
           int nz = 32;
           int[] arr = new int[nz];
           int ct = 0;
           int sqrtN = (int)Math.sqrt(nz);
           for(int i = 1;i<=sqrtN;i++){
           	if(nz%i==0){
           		arr[ct++] = i;

           		if(i!= nz/i){
           			arr[ct++] = nz/i;
           		}

           	}
           }
           int[] ans = Arrays.copyOf(arr,ct);
           Arrays.sort(ans);
           System.out.println(Arrays.toString(ans));
           System.out.println();

           //Factorial of number
           System.out.println("Factorial of Number");
           int n7 = 5;
           if(n7==0 || n7==1) System.out.println(1);
           else{
           	int n7ans = 1;
           	for(int i = 2;i<=n7;i++){
           		n7ans*=i;
           	}
           	System.out.println(n7ans);
           }
           System.out.println();

           //Armstrong Number
           /**
            * input= 153
            * output = true
            * 1cube + 5cube + 3cube = 153
            * 
            * */
           System.out.println("Armstrong Number ");
           int n8 = 153;int chk = n8;System.out.println(chk);
           int tpn8 = n8;
           int ln8 = 0;
           while(tpn8>0){
           	ln8++;
           	tpn8/=10;
           }
           int n8res = 0;
           while(n8>0){
           	int rem = n8%10;
           	n8res = n8res + (int)Math.pow(rem,ln8);
           	n8/=10;
           }	
           if(chk == n8res) System.out.println(true);
           else System.out.println(false);
           System.out.println();

           //Perfect Number(MySolution)
           System.out.println("Perfect Number");
           int n9 = 28;System.out.println(n9);
           int sum = 0;
           for(int i = 1;i<=(n9/2);i++){
           	if(n9%i==0) sum+=i;
           }
           if(sum == n9) System.out.println(true);
           else System.out.println(false);
           //Optimal sol
           System.out.println("Optimal solution");
           int n9z = 28;
           int n9sum = 0;
           for(int i = 1;i<=Math.sqrt(n9);i++){
           	if(n9z%i==0) {
           		n9sum+=i;
           		if(i!=(n9z/i) && (n9z/i)!=n9z){
	           		n9sum+=(n9z/i);
	           	}
           	}
           }
           System.out.println(n9sum);
           if(n9sum==n9z) System.out.println(true);
           else System.out.println(false);
           System.out.println();

           //Prime number check
           System.out.println("Prime number check");
           int n10 = 2;int par = 0;
           if(n10==2) System.out.println(true);
           for(int i = 2;i<=Math.sqrt(9);i++){
           	if(n10%i==0){
           		System.out.println(false);
           		par = 1;
           	} 
           }
           if(par == 0) System.out.println(true);
           System.out.println();

           //count no.of prime numbers
           System.out.println("Count No.of Prime Numbers");
           int n11 = 50;int n11ct =0;
           for(int i = 2;i<=n11;i++){
           	if(checkPrime(i)) n11ct++;
           }
           System.out.println(n11ct);
           System.out.println();

           //GCD of two numbers
           System.out.println("GCD of two numbers");
           int n_1 = 24, n_2 = 12;
           int minn = Math.min(n_1, n_2);
           int gcd = 0;
           for(int i = 2;i<=minn;i++){
           	if(n_1%i==0 && n_2%i==0){
           		if(i>=gcd){
           			gcd = i;
           		}
           	}
           }
           System.out.println(gcd);

           //optimal gcd solution
           System.out.println("Optimal Solution for GCD");
           System.out.println(optGCD(n_1,n_2));
           System.out.println();


           //LCM of two numbers
           System.out.println("LCM of two numbers");
           int s1 = 5;
           int s2 = 4;
           int maxx = Math.max(s1,s2);
           ArrayList<Integer> sl1 = new ArrayList<>();
           ArrayList<Integer> sl2 = new ArrayList<>();
           for(int i = 1;i<=maxx;i++){
           	sl1.add(s1*i);
           	sl2.add(s2*i);
           }
           int lcm = 0;
           for(int i = 0;i<maxx;i++){
           	if(sl2.contains(sl1.get(i))){
           		lcm = sl1.get(i);
           		break;
           	}
           }
           System.out.println(lcm);
           //optimal 
           //n1*n2 = lcm*gcd
           //lcm = n1*n2/gcd;

    }
    public static int fact(int n){
    	if(n==0|| n==1){
    		return 1;
    	}
    	else{
    		return n*fact(n-1);
    	}
    }
    public static boolean checkPrime(int n){
    	if(n==2) return true;
    	for(int i = 2;i<=Math.sqrt(n);i++){
    		if(n%i==0)return false;
    	}
    	return true;
    }
    public static int optGCD(int n1,int n2){
    	while(n1>0 && n2>0){
    		if(n1>n2){
    			n1 = n1%n2;
    		}
    		else{
    			n2 = n2%n1;
    		}
    	}
    	if(n1==0) return n2;
    	else return n1;
    }

}