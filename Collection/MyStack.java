import java.util.*;
public class MyStack<T> {
	List<T> list = new ArrayList<T>();
	public void push(T val) {
		list.add(val);

	}
	public T pop() {
		return list.remove(list.size()-1);
	}

}
