import java.util.*;
public class ArrayListDemo {
	//������
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		//Set<Integer>set = new HashSet<>();			//java5.0���᪺�g�k�A�i�ٲ��᭱��Integer
		list.add(new Integer(12));
		list.add(34); 		//boxing	--->[34, 12]
		list.add(15);
		list.add(4);
		list.add(344);
		//set.add(34);		//duplicate, is not added
		//set.add("Hello");	//compile error
		System.out.println(list);
		System.out.println(list.size());
		Iterator<Integer> objs = list.iterator();	//�k�@
		while(objs.hasNext()) {						
			System.out.println(objs.next());		
		}
		System.out.println("==========================================");
		for(int i = 0; i < list.size(); i++) {		//�k�G
			System.out.println(list.get(i));
		}
		System.out.println("==========================================");
		for(Integer i: list) {						//�k�T
			System.out.println(i);			

		}
			
	}

	

}
