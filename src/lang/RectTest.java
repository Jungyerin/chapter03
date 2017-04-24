package lang;

public class RectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rect r1=new Rect(10,20);
		Rect r2=new Rect(10,20);
		
		System.out.println(r1==r2);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.hashCode()==r2.hashCode());
		

	}

}
