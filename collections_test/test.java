package collections_test;

import java.util.*;

public class test{
	public static void main(String[] args) {
		HashMap<String, Integer> index = new HashMap<>();
		String[] numbers = {"one","two","three","four"};
		int i = 1;
		for(String number : numbers){
			index.put(number, i++);
		}
		System.out.println(index);
	}
}