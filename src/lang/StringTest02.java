package lang;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="abc";
		String str2="cde";
		String str3=str2;
		
		str2=str3.toUpperCase(); //대문자로 바꿔주는 함수
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4=str2.concat("??");
		
		System.out.println(str2);
		System.out.println(str4);
		
		//method chain 메소드를 연달아서 여러번 사용가능
		
		String str5="!".concat(str2).concat("@");
		//String s1="!";
		//String str5=s1.concat(str2).concat("@");
		//함수 내부에서
		
		System.out.println(str2);
		System.out.println(str5);
		
		

	}

}
