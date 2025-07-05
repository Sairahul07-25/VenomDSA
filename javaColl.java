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


		//Queue (Interface) FIFO
		

    }

}