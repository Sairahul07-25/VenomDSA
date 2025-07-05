import java.util.*;

//custom classes
class Data{
	private Integer num;
	private String name;
	private InternalData internalData;
	// Data(int _num, String _name, int _revenue){
	// 	num = _num;
	// 	name = _name;
	// 	internalData = new InternalData(_revenue);
	// }
	public void setNum(int _num){
		num = _num;
	}
	public void setName(String _name){
		name = _name;
	}
	public void setReveneu(int _revenue){
		internalData = new InternalData(_revenue);
	}
	public int getNum(){
		return num;
	}
	public String getName(){
		return name;
	}
	public int getpublicRevenue(){
		return internalData.getRevenue();
	}
}

class InternalData{
	private int revenue;
	InternalData(int _revenue){
		revenue = _revenue;
	}
	public int getRevenue(){
		return revenue;
	}

}




public class javaColl {

	//Comparator
	public static Comparator<Integer> getComparator(){
		 return new Comparator<Integer>(){
				//[num1,num2]
				@Override
				public int compare(Integer num1, Integer num2){
					//num1<num2
					//order is wrong so return +ve number
					if(num1<num2){
						return 1;
					}
					//order is correct so return -ve number
					else if(num1>num2){
						return -1;
					}
					else{
						return 0;
					}
				}
		};
	}

    public static void main(String[] args) {
        // Your code here

        //custom Classes
    	Data obj1 = new Data();
    	Data obj2 = new Data();
    	obj1.setNum(12);
    	obj1.setName("Rahul");
    	obj1.setReveneu(12345);
  
    	System.out.println(obj1.getName());
    	System.out.println(obj1.getNum());
    	System.out.println(obj1.getpublicRevenue());

    	/**
    	 * 
    	 * 
    	 * Collections (Interface)
    	 * 		a) List (Interface)
    	 * 			* ArrayList
    	 * 			* LinkedList
    	 * 			* Stack
    	 * 			* Vector
    	 * 		b) Set(Interface)
    	 * 			* HashSet
    	 * 			* TreeSet
    	 * 		c) Queue(Interface)
    	 * 			* ArrayDeque
    	 * 			* LinkedList
    	 * 			* PriorityQueue
    	 * 
    	 * */

    	 //List (Interface)
    	 //ArrayList
    	 ArrayList<Integer> ls  = new ArrayList<>();
    	 System.out.println("ArrayList");
    	 ls.add(10);
    	 ls.add(20);
    	 ls.add(30);
    	 System.out.println(ls);
    	 System.out.println(ls.size());
    	 System.out.println(ls.get(1));
    	 System.out.println(ls.remove(2));
    	 System.out.println(ls);
    	 ls.add(1,17);
    	 System.out.println(ls);
    	 System.out.println(ls.contains(17));
    	 ls.clear();
    	 System.out.println(ls);

    	 System.out.println();


    	 //LinkedList
		
		LinkedList<Integer> ll = new LinkedList<>();
		System.out.println("LinkedList");
		ll.add(1);
		ll.add(2);
		ll.addFirst(3);
		System.out.println(ll);
		ll.addLast(6);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.size());
		System.out.println(ll.contains(5));
		System.out.println();

		//Stack
		//Last In First Out
		Stack<Integer> st = new Stack<>();
		System.out.println("Stack");
		st.push(2);
		st.push(4);
		st.push(6);
		System.out.println(st);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		st.clear();
		System.out.println(st);
		System.out.println();

		//Vector - Thread Safe
		Vector<Integer> v = new Vector<>();
		//similar to ArrayList but Thread Safe.



		//Set (Interface)
		//HashSet - unique elements O(1)
		HashSet<Integer> hs = new HashSet<>();
		System.out.println("HashSet");
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.add(0);
		System.out.println(hs);
		System.out.println(hs.contains(1));
		System.out.println(hs.size());
		//.equals()
		hs.remove(2);
		System.out.println(hs);
		for(var i:hs){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();

		//TreeSet - unique elements in sorted order O(log(n))
		TreeSet<Integer> ts = new TreeSet<>();
		System.out.println("TreeSet");
		ts.add(12);
		ts.add(9);
		ts.add(1);
		ts.add(4);
		System.out.println(ts);
		System.out.println(ts.floor(8));//<=8
		System.out.println(ts.ceiling(8));//>=9
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		ts.clear();
		System.out.println(ts);
		System.out.println();


		//Queue (Interface) FIFO
		//ArrayDeque
		ArrayDeque<Integer> ad  = new ArrayDeque<>();
		System.out.println("ArrayDeque");
		//fifo
		ad.offer(2);
		ad.offer(4);
		ad.offer(6);
		ad.offer(10);
		System.out.println(ad);
		System.out.println(ad.peek());
		ad.poll();
		System.out.println(ad);
		System.out.println(ad.peek());

		ad.offerFirst(10);
		System.out.println(ad);
		ad.offerLast(20);
		System.out.println(ad);


		ad.pollFirst();
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
		System.out.println(ad.size());
		System.out.println();


		//Priority Queue - peek gives you smallest element, stores in tree like. (Min heap DS)
		System.out.println("Priority Queue");
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(5);
		pq.offer(2);
		pq.offer(9);
		pq.offer(1);
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq.peek());
		System.out.println(pq);

		while(pq.isEmpty() == false){
			System.out.println(pq.peek());
			pq.poll();
		}
		System.out.println();

		//Map Data Structure
		//HashMap - does not store in sorted order
		HashMap<Integer, String> mp = new HashMap<>();
		System.out.println("HashMap");
		mp.put(1,"Raj");
		mp.put(2,"Vikram");//O(1)
		mp.put(3, "Rahul");
		System.out.println(mp);
		System.out.println(mp.get(3));
		mp.remove(2);//O(1)
		System.out.println(mp);
		System.out.println(mp.get(4));
		System.out.println();

		//TreeMap - stores sorted order of keys - O(log(n))
		System.out.println("TreeMap");
		TreeMap<Integer, String> tp = new TreeMap<>();
		tp.put(13, "Rahul");
		tp.put(1,"Raj");
		tp.put(29,"Vikram");
	
		System.out.println(tp);
		System.out.println(tp.ceilingKey(3));
		System.out.println(tp.floorKey(3));
		Set<Integer> s = tp.keySet();
		System.out.println(s);
		System.out.println();

		//Iterator
		ArrayList<Integer> l = new ArrayList<>();
		System.out.println("Iterator");
		l.add(2);
		l.add(4);
		l.add(5);
		Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext()){
			Integer num = iterator.next();
			System.out.println(num);
		}

		System.out.println();


		//Common Algorithms for Collections
		System.out.println("Common Algorithms for Collections.");
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(4);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		System.out.println(Collections.frequency(al,5));//in al how many times 5 occurs.
		//Arrays.sort(arr);
		System.out.println((int)Math.pow(2,5));//gives you in double



		//Custom Comparators
		System.out.println();
		System.out.println("Custom Comparator");
		ArrayList<Integer> cl = new ArrayList<>();
		cl.add(1);
		cl.add(5);
		cl.add(4);
		Collections.sort(cl);//sorts in ascending order, using custom comparator we can do the reverse.
		System.out.println(cl);
		//to sort in descending order
		Collections.sort(cl, new Comparator<Integer>(){
			//[num1,num2]
			@Override
			public int compare(Integer num1, Integer num2){
				//num1<num2
				//order is wrong so return +ve number
				if(num1<num2){
					return 1;
				}
				//order is correct so return -ve number
				else if(num1>num2){
					return -1;
				}
				else{
					return 0;
				}
			}
		});
		System.out.println(cl);

		//using a lambda function to sort in descending order
		Collections.sort(cl);
		System.out.println(cl);
		//[num1,num2]
		// num1<num2 - wrong order so num2-num1 returns a +ve number
		Collections.sort(cl,(num1,num2)-> num2-num1);
		System.out.println(cl);

		//to make it simple for custom comparator we can call it as a function
		/**
		 * 
		 * public static Comparator<Integer> getComparator(){
		 * 		return new Comparator<Integer>(){
					//[num1,num2]
					@Override
					public int compare(Integer num1, Integer num2){
							//num1<num2
							//order is wrong so return +ve number
							if(num1<num2){
								return 1;
							}
							//order is correct so return -ve number
							else if(num1>num2){
								return -1;
							}
							else{
								return 0;
							}
					}
				};
		 * }
		 * 
		 * //then you can call 
		 * from the psvm 
		 * Collections.sort(al,getComparator());
		 * 
		 * */

		 //Priority Queue Max Heap 
		 System.out.println();
		 System.out.println("Priority Queue as Max Heap");
		 PriorityQueue<Integer> pqy = new PriorityQueue<>(getComparator());
		 pqy.offer(8);
		 pqy.offer(1);
		 pqy.offer(5);
		 pqy.offer(4);

		 //gives you the smallest but if you put the getComparator() in the declaration then gives max.
		 System.out.println(pqy.poll());




    }

}