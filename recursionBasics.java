import java.util.*;

public class recursionBasics {

	//Head Recursion
	static void HeadprintName(int count){
		if(count == 4){
			return;
		}
		count++;
		HeadprintName(count);
		System.out.println("Rahul");
		System.out.println(count);
	}

	//Tail Recursion
	static void TailprintName(int count){
		if(count == 4){
			return;
		}
		count++;
		System.out.println("Rahul");
		System.out.println(count);
		TailprintName(count);
	}

	//Parameterised Recursion
	static void printTheXNtimes(int x, int N){
		if(N==0) return;
		System.out.println(x);
		printTheXNtimes(x,N-1);
	}
	//Head recursion 1 to N
	static void printoneToN(int N){
		if(N==0) return;
		printoneToN(N-1);
		System.out.println(N);
	}
	//tail version
	static void pn(int x, int N){
		if(x==N) return;
		x++;
		System.out.println(x);
		pn(x,N);
	}

	//Tail recursion N to 1
	static void printNtone(int N){
		if(N==0) return;
		System.out.println(N);
		printNtone(N-1);
	}
	static void headrecNto1(int x, int N){
		if(x == N) return;
		x++;
		headrecNto1(x,N);
		System.out.println(x);
	}


	//sum of First N numbers
	static int sumOfN(int x, int N){
		if(N==0){
			return x;
		}
		x+=N;
		return sumOfN(x,N-1);
	}
	// other version
	static int sumOfN(int N){
		if(N==0) return 0;
		else{
			return N+sumOfN(N-1);
		}
	}


	//Factorial of number
	static int facto(int n){
		if(n==0 || n==1) return 1;
		else{
			return n*facto(n-1);
		}
	}


	//sum of array elements
	static int sumarr(int[] arr, int sum, int len){
		if(len ==0) return sum;
		sum+=arr[len-1];
		return sumarr(arr,sum,len-1);
	}
	//other version
	static int sumarre(int[] arr, int toadd){
		if(toadd == 0) return arr[0];
		return arr[toadd] + sumarre(arr,toadd-1);
	}

	//Reverse String
	static String revstring(String given, String haha,int toadd){
		if(toadd==0){
			return haha+=given.charAt(0);
		}
		haha+=given.charAt(toadd);
		return revstring(given,haha,toadd-1);
	}	


	//Prime checker
	static boolean primechecker(int a , int i){
		if(i == 1) return true;
		if(a%i == 0) return false;
		return primechecker(a,i-1);
	}


	//reverse the array
	static void reverse_Array(int[] arr, int l, int r){
		if(l>=r) return;
		int tem = arr[l];
		arr[l] = arr[r];
		arr[r] = tem;
		reverse_Array(arr,l+1,r-1);
	}


	//Check if array is sorted
	static boolean checkSorted(int[] arr, int tocheck){
		if(tocheck == 0){
			return true;
		}
		if(arr[tocheck]<arr[tocheck-1]) return false;
		return checkSorted(arr, tocheck-1);
	}

	//sum of digits in number
	static int sumofDigits(int n){
		if(n/10==0) return n;
		int tem = n;
		int sum = 0;
		while(tem!=0){
			int rem = tem%10;
			sum+=rem;
			tem/=10;
		}
		return sumofDigits(sum);
	}

	//fibonacci series
	static int fib(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-1) + fib(n-2);
	}

    public static void main(String[] args) {
        // Your code here

        //Recursion Concept
        int count = 0;
        System.out.println("Tail Recursion");
    	TailprintName(count);
    	System.out.println();
    	System.out.println("Head Recursion");
    	HeadprintName(count);
        
        //Parameterized recursion
        System.out.println();
        System.out.println("Parameterized Recursion");
        int x = 4, N = 3;
        printTheXNtimes(x,N);

        //Print 1 to N
        System.out.println();
        System.out.println("Print 1 to N");
        int n = 5;
        printoneToN(n);
        System.out.println("Tail version of 1 to N");
        pn(0,5);

        //Print N to 1
        System.out.println();
        System.out.println("Print N to 1");
        printNtone(5);
        System.out.println("Print N to 1 - Head recursion");
        headrecNto1(0,5);
        System.out.println();


        //Problems
        //1 1 1 1 1 1 1 1 1 1 1 1
        // sum of first N numbers
        System.out.println("Sum of First N numbers");
        int num = 5;System.out.println(num);
        int sum = 0;
        int res = sumOfN(sum,num);
        System.out.println(res);
        System.out.println();


        //2 2 2 2 2 2 2 2 2 2 2 2
        //Factorial of Given Number
        System.out.println("Factorial of given Number");
        int fact = facto(num);System.out.println(num);
        System.out.println(fact);
        System.out.println();


        // 3 3 3 3 3 3 3 3 3 3 3 3
        //sum of Array Elements
        System.out.println("Sum of Array Elements");
        int[] arr = {2,2,2,2,2};
        int s = 0;
        int sumofarr = sumarr (arr,s,arr.length);
        System.out.println(sumofarr);
        int resy = sumarre(arr,arr.length-1);
        System.out.println(resy);
        System.out.println();



        //4 4 4 4 4 4 4 4 4 4 4 4
        //reverse of String
        System.out.println("Reverse of String");
        String str = "venom";
        String srev = revstring(str,"",str.length()-1);
        System.out.println(srev);

        //5 5 5 5 5 5 5 5 5 5 5
        //check if String is palindrome of not
        System.out.println("Check if String palindrome or not");
        String g = "madam";
        if(revstring(g,"",g.length()-1).equals(g)){
        	System.out.println(true);
        }else{
        	System.out.println(false);
        }
        System.out.println();

        //6 6 6 6 6 6 6 6 6 6 6
        //check if number is prime or not
        System.out.println("Check if number is prime or not");
        int a1 = 72;System.out.println(a1);
        boolean check = primechecker(a1,(int)Math.sqrt(a1));
        System.out.println(check);
        System.out.println();

        // 7 7 7 7 7 7 7 7 7 7 7 
        //Reverse an array
        System.out.println("Reverse the array");
        int[] revarr = {1,2,3,4,5};
        System.out.println(Arrays.toString(revarr));
        reverse_Array(revarr,0,revarr.length-1);
        System.out.println(Arrays.toString(revarr));
        System.out.println();

        //8 8 8 8 8 8 8 8 8 8 8 
        //check if array is sorted
        System.out.println("Check if array is sorted");
        int[] sortcheckarr = {4,6,2,1,7};
        System.out.println(Arrays.toString(sortcheckarr));
        System.out.println(checkSorted(sortcheckarr,sortcheckarr.length-1));


        //9 9 9 9 9 9 9 9 9
        //sum of digits in given number (Super Good problem)
        System.out.println("Sum of digits in given number");
        int Num = 529;System.out.println(Num);
        int ans = sumofDigits(Num);
        System.out.println(ans);

        //10 10 10 10 10 10 10 10 10
        // fibonacci series
        System.out.println("Nth fibonacci number");
        int fibN = 3;System.out.println(fibN);
        int fibAns = fib(fibN);System.out.println(fibAns);
        System.out.println();
    }

}