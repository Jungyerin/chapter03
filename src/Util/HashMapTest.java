package Util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("둘리", new Integer(10));
		map.put("마이콜", 50); // auto boxing
		map.put("도우너", 90);

		map.put("둘리", 95); // 기존의 10을 끊어버리고 95를 가리키게 됨

		// auto unboxing
		// int score=map.get("마이콜"); //unboxing이 자동으로 일어남.

		Integer score = map.get("마이콜"); // integer는 객체형 int는 데이터타입

		System.out.println(score);

		System.out.println(map.get(new String("둘리")));// 이거 두개의 차이점?????????
		System.out.println(map.get("둘리"));

		System.out.println();

		// 평균
		Set<String> keyset = map.keySet();
		int count = keyset.size(); // set의 크기

		int sum = 0;
		Iterator<String> it = keyset.iterator();

		while (it.hasNext()) {
			String key = it.next();
			// System.out.println(key);
			int s = map.get(key);
			sum = sum + s;
		}

		System.out.println("평균 : " + (sum / count));

	}

}
