package List;

import java.util.ArrayList;

public class Remove {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add("Hello");
	a.add('a');
	a.add(10.22);
	System.out.println(a);
	a.remove("Hello");
	System.out.println(a);
}
}
