import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer>set = new HashSet<Integer>();
		//Set<Integer>set = new HashSet<>();			//java5.0之後的寫法，可省略後面的Integer
		set.add(new Integer(12));
		set.add(34); 		//boxing	--->[34, 12]
		set.add(15);
		set.add(4);
		set.add(344);
		//set.add(34);		//duplicate, is not added
		//set.add("Hello");	//compile error
		System.out.println(set);
		System.out.println(set.size());
		Iterator<Integer> objs = set.iterator();	//java4.0以前的寫法
		while(objs.hasNext()) {						//java4.0以前的寫法
			System.out.println(objs.next());		//unboxing	java4.0以前的寫法
		}
		for(Integer i: set) {						//java5.0以前的寫法
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
