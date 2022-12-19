package Vector;

import java.util.Vector;

public class Example {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(20.22);
	v.addElement(30);
	System.out.println(v);
	for(Object o:v) {
		System.out.println(o);
	}
}
}
