import java.util.*;
import java.io.*;


public class basicBufferedReader {

    public static void main(String[] args)  throws IOException{
        // Your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name: ");
        String name = br.readLine();
        System.out.println("Hello " + name);

        int age = Integer.parseInt(br.readLine());
        System.out.println(age);

        double n = Double.parseDouble(br.readLine());
        System.out.println(n);

        String[] srarr = br.readLine().split(" ");
        System.out.println(Arrays.toString(srarr));
        int[] arr = new int[srarr.length];
        for(int i = 0;i<srarr.length;i++){
        	arr[i] = Integer.parseInt(srarr[i]);
        }
        System.out.println(Arrays.toString(arr));



        int ch = br.read();
        System.out.println(ch + " " + (char)ch);
        br.readLine();

        char[] cbuf = new char[5];
        br.read(cbuf,0,5);
        System.out.println("next 5 characters "+ new String(cbuf)); 

    }

}