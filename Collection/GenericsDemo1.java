import java.util.*;
public class GenericsDemo1 {
	
	public static void print(List<?> list) {			//�u�� �u�H�v ���ܡA�����ƫ��A���i�H��
		Iterator<?> iter = list.iterator();
		while (iter.hasNext())
		System.out.println(iter.next());
	}
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);			list1.add(2);
		print(list1);
		List<String> list2 = new ArrayList<>();
		list2.add("Hello");		list2.add("Hi");
		print(list2);
	}

}// end of class GenericsDemo1
