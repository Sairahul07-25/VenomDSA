import java.util.*;

public class sortingBasics {

    public static void main(String[] args) {
        // Your code here
        

    	//Selection sort
    	System.out.println("Selection sort");
    	int[] arr = {8,3,2,9,12};
    	System.out.println(Arrays.toString(arr));
    	
    	for(int i = 0;i<arr.length;i++){

    		int min = arr[i];
    	 	int mindx = i;
    		for(int j = i+1;j<arr.length;j++){
    			if(arr[j]<min){
    				min=arr[j];
    				mindx = j;
    			}
    		}

    		int t = arr[mindx];
    		arr[mindx] = arr[i];
    		arr[i] = t;
    	}
    	System.out.println(Arrays.toString(arr));
    	System.out.println();



    	//Bubble sort
    	System.out.println("Bubble sort");
    	int[] arr1 = {4,6,2,8,9};
    	System.out.println(Arrays.toString(arr1));
    	for(int i = 0;i<arr1.length;i++){
    		for(int j  =0;j<arr1.length-1;j++){
    			if(arr1[j]>arr1[j+1]){
    				int t = arr1[j];
    				arr1[j] = arr1[j+1];
    				arr1[j+1] = t;
    			}
    		}
    	}
    	System.out.println(Arrays.toString(arr1));
    	System.out.println();


    	//Insertion sort
        int[] arr2 = {7,4,1,5,3};
        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(arr2));
        for(int i = 0;i<arr2.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr2[j]< arr2[j-1]){
                    int t = arr2[j];
                    arr2[j] = arr2[j-1];
                    arr2[j-1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));


        
    	
    	
    }

}