package lang;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자 "escape \=escape문자 문자형을 출력할때 앞에 붙여준다.
		 
		String s="i say \"hello\"";
		
		System.out.println(s);
		
		//문자 ' escape
		
		char c='\'';
		
		System.out.println(c);
		
		//문자 \ escape
		/*
		 * \n=개행 \t=tab \r= \b=
		 */
		
		
		String s1="c:\\jx372";
		System.out.println(s1);
		
		//\t \n \r
		
		System.out.println("\n"+"a");
		
		//+연산이 가능하다
		
		String s4="Hello"+"World"; //내부적으로 appand연산을 거침
		
		System.out.println(s4);
		System.out.println(s4.charAt(4));
		
		//내부 문자(배)열을 가져오기
		
		char[] cs= s4.toCharArray();
		
		System.out.println(cs);
		
	}

}
