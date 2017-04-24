package Util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("도우너");
		queue.offer("또치");

		System.out.println(queue.isEmpty());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		//비어있으면 null이 리턴된다
		//stack은 배열이기 때문에 예외를 던졌고 큐는 링크드리트스이므로 null을 반환한다.
		System.out.println(queue.poll());
	}

}
