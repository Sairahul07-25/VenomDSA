import java.util.*;

public class StringBasics {

    public static void main(String[] args) {
        // Your code here


        //Basic Strings


    	//1 1 1 1 1 1 1 1 1
    	//Reversing a String
    	System.out.println("REverse a String");
    	String s = "Rahul";
    	String t = "";
    	for(int i = s.length()-1;i>=0;i--){
    		t+=s.charAt(i);
    	}
    	System.out.println(t);
    	System.out.println();


    	//2 2 2 2 2 2 2 2 2 2
    	//Palindrome Check
    	System.out.println("Palindrome Check");
    	String y = "rahul";System.out.println(y);
    	int z = y.length()-1;
    	boolean ispal = true;
    	for(int i = 0;i<y.length()/2;i++){
    		if(y.charAt(i) != y.charAt(z)){
    			ispal = false;
    			break;
    		}
    		z--;
    	}
    	System.out.println(ispal);
    	System.out.println();


    	// 3 3 3 3 3 3 3 3 3 3 
    	//Largest Odd number in the String
    	/**
    	 * String = 0234278
    	 * output = 23427
    	 * 
    	 * String = 0032789
    	 * output = 32789
    	 * 
    	 * */
    	 System.out.println("Largest Odd number in the String");
    	 String sn = "76778910000";
    	 System.out.println(sn);
    	 int onesplace = 0;
    	 int poslast = 0;
    	 for(int i = sn.length()-1;i>=0;i--){
    	 	if((sn.charAt(i)-'0')%2!=0){
    	 		onesplace = i;
    	 		break;
    	 	}
    	 }
    	 for(int i =0;i<onesplace;i++){
    	 	if(sn.charAt(i)!='0'){
    	 		poslast = i;
    	 		break;
    	 	}
    	 }
    	 String odd = "";
    	 for(int i = poslast;i<=onesplace;i++){
    	 	odd+=sn.charAt(i);
    	 }
    	 System.out.println(odd);
    	 System.out.println();


    	 // 4 4 4 4 4 4 4 4 4
    	 //Longest Common Prefix
    	 /**
    	  * 
    	  * strs = {"flowers" , "flow" , "fly", "flight"}
    	  * output = "fl"
    	  * 
    	  * strs = {"dog" , "cat" , "animal", "monkey" }
    	  * output =""
    	  * 
    	  * */
    	  System.out.println("Longest common prefix");
    	  String[] strs = {"lady" , "lazy"};
    	  System.out.println(Arrays.toString(strs));
    	  int minLen = Integer.MAX_VALUE;
    	  for(int i = 0;i<strs.length;i++){
    	  	if(strs[i].length() < minLen){
    	  		minLen = strs[i].length();
    	  	}
    	  }
    	  int laspos = -1;
    	  String res = "";
    	  for(int i = 0;i<minLen ;i++){
    	  	char c = strs[0].charAt(i);
    	  	boolean che = true;
    	  		for(int j = 1;j<strs.length;j++){
    	  			if(c == strs[j].charAt(i)){
    	  				continue;
    	  			}
    	  			else{
    	  				che = false;
    	  				break;
    	  			}
    	  		}
    	  		if(che == false){
    	  			laspos = i-1;
    	  			break;
    	  		}
    	  		else{
    	  			continue;
    	  		}
    	  }
    	  if(laspos == -1){
    	  	System.out.println(res);
    	  }	
    	  else{
    	  	for(int i = 0;i<=laspos;i++){
    	  		res+=strs[0].charAt(i);
    	  	}
    	  	System.out.println(res);
    	  }
    	  System.out.println();


    	  //5 5 5 5 5 5 5 5 5 5 5 
    	  //Isomorphic Strings
    	  /**
    	   * s1 = egg, s2 = add
    	   * output true
    	   * 
    	   * s1 = title, s2 = paper
    	   * output true
    	   * 
    	   * s1 = apple, s2 = bbnbm
    	   * output false
    	   * 
    	   * */
    	   System.out.println("Isomorphic Strings");
    	   String s1 = "add";System.out.println(s1);
    	   String s2 = "egg";System.out.println(s2);
    	   Map<Character,Character> ym = new HashMap<>();
    	   if(s1.length()!=s2.length()){
    	   	System.out.println(false);
    	   }
    	   else{
    	   		for(int i = 0;i<s1.length();i++){
    	   			ym.put(s1.charAt(i), s2.charAt(i));
    	   		}
    	   		System.out.println(ym);
    	   		//replacing the letters with their pair from the hashmap
    	   		String prox = "";
    	   		for(int i = 0;i<s1.length();i++){
    	   			prox+=ym.get(s1.charAt(i));
    	   		}
    	   		if(prox.equals(s2)){
    	   			System.out.println(true);
    	   		}else{
    	   			System.out.println(false);
    	   		}
    	   }
    	   System.out.println();


    	   // 6 6 6 6 6 6 6 6 6 6 6 6 
			//Rotate String
			/**
			 * 
			 * Input : s = "abcde" , goal = "cdeab"

				Output : true (After two shifts to the left)
			 * 
			 * Input : s = "abcde" , goal = "adeac"

				Output : false
			 * 
			 * */    	   
			 System.out.println("Rotate String");
			 String ss = "abcde";System.out.println(ss);
			 String goal = "adeac";System.out.println(goal);
			 if(ss.equals(goal)){
			 	System.out.println(true);
			 }
			 else{
			 		int times = ss.length();
				 boolean par = true;
				 while(times>0){
				 	String neo = "";
				 	for(int i = 1;i<ss.length();i++){
				 		neo+=ss.charAt(i);
				 	}
				 	neo+=ss.charAt(0);
				 	if(neo.equals(goal)){
				 		System.out.println(true);
				 		par = false;
				 		break;
				 	}
				 	ss = neo;
				 	times--;
				 }
				 if(par == true){
				 	System.out.println(false);
				 }
			 }
			 //optimal Solution
			 /*
					 if (s.length() != goal.length()) {
				            return false; 
				        }
				        // Try all possible rotations of s
				        for (int i = 0; i < s.length(); i++) {
				            String rotated = s.substring(i) + s.substring(0, i); 
				            if (rotated.equals(goal)) {
				                return true;  // Return true if a match is found
				            }
				        }
				        return false;  

			 */
			 //best solution
			 /*
				public boolean rotateString(String s, String goal) {
			        if (s.length() != goal.length()) {
			            return false;  
			        }
			        String doubledS = s + s;  // Concatenate s with itself
			        return doubledS.contains(goal);  // Check if goal is a substring of s + s
			    }
			 */
			



			// 7 7 7 7 7 7 7 7 7 7 7 7 7 
			 //Valid Anagram
			 /**
			  * 
			  * Input : s = "anagram" , t = "nagaram"

				Output : true
			  * 
			  * Input : s = "dog" , t = "cat"

				Output : false
			  * 
			  * */
			  System.out.println();
			  System.out.println("Valid Anagram");
			  String r1 = "dog",r2 = "god";
			  System.out.println(r1);
			  System.out.println(r2);
			  int[] abc = new int[26];
			  if(r1.length()!= r2.length()){
			  	System.out.println(false);
			  }
			  else{
			  	for(int i = 0;i<r1.length();i++){
			  		abc[r1.charAt(i)-'a']++;
			  	}
			  	System.out.println(Arrays.toString(abc));
			  	for(int i = 0;i<r2.length();i++){
			  		abc[r2.charAt(i)-'a']--;
			  	}
			  	System.out.println(Arrays.toString(abc));
			  	boolean par = true;
			  	for(int i = 0;i<26;i++){
			  		if(abc[i]<0 || abc[i]>0){
			  			System.out.println(false);
			  			par = false;
			  			break;
			  		}	
			  	}
			  	if(par == true){
			  		System.out.println(true);
			  	}
			  }
			  System.out.println();



			  //sort character by frequency
			  System.out.println("Sort Character by Frequency");
			  /**
			   * 
			   * 
			   * s = "tree"
			   * output =  ['e', 'r', 't' ]
			   * 
			   * s = "raaaaaj";
			   * ['a' , 'j', 'r' ]
			   * 
			   * s = "bbccddaaa";
			   * ['a', 'b', 'c', 'd']
			   * 
			   * if two characters have same frequency, then sort it in alphabetical order
			   * 
			   * */
			   	//My solution.
			   String sr = "tree";
			   Map<Character, Integer> um = new HashMap<>();
			   for(int i = 0;i<sr.length();i++){
			   	um.put(sr.charAt(i),um.getOrDefault(sr.charAt(i),0)+1);
			   }
			   System.out.println(um);

			   	ArrayList<Character> ls = new ArrayList<>();
			   	for(char c : um.keySet()){
			   		ls.add(c);
			   	}
			   	char[] sar = new char[ls.size()];
			   	for(int i = 0;i<ls.size();i++){
			   		sar[i] = ls.get(i);
			   	}
			   	// sorting characters based on frequency and the order of alphabets.
			   	for(int i = 0;i<ls.size();i++){
			   		for(int j = 0;j<ls.size();j++){
			   			if(um.get(sar[i])>um.get(sar[j])){
			   				char tm = sar[i];
			   				sar[i] = sar[j];
			   				sar[j] = tm;
			   			}
			   			if(um.get(sar[i]) == um.get(sar[j])){
			   				int n = sar[i]-'0';
			   				int u = sar[j] -'0';
			   				if(n<u && i>j){
			   					char to = sar[i];
			   					sar[i] = sar[j];
			   					sar[j] = to;
			   				}
			   				else if(n<u && i<j){
			   					continue;
			   				}
			   				else if(n>u && i>j){
			   					continue;
			   				}
			   				else if(n>u && i<j)	{
			   						char tumm = sar[i];
			   						sar[i] = sar[j];
			   						sar[j] = tumm;
			   				}
			   			}
			   		}
			   	}
			   	System.out.println(Arrays.toString(sar));
			   	System.out.println();
			   	//optimal
			   	System.out.println("Optimal solution for it");
			   	ls.sort((a,b)->{
			   			if(!um.get(a).equals(um.get(b))){
			   				return um.get(b)-um.get(a);
			   			}
			   			else{
			   				return a-b;
			   			}
			   	});
			   	System.out.println(ls);


    }

}