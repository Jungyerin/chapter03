package lang;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point pt = new Point();
		
		System.out.println(pt.getClass().getName());	
		System.out.println(pt.hashCode());  			//객체 id, 객체 레퍼런스값
		
		//getClass().getName()+"@"+hashCode()
		System.out.println(pt.toString());
		System.out.println(pt);
		
		/* String 객체와 비교*/
		
		String s=new String("hello");
		
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s.toString());   //string이 tostring을 오버라이드 했기 때문에 기본구현이 아닌 s의 값이 나옴
		System.out.println(s);
		

	}

}
