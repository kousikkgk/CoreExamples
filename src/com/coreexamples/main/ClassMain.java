package com.coreexamples.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassMain {

	public static void main(String[] args) {

		/** How to remove the duplicate words and print the unique words **/
		String name = "my my name name is is koushik koushik";

		String[] nameArr = name.split(" ");

		Set<String> set = new LinkedHashSet<String>();
		Set<String> dupSet = new LinkedHashSet<String>();

		for (String word : nameArr) {

			if (!set.add(word)) {
				dupSet.add(word);
			}
		}
		System.out.println(set);
		/***********************************************************/

		/**
		 * How to get the duplicate occurances and get the maximum of occurance in this
		 * case 2 and 3 had 4 occurances but 3 is maximum number so print 3 as output
		 **/

		int[] arr = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5 };
		Map<Integer, Integer> map = new HashMap<>();

		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], count);
			}
		}
		int max = Collections.max(map.values());
		List<Integer> keys = new ArrayList<>();

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				keys.add(entry.getKey());
			}
		}
		System.out.println(Collections.max(keys));
	}

}
