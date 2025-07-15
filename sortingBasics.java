import java.util.*;

public class sortingBasics {

    public static void main(String[] args) {
        // Your code here
        

    	//Selection sort
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


    }

}