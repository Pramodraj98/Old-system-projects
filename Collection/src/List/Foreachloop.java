package List;

import java.util.ArrayList;

public class Foreachloop {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add("Hello");
	for(Object o:a) {
		System.out.println(o);
	}
}
}
