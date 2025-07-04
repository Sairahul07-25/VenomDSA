import java.util.*;

public class patterns {

    public static void main(String[] args) {
        // Your code here


    	/**
    	 * Pattern:1
    	 * n=3
    	 * ***
    	 * ***
    	 * ***
    	 *
    	 * */
        System.out.println("Pattern 1");
        int n1 = 5;
        for(int i = 0;i<n1;i++){
        	for(int j = 0;j<n1;j++){
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println();


        /**
         * Pattern:2
         * n=4
         * *
         * **
         * ***
         * ****
         * 
         * */

         System.out.println("Pattern 2");
         int n2 = 5;
         for(int i = 0;i<n2;i++){
         	for(int j =0;j<=i;j++){
         		System.out.print("*");
         	}
         	System.out.println();
         }
         System.out.println();

         /**
          * Pattern:3
          * n=4
          * 1
          * 12
          * 123
          * 1234
          * 
          * */

          System.out.println("Pattern 3");
          int n3 = 5;
          for(int i = 1;i<=n3;i++){
          	for(int j = 1;j<=i;j++){
          		System.out.print(j);
          	}
          	System.out.println();
          }
          System.out.println();

          /**
           * Pattern:4
           * n=4
           * 1
           * 22
           * 333
           * 4444
           * */
           System.out.println("Pattern 4");
           int n4 = 5;
           for(int i= 1;i<=n4;i++){
           		for(int j = 1;j<=i;j++){
           			System.out.print(i);
           		}
           		System.out.println();
           }
           System.out.println();

           /**
            * Pattern:5
            * n=4
            * ****
            * ***
            * **
            * *
            * 
            * */
            System.out.println("Pattern 5");
            int n5 = 5;
            for(int i = 0;i<n5;i++){
            	for(int j = 0;j<(n5-i);j++){
            		System.out.print("*");
            	}
            	System.out.println();
            }
            System.out.println();
			

			/**
			 * Pattern:6
			 * n=4
			 * 1234
			 * 123
			 * 12
			 * 1
			 * 
			 * */
			 System.out.println("Pattern 6");  
			 int n6 = 5;
			 for(int i = 1;i<=n6;i++){
			 	int m = 1;
			 	for(int j = 0;j<=(n6-i);j++){
			 		System.out.print(m);
			 		m++;
			 	}
			 	System.out.println();
			 }      
			 System.out.println();

			 /**
			  * Pattern:7
			  * n=4
			  *    *   
			  *   ***  
			  *  ***** 
			  * *******
			  * 
			  * */
			  System.out.println("Pattern 7");
			  int n7 = 4;
			  for(int i = 0;i<n7;i++){
			  	for(int j = 0;j<(n7-i-1);j++){
			  		System.out.print(" ");
			  	}
			  	for(int k = 0;k<(2*i+1);k++){
			  		System.out.print("*");
			  	}
			  	System.out.println();
			  }
			  System.out.println();

			  /**
			   * Pattern:8
			   * n=4
			   * *******
			   *  *****
			   *   ***
			   *    *
			   * */
			   System.out.println("Pattern 8");
			   int n8 = 4;
			   for(int i = 0;i<n8;i++){
			   		for(int j = 0;j<i;j++){
			   			System.out.print(" ");
			   		}
			   		for(int k = 0;k<(2*(n8-i)-1);k++){
			   			System.out.print("*");
			   		}
			   		System.out.println();
			   }
			   System.out.println();

			   /**
			    * Pattern:9
			    * n=4
			    *    *
			    *   ***
			    *  *****
			    * *******
			    * *******
			    *  *****
			    *   ***
			    *    *
			    * */
			    System.out.println("Pattern 9");
			    int n9= 4;
			    for(int i = 0;i<n9;i++){
			    	for(int j = 0;j<(n9-i-1);j++){
			    		System.out.print(" ");
			    	}
			    	for(int k= 0;k<(2*i+1);k++){
			    		System.out.print("*");
			    	}
			    	System.out.println();
			    }
			    for(int i = 0;i<n9;i++){
			    	for(int j = 0;j<i;j++){
			    		System.out.print(" ");
			    	}
			    	for(int k = 0;k<(2*(n9-i)-1);k++){
			    		System.out.print("*");
			    	}
			    	System.out.println();
			    }
			    System.out.println();

			    /**
			     * Pattern:10
			     * n=4
			     * 
			     * *
			     * **
			     * ***
			     * ****
			     * ***
			     * **
			     * *
			     * 
			     * */
			     System.out.println("Pattern 10");
			     int n10 = 4;
			     for(int i = 0;i<n10;i++){
			     	for(int j=0;j<=i;j++){
			     		System.out.print("*");
			     	}
			     	System.out.println();
			     }
			     for(int i = 0;i<n10-1;i++){
			     	for(int j = 0;j<(n10-1-i);j++){
			     		System.out.print("*");
			     	}
			     	System.out.println();
			     }
			     System.out.println();


			     /**
			      * Pattern:11
			      * n=4
			      * 
			      * 1
			      * 01
			      * 101
			      * 0101
			      * 
			      * */
			      System.out.println("Pattern 11");
			      int n11 = 4;
			      int p;
			      for(int i = 0;i<n11;i++){
			      	if(i%2==0) p=1;else p=0;
			      	for(int j = 0;j<=i;j++){
			      		System.out.print(p);
			      		p = 1-p;
			      	}
			      	System.out.println();
			      }
			      System.out.println();

			      /**
			       * Pattern:12
			       * n=4
			       * 
			       * 1      1
			       * 12    21
			       * 123  321
			       * 12344321
			       * 
			       * */
			       System.out.println("Pattern 12");
			       int n12 = 4;
			       for(int i = 1;i<=n12;i++){
			       	for(int j =1;j<=i;j++ ){
			       		System.out.print(j);
			       	}
			       	for(int k = 1;k<=(2*(n12-i));k++){
			       		System.out.print(" ");
			       	}
			       	for(int l =i;l>=1;l--){
			       		System.out.print(l);
			       	}
			       	System.out.println();
			       }
			       System.out.println();

			       /**
			        * Pattern:13
			        * n=4
			        * 1
			        * 2 3
			        * 4 5 6
			        * 7 8 9 10
			        * 
			        * */
			        System.out.println("Pattern 13");
			        int n13 = 4;int q = 1;
			        for(int i = 0;i<n13;i++){
			        	for(int j = 0;j<=i;j++){
			        		System.out.print(q+" ");
			        		q+=1;
			        	}
			        	System.out.println();
			        }
			        System.out.println();

			        /**
			         * 
			         * Pattern 14
			         * n=4
			         * A
			         * AB
			         * ABC
			         * ABCD
			         * */
			         System.out.println("Pattern 14");
			         int n14 = 4;
			         for(int i = 0;i<n14;i++){
			         	char ch = 'A';
			         	for(int j = 0;j<=i;j++){
			         		System.out.print(ch);
			         		ch+=1;
			         	}
			         	System.out.println();
			         }
			         System.out.println();

			         /**
			          * Pattern 15
			          * n=4
			          * ABCD
			          * ABC
			          * AB
			          * A
			          * */
			          System.out.println("Pattern 15");
			          int n15 = 4;
			          for(int i = 0;i<n15;i++){
			          	char cha = 'A';
			          	for(int j = 0;j<(n15-i);j++){
			          		System.out.print(cha);
			          		cha+=1;
			          	}
			          	System.out.println();
			          }
			          System.out.println();

			          /**
			           * Pattern 16
			           * n=4
			           * A
			           * BB
			           * CCC
			           * DDDD
			           * */
			           System.out.println("Pattern 16");
			           int n16 = 4;char chy = 'A';
			           for(int i = 0;i<n16;i++){
			           	for(int j = 0;j<=i;j++){
			           		System.out.print(chy);
			           	}
			           	chy+=1;
			           	System.out.println();
			           }
			           System.out.println();
			           
			           /**
			            * Pattern 17
			            * n=4
			            * 
			            *    A
			            *   ABA
			            *  ABCBA
			            * ABCDCBA
			            * */
			            System.out.println("Pattern 17");
			            int n17 =4;
			            for(int i = 0;i<n17;i++){
			            	for(int j = 0;j<(n17-i-1);j++){
			            		System.out.print(" ");
			            	}
			            	char chu = 'A';
			            	for(int k = 0;k<(2*i+1);k++){
			            		if(k<=(2*i+1)/2){
			            			System.out.print(chu);
			            			if(k<(2*i+1)/2){
			            				chu++;
			            			}
			            		}
			            		else{
			            			--chu;
			            			System.out.print(chu);
			            		}
			            	}
			            	System.out.println();
			            }
			            System.out.println();

			            /**
			             * Pattern 18
			             * n=4
			             * 
			             * D
			             * CD
			             * BCD
			             * ABCD
			             * */

			             System.out.println("Pattern 18");
			             int n18 = 4;
			             char chi = 'A';
			             for(int i = 1;i<n18;i++){
			             	chi+=1;
			             }
			             for(int i = 0;i<n18;i++){
			             	char start = (char)((int)chi-i);
			             	for(int j = 0;j<=i;j++){
			             		System.out.print(start);
			             		start++;
			             	}
			             	System.out.println();
			             }
			             System.out.println();

			             /**
			              * Pattern 19
			              * n=4
			              * ********
			              * ***  ***
			              * **    **
			              * *      *
			              * *      *
			              * **    **
			              * ***  ***
			              * ********
			              * 
			              * */
			              
			              System.out.println("Pattern 19");
			              int n19 = 4;
			              for(int i = 0;i<n19;i++){
			              	for(int j = 0;j<(n19-i);j++){
			              		System.out.print("*");
			              	}
			              	for(int k = 0;k<(2*i);k++){
			              		System.out.print(" ");
			              	}
			              	for(int l = 0;l<(n19-i);l++){
			              		System.out.print("*");
			              	}
			              	System.out.println();
			              }
			              for(int i = 0;i<n19;i++){
			              	for(int j = 0;j<=i;j++){
			              		System.out.print("*");	
			              	}
			              	for(int k = 0;k<(2*(n19-i-1));k++){
			              		System.out.print(" ");
			              	}
			              	for(int l = 0;l<=i;l++){
			              		System.out.print("*");
			              	}
			              	System.out.println();
			              }
			              System.out.println();

			              /**
			               * Pattern 20;
			               * n=4;
			               * *      *
			               * **    **
			               * ***  ***
			               * ********
			               * ********
			               * ***  ***
			               * **    **
			               * *      *
			               * 
			               * */
			               System.out.println("Pattern 20");
			               int n20 = 4;
			               for(int i =0;i<n20;i++){
			               	for(int j = 0;j<=i;j++){
			               		System.out.print("*");
			               	}
			               	for(int k = 0;k<(2*(n20-i-1));k++){
			               		System.out.print(" ");
			               	}
			               	for(int l = 0;l<=i;l++){
			               		System.out.print("*");
			               	}
			               	System.out.println();
			               }
			               for(int i = 0;i<n20;i++){
			               	for(int j = 0;j<(n20-i);j++){
			               		System.out.print("*");
			               	}
			               	for(int k = 0;k<(2*(i));k++){
			               		System.out.print(" ");
			               	}
			               	for(int l = 0;l<(n20-i);l++){
			               		System.out.print("*");
			               	}
			               	System.out.println();
			               }
			               System.out.println();

			               /**
			                * Pattern 21
			                * n=4
			                * ****
			                * *  *
			                * *  *
			                * ****
			                * 
			                * */

			                System.out.println("Pattern 21");
			                int n21 = 4;
			                for(int i = 0;i<n21;i++){
			                	if(i == 0 || i==(n21-1)){
			                		for(int j = 0;j<n21;j++){
			                			System.out.print("*");
			                		}
			                		System.out.println();
			                	}
			                	else{
			                		for(int k = 0;k<n21;k++){
			                			if(k==0 || k==(n21-1)){
			                				System.out.print("*");
			                			}
			                			else{
			                				System.out.print(" ");
			                			}
			                		}
			                		System.out.println();
			                	}
			                }
			                System.out.println();


			                /**
			                 * Pattern 22
			                 * n=4
			                 * 
			                 * 4444444
			                 * 4333334
			                 * 4322234
			                 * 4321234
			                 * 4322234
			                 * 4333334
			                 * 4444444
			                 * 
			                 * */

			                 System.out.println("Pattern 22");
			                 int n22 = 4;
			                 for(int i = 0;i<=(2*n22-2);i++){
			                 	for(int j = 0;j<=2*n22-2;j++){
			                 		int top = i;
			                 		int left= j;
			                 		
			                 		int bottom = (2*n22-2)-i;
			                 		int right = (2*n22-2)-j;

			                 		System.out.print(n22-Math.min(Math.min(top,bottom), Math.min(left, right))+" ");
			                 	}
			                 	System.out.println();
			                 }
			                 System.out.println();

    }				


}