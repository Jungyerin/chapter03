package Util;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		stack.push("둘리");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());		//값을 reuturn해주고 빼내는 역할
		System.out.println(stack.pop());
		System.out.println(stack.peek());		//값을 빼내지 않고 return만 해줌
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//stack은 비어 있는 경우 pop호출 시 예외발생 
		//System.out.println(stack.pop());
		
		

	}

}
