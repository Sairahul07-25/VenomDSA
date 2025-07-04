import java.util.*;

public class Basics {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(n);

        int age = 17;
        if(age<18){
            System.out.println("Teen");
        }
        else{
            System.out.println("Adult");
        }

        int marks = 75;
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=70){
            System.out.println("Grade B");
        }
        else if(marks>=50){
            System.out.println("Grade C");
        }
        else if(marks>=35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break; 
        }

        int[] arr= new int[]{2,3,4,5,6};
        int f = arr[0];
        int l = arr[arr.length-1];
        System.out.println(f+l);

        int num = 15;
        int times = 4;

        for(int i = 0;i<4;i++){
            System.out.print(num+" ");
        }
        System.out.println();

        String s = "Rahul";
        System.out.println(s.charAt(s.length()-1));

    }

}