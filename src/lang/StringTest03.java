package lang;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="asfvsdasdvva";
		
		//charat : 내부배열의 문자를 찾아내는
		System.out.println(s.charAt(2));
		
		//indexof
		System.out.println(s.indexOf("abc")); //문자가 없는 경우 -1이 나온다.
		
		//치환
		System.out.println(s.replace('a', 'R'));
		System.out.println(s);
		
		//치환2
		System.out.println(s.replace("as", "12"));
		System.out.println(s.replaceAll("as", "12"));
		//System.out.println(s);
		
		//substring
		System.out.println(s.substring(3, 7));  //7번째 앞까지 잘라라
		
		//tolowercase
		System.out.println(s.toLowerCase());
		
		String str1=" ab cd";
		String str2=",efg ";
		
		//concat
		str1=str1.concat(str2);
		System.out.println(str1);
		
		//trim
		System.out.println("--"+str1+"--");
		str1=str1.trim();
		System.out.println("--"+str1+"--");  //가운데공백을 제외한 맨 앞 공백만 제거 모든 공백을 다 제거 하고 싶으면 replace를 사용
		
		//split
		String[] tokens=str1.split(",");
		
		for(String str : tokens)
		{
			System.out.println(str);
		}
		
		//split의 예외
		System.out.println("/div인자가 없을때");
		String[] tokens1=str1.split("/");
		
		for(String str : tokens1)
		{
			System.out.println(str);
		}
		
		System.out.println("아무값도 없을때");
		String[] tokens2="".split("/");
		
		for(String str : tokens2)
		{
			System.out.println(str);
		}
		

	}

}
