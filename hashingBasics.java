import java.util.*;

public class hashbasic {

    public static void main(String[] args) {
        // Your code here
        
        //Hashing Basics

    	//1 1 1 1 1 1 1 1 1 1 1 1 1
        //Highest Occurring Element in array
    	/**
    	 * 
    	 * {1,2,3,3,} =>3
    	 * {4,4,5,5,3} => 4
    	 * {7,8,9}=> 7
    	 * if multiple elemnts with min freq then pick the least element.
    	 * 
    	 * */
    	 //MySolution
    	 //putting into hashmap
    	 int[] nums = {4,4,5,5,7};
    	 System.out.println("Highest Occurring Element in array");
    	 Map<Integer, Integer> mp = new HashMap<>();
    	 for(int n:nums){
    	 	mp.put(n,mp.getOrDefault(n,0)+1);
    	 }
    	 System.out.println(mp);

    	 //maxFrequency??
    	 int maxFreq = Integer.MIN_VALUE;
    	 for(int n:nums){
    	 	if(mp.get(n)>maxFreq) maxFreq = mp.get(n);
    	 }
    	 //same maxFreq elements
    	 ArrayList<Integer> ls = new ArrayList<>();
    	 for(int n:nums){
    	 	if(mp.get(n) == maxFreq) ls.add(n);
    	 }
    	 Collections.sort(ls);
    	 System.out.println(ls.get(0));
    	 //Optimal
    	 System.out.println("Optimal solution");
    	 int mfreq = 0;
    	 int mele = 0;
    	 for(Map.Entry<Integer,Integer> it:mp.entrySet()){
    	 	int el = it.getKey();
    	 	int freq = it.getValue();
    	 	if(freq>mfreq){
    	 		mele = el;
    	 		mfreq = freq;
    	 	}
    	 	else if(freq == mfreq){
    	 		mele = Math.min(mele, el);
    	 	}
    	 }
    	 System.out.println(mele);
    	 System.out.println();


    	 //2 2 2 2 2 2 2 2 2 2 2 2 
    	 //Second Highest Occuring Element
    	 /**
    	  * {3,3,3,2,2,2,5,5,6,6,7}
    	  * output = 5
    	  * 
    	  * */
    	  //MySolution
    	  System.out.println("Second Highest Occuring Element");
    	  int[] arr = {3,3,3,2,2,2,5,5,6,6,7};
    	  System.out.println(Arrays.toString(arr));
    	  Map<Integer,Integer> mpp = new HashMap<>();
    	  for(int n:arr){
    	  	mpp.put(n,mpp.getOrDefault(n,0)+1);
    	  }
    	  System.out.println(mpp);
    	  int maxf = 0;
    	  int secMax = 0;
    	  int secMaxEle = 0;
    	  for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
    	  	int e = it.getKey();
    	  	int f = it.getValue();
    	  	if(f>maxf){
    	  		maxf = f;
    	  	}
    	  	if(f<maxf && f>secMax){
	      		secMax = f;
	   	  	secMaxEle = e;
	   	  }
	   	else if(f == secMax){
	   		secMaxEle = Math.min(e,secMaxEle);
    	  	}

    	  }
    	  System.out.println(secMaxEle);
    	  System.out.println();



    	  //3 3 3 3 3 3 3 3 3 3 3 3 3
    	  //Sum of Highest and lowest frequency
    	  System.out.println("Sum of Highest and lowest frequency");
    	  int[] ns = {10, 9, 7, 7, 8, 8, 8};System.out.println(Arrays.toString(ns));
    	  Map<Integer,Integer> m = new HashMap<>();
    	  for(int n:ns){
    	  	m.put(n,m.getOrDefault(n,0)+1);
    	  }
    	  System.out.println(m);
    	  int lf = Integer.MAX_VALUE;
    	  int mf = Integer.MIN_VALUE;
    	  for(Map.Entry<Integer, Integer> it: m.entrySet()){
    	  	int f = it.getValue();
    	  	if(f>mf) mf = f;
    	  	if(f<lf) lf = f;
    	  }	
    	  System.out.println(lf+mf);
    	  System.out.println();

    }

}
