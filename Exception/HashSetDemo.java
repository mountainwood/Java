import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer>set = new HashSet<Integer>();
		//Set<Integer>set = new HashSet<>();			//java5.0���᪺�g�k�A�i�ٲ��᭱��Integer
		set.add(new Integer(12));
		set.add(34); 		//boxing	--->[34, 12]
		set.add(15);
		set.add(4);
		set.add(344);
		//set.add(34);		//duplicate, is not added
		//set.add("Hello");	//compile error
		System.out.println(set);
		System.out.println(set.size());
		Iterator<Integer> objs = set.iterator();	//java4.0�H�e���g�k
		while(objs.hasNext()) {						//java4.0�H�e���g�k
			System.out.println(objs.next());		//unboxing	java4.0�H�e���g�k
		}
		for(Integer i: set) {						//java5.0�H�e���g�k
			System.out.println(i);			/*
											[34, 12]
												2
												34
												12
												34
												12*/
		}
			
	}

}
