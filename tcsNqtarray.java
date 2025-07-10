import java.util.*;

public class arrayProblems {

	public static void rotate(int[] arr){
		int tem = arr[0];
		for(int i = 0;i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = tem;
		return;
	}

    public static void main(String[] args) {
        // Your code here

    	//Rotate array problem

        Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0;i<n;i++){
        // 	arr[i] = sc.nextInt();
        // }
        // int k = sc.nextInt();

    	System.out.println("Rotate array");
        int[] arr = {1,2,3,4,5};
        int k = 3;
       	
       	System.out.println(Arrays.toString(arr));
       	for(int i = 0;i<k;i++){
       		rotate(arr);
       	}
       	System.out.println(Arrays.toString(arr));
       	System.out.println();


       	// Median of array
       	// 0 based indexing
       	System.out.println("median of array");
       	int[] narr = {2,1,5,7,9};
       	Arrays.sort(narr);
       	System.out.println(Arrays.toString(narr));
       	if(narr.length%2==0){
       		int l = narr.length/2;
       		int r = l+1;
       		System.out.println(narr[l-1]);
       		System.out.println(narr[r-1]);
       		double median = (double)(narr[l-1] + narr[r-1])/(double)2;
       		System.out.println(median);
       	}
       	else{
       		System.out.println(narr[(narr.length/2)]);
       	}
       	System.out.println();



       	//remove duplicates from a sorted array
       	System.out.println("remove duplicates from a sorted array");
       	int[] sortarr = {1,1,1,2,2,2,3,3,3};
       	// ArrayList<Integer> ls = new ArrayList<>();
       	// for(var s: sortarr){
       	// 	if(!ls.contains(s)) ls.add(s);
       	// }
       	// System.out.println(ls);
       	// for(int i = 0;i<ls.size();i++){
       	// 	sortarr[i] = ls.get(i);
       	// }
       	// System.out.println(Arrays.toString(sortarr));
       	// System.out.println(ls.size());

       	//other version
       	int z = 0;
       	for(int j = 1;j<sortarr.length;j++){
       		if(sortarr[z]!=sortarr[j]){
       			sortarr[z+1] = sortarr[j];
       			z++;
       		}
       	}
       	System.out.println(Arrays.toString(sortarr));
       	System.out.println(z+1);
       	System.out.println();



       	//find all repeating elements in arr
       	System.out.println("find all repeating elements in arr");
       	int[] reparr = {1,1,2,3,4,4,5,2};System.out.println(Arrays.toString(reparr));
       	Arrays.sort(reparr);
       	Set<Integer> s = new HashSet<>();
       	int q = 0;
       	for(int j = 1;j<reparr.length;j++){
       		if(reparr[q] == reparr[j]){
       			s.add(reparr[q]);
       		}
       		q++;
       	}
       	System.out.println(s);


       	//Symmetric pairs
       	int[][] mat ={{1,5},{2,3},{4,2},{5,1},{2,4}} ;

       	int[] vis = new int[mat.length];
       	for(int i = 0;i<vis.length;i++){
       		vis[i] = 0;
       	}	
       	ArrayList<ArrayList<Integer>> symls = new ArrayList<>();
       	System.out.println(Arrays.toString(vis));
       	for(int i = 0;i<mat.length;i++){
       		if(vis[i]==0){
       			for(int j = i+1;j<mat.length;j++){
       				if(vis[j] == 0){
       					int tem = mat[j][0];
       					mat[j][0] = mat[j][1];
       					mat[j][1] = tem;
       					String s1 = Arrays.toString(mat[i]);
       					String s2 = Arrays.toString(mat[j]);

       					if(s1.equals(s2)){
       						vis[i] = 1;
       						vis[j] = 1;
       						ArrayList<Integer> l = new ArrayList<>();
       						for(var u : mat[j]){
       							l.add(u);
       						}
       						symls.add(l);
       					}
       				}
       			}
       		}
       	}
       	System.out.println(symls);
       	//other version
       	for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                if (mat[j][0] == mat[i][1] && mat[j][1] == mat[i][0]) {
                    System.out.print("(" + mat[i][1] + " " + mat[i][0] + ")" + " ");
                    break;
                }
            }
        }
        System.out.println();



        //Maximum product subarray O(n3)
        System.out.println("Maximum product subarray");
        int[] maxpro = {1, -2, 3, 4, -4, -3};
        int mpro = 1;
        for(int i = 0;i<maxpro.length;i++){
        	for(int j = i;j<maxpro.length;j++){
        		int prod = 1;
        		for(int l = i;l<=j;l++){
        			prod*=maxpro[l];
        		}
        		mpro = Math.max(prod, mpro);
        	}
        }
        System.out.println("Brute force");
        System.out.println(mpro);

        //other version O(n2);
        int m = 1;
        for(int i = 0;i<maxpro.length;i++){
        	int prod = 1;
        	for(int j = i;j<maxpro.length;j++){
        		prod*=maxpro[j];
        		m = Math.max(prod, m);
        	}
        }
        System.out.println("Better solution");
        System.out.println(m);

        //optimal solution O(n)
        int max = 1;
        int pre = 1;
        int suf = 1;
        for(int i = 0;i<maxpro.length;i++){
        	if(pre == 0) pre = 1;
        	if(suf == 0) suf = 1;
        	pre = pre* maxpro[i];
        	suf = suf * maxpro[maxpro.length-1-i];
        	max = Math.max(max, Math.max(pre, suf));
        }
        System.out.println("Optimal");
        System.out.println(max);
        System.out.println();



        //Replace elements by its rank in the array
        System.out.println("Replace elements by its rank in the array");
        int[] plar = {1, 5, 8, 15, 8, 25, 9};
        System.out.println(Arrays.toString(plar));
        ArrayList<Integer> tl = new ArrayList<>();
        for(var r:plar){
        	tl.add(r);
        }
        Collections.sort(tl);
        Map<Integer,Integer> mp = new HashMap<>();
        int hy = 1;
        for(var r:tl){
        	if(!mp.containsKey(r)){
        		mp.put(r,hy);
        		hy++;
        	}
        }
        System.out.println(mp);
        for(int i = 0;i<plar.length;i++){
        	plar[i] = mp.get(plar[i]);
        }
        System.out.println(Arrays.toString(plar));
        System.out.println();


        //Sort Elements of an Array by Frequency
        System.out.println("Sort Elements of an Array by Frequency");
        int[] sbf = {1,2,3,2,4,3,1,2};
        Map<Integer,Integer> msbf = new HashMap<>();
       	for(var y:sbf){
       		msbf.put(y,msbf.getOrDefault(y,0)+1);
       	}
       	ArrayList<Integer> lsbf = new ArrayList<>(msbf.keySet());
       	System.out.println(lsbf);
       // Collections.sort(lsbf, (a,b)->{
       // 		if(!msbf.get(a).equals(msbf.get(b))){
       // 			return msbf.get(b)-msbf.get(a);
       // 		}
       // 		else {
       // 			return a-b;
       // 		}

       // });
       lsbf.sort((a,b)->{
       		if(!msbf.get(a).equals(msbf.get(b))){
       			return msbf.get(b)-msbf.get(a);
       		}
       		else {
       			return a-b;
       		}
       });
       System.out.println(lsbf);
       ArrayList<Integer> ansl = new ArrayList<>();
       for(var ui : lsbf){
       		for(int j= 0;j<msbf.get(ui);j++){
       			ansl.add(ui);
       		}
       }
       for(int i = 0;i<sbf.length;i++){
       		sbf[i] = ansl.get(i);
       }
       System.out.println(Arrays.toString(sbf));
       System.out.println();




       //rotate by left or right
       // int N = sc.nextInt();
       // int[] rotlr = new int[N];
       // for(int i = 0;i<N;i++){
       // 		rotlr[i] = sc.nextInt();
       // }
       // int K = sc.nextInt();
       // String pos = sc.next();
       
       int[] rotlr = {1,2,3,4,5,6,7};
       int K = 3;
       String pos = "right";
       int te = rotlr[rotlr.length-1];
       for(int i = rotlr.length-1;i>=1;i--){
       		rotlr[i] = rotlr[i-1];
       }
       rotlr[0] = te;
       System.out.println(Arrays.toString(rotlr));
       System.out.println();





       //Finding Equilibrium index in an array
       System.out.println("Finding Equilibrium index in an array");
       int[] eqar = {2,3,-1,8,4};System.out.println(Arrays.toString(eqar));
       boolean isthere= false;
       
       for(int i = 0;i<eqar.length;i++){
       		int pr = 0;
       		int sf = 0;
       		for(int j = 0;j<i;j++){
       			pr+=eqar[j];
       		}
       		for(int j = i+1;j<eqar.length;j++){
       			sf+=eqar[j];
       		}

       		if(pr == sf){
       			System.out.println("Index is " +i);

       			isthere = true;
       			break;
       		}
       }
       if(!isthere){
       	System.out.println(-1);
       }
       System.out.println();



       //Sort an array according to the order defined by another array
       System.out.println("Sort an array according to the order defined by another array");
       


    }

}