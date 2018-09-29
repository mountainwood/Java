import java.util.*;
public class GenericsDemo2 {
	
	public static void print(List<? extends Number> list) {			//只能傳 Number 的子類別(看看API之Number)
																	//與多型有關
		Iterator<?> iter = list.iterator();
		while (iter.hasNext())
		System.out.println(iter.next());
	}
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);			list1.add(2);
		print(list1);
		//因為需是 Number 的子系，所以下列三式不可用 
		//List<String> list2 = new ArrayList<>();
		//list2.add("Hello");		list2.add("Hi");
		//print(list2);
		List<Double> list2 = new ArrayList<>();
		list2.add(5.6);			list2.add(7.9);
		print(list2);
		
		
	}

}// end of class GenericsDemo1
