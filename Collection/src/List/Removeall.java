package List;

import java.util.ArrayList;

public class Removeall {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a.removeAll(a1);
		System.out.println(a);
}
}
