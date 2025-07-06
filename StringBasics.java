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
    	  








    }

}