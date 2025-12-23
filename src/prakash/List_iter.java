package inbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class List_iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List bag=new ArrayList();
		Collections.addAll(bag,10,20,30,40,50,60);
		ListIterator l=bag.listIterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		while (l.hasPrevious()) {
			System.out.println(l.previous());
		}
	}

}
