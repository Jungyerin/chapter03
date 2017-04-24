package lang;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i=new Integer(10); 
		Character c = new Character('c');
		Float f = new Float(3.14);
		Boolean b = new Boolean(true);
		
		//자동으로 10을 new하는 boxing이 일어나서 auto boxing
		//상수 풀을 거쳐서 자동으로  new Integer(10)
		Integer j=10;
		
		
		//int k=10+j.intValue(); 자동으로 아래의 식이 옆의 식으로 변환되어 계산된다.
		int k = 20+j;
		
		swap(i,j);

	}
	
	public static void swap(Integer i,Integer j)
	{
		//객체이지만 내부를 수정할 수 없기 때문에 swap되지 않는다.
		
	}

}
