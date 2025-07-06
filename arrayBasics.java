import java.util.*;

public class arrayBasics {

    public static void main(String[] args) {
        // Your code here


        //Sum of Array Elements
        System.out.println("Sum of Array Elements");
        int[] arr = {1,3,4,5,6};
        System.out.println(Arrays.toString(arr));
    	int res = 0;
    	for(int i= 0;i<arr.length;i++){
    		res+=arr[i];
    	}
    	System.out.println(res);
    	System.out.println();


    	//count of odd numbers in array
    	System.out.println("count of odd numbers in array");
    	int[] arr1 = {1,2,1,1,5,1};int count = 0;System.out.println(Arrays.toString(arr1));
    	for(int i = 0;i<arr1.length;i++){
    		if(arr1[i]%2!=0) count++;
    	}
    	System.out.println(count);
    	System.out.println();

    	//Check if Array is sorted
    	System.out.println("Check if Array is sorted");
    	int[] arr2 = {1,2,3,45};System.out.println(Arrays.toString(arr2));
    	boolean checker = true;
    	for(int i = 0;i<arr2.length-1;i++){
    		if(arr2[i]> arr2[i+1]){
    			checker = false;
    		}
    	}
    	System.out.println(checker);System.out.println();

    	//reverse an array
    	System.out.println("Reverse an Array");
    	int[] arr4 = {1,2,3,4,5};System.out.println(Arrays.toString(arr4));
    	int j = arr4.length-1;
    	for(int i = 0;i<arr4.length/2;i++){
    		int tem = arr4[i];
    		arr4[i] = arr4[j];
    		arr4[j] = tem;
    		j--;
    	}
    	System.out.println(Arrays.toString(arr4));
    }

}