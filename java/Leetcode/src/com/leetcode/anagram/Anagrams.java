package com.leetcode.demo;

import java.util.HashMap;

public class Anagrams {

	public boolean isAnagram(String str1, String str2) {

		boolean flag = false;

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {

			Character ch = str1.charAt(i);

			if (map1.get(ch) == null) {
				map1.put(ch, 1);

			} else {

				int count = map1.get(ch);

				map1.put(ch, ++count);

			}
		}

		for (int i = 0; i < str2.length(); i++) {

			char ch = str2.charAt(i);

			if (!map2.containsKey(ch)) {
				map2.put(ch, 1);
			} else {

				int count = map2.get(ch);

				map2.put(ch, ++count);

			}

		}
		
		
		if(map1.equals(map2)) {
			flag=true;
		}

		return flag;

	}
	
	

}
