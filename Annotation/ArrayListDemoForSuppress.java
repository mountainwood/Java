import java.util.*;
public class ArrayListDemoForSuppress {
	@SuppressWarnings({"rawtypes","unchecked"})		//§í¨î({"rawtypes","unchecked"})	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(12));
		list.add(34);
		list.add(34);
		
		System.out.println(list);
		
		Iterator objs = list.iterator();
		while(objs.hasNext()) {
			System.out.println(objs.next());
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
