import java.util.*;

public class recursionBasics {

	static void HeadprintName(int count){
		if(count == 4){
			return;
		}
		count++;
		HeadprintName(count);
		System.out.println("Rahul");
		System.out.println(count);
	}

	static void TailprintName(int count){
		if(count == 4){
			return;
		}
		count++;
		System.out.println("Rahul");
		System.out.println(count);
		TailprintName(count);
	}
    public static void main(String[] args) {
        // Your code here
        int count = 0;
        System.out.println("Tail Recursion");
    	TailprintName(count);
    	System.out.println();
    	System.out.println("Head Recursion");
    	HeadprintName(count);
        


    }

}