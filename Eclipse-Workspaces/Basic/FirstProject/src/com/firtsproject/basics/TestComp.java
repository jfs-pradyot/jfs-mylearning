package com.firtsproject.basics;

import java.util.ArrayList;
import java.util.Collections;

public class TestComp {
	public static void main(String[] args) {
		
		ArrayList<TestComparator> list=new ArrayList();
		list.add(new TestComparator(5, 24, "Ajek"));
		list.add(new TestComparator(14, 17, "Jack"));
		list.add(new TestComparator(22, 28, "Jim"));
		
		//size of the list
		int size=list.size();
		System.out.println("wihout sorting");
		for(int x=0;x<size;x++)
		System.out.println(list.get(x));
		
		System.out.println("\nwith sorting");
		Collections.sort(list, new SortByAge());
		for(int x=0;x<size;x++)
			System.out.println(list.get(x));
		
	}
}