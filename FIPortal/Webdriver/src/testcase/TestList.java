package testcase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println("Value at 1st is "+list.get(1));
		System.err.println("Size is "+list.size());
		list.remove(2);
		
		System.err.println("Size is "+list.size());
		list.clear();
		System.err.println("Size is "+list.size());


	}

}
