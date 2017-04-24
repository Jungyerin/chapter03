package lang;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('@'));
		
		String s = "1234"; //인트형으로 변환할때 숫자 이외의 문자가 있으면 exception에러
				
		if(s.matches("-?\\d+(ww.wwd+)?")==false)
		{
			System.out.println("숫자가 아닙니다");
		}
		else
		{
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		
		//프로그램 로직(변수검증...)try~catch문으로 하지 말것

		System.out.println(Integer.parseInt("A",16));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toHexString(255));
		System.out.println(Double.parseDouble("44.13e-16"));
		System.out.println(Long.parseLong("123456789"));
		
		System.out.println(String.valueOf(12345)); //정수를 문자형으로 바꿔주는 것
	}

}
