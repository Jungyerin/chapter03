package lang;

public class EqualsTest {

	public static void main(String[] args) {
		Point pt1=new Point(10,20); // 각각 객체를 생성했기때문에 pt1,pt2는 다른 주고값을 가져서 같지 않다는 연산결과가 나온다
		Point pt2=new Point(10,20); //
		Point pt3=pt2;
		
		/* Point 객체 비교
		 * equlas, hashCode 메소드가 오버라이드가 안된 경우
		 */
		
		
		//==연산자에서 두 개의 항이 객체참조변수인 경우
		//두 객체의 동일 여부(동일성)
		System.out.println(pt1==pt2);  //객체가 같은 객체 인지 아닌지를 구분
		System.out.println(pt2==pt3);
		
		

		//두 객체의 동질성 비교를 할 때에는 equals메소드를 사용한다.
		//equals가 오버라이드가 안된경우에는 equals는 ==랑 완전히 동일하다.
		System.out.println(pt1.equals(pt2));
		System.out.println(pt2.equals(pt3));
		
		
		System.out.println();
		
		/*
		 * String 객체 비교
		 * equals와 hashCode메소드가 오버라이드가 된 경우
		 */
		
		String s1=new String("hello");
		String s2=new String("hello");
		String s3=s2;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		//hasgCode 출력
		//String 클래시는 내용기반으로 hashcode를 생성하게
		//hashCode() 메소드가 오버라이드되어있다.
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode()); 
		/*객체가 다른데 모든 hashcode값이 같다?
		 * hashtable
		 * hashmap 
		 * hashset : 순서없이 중복을 허용하지 않는 집합  같은 객체가 들어가지 못하게 함.
		 * 객체가 달라도 값이 같기 때문에 같은 것으로 간주하고 중복되서 들어가지 않도록 관리함.->성능을 위해서
		 * 식에 좌우하지 않고 무조건 시간복잡도가 빅오1임
		 */
		System.out.println();
		
		//참조값(객체ID)
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		/*
		 * literal을 사용하는 경우
		 * jvm 안의 리터럴(상수) 풀에(pool)서 객체 생성 관리를 하기 때문에 문자열 해싱값이 같은 문자열 객체는 2개 이상 만들지 않는다.
		 */
		System.out.println();
		
		String str1="hello";
		String str2="hello";
		String str3=str2;
		
		System.out.println(str1==str2);
		System.out.println(str2==str3); //new string을 명시적으로 써주게 되면 다른 객체가 되는데 명시적으로 써주지 않으면 같은 객체가 됨
		
		/*new를 명시적으로 써주지 않으면 jvm이 관여하면 같은 값을 할당하게 되면 같은 것으로 인식
		 * new string을 사용하게 되면 jvm상의 상수풀에 가지 않고 바로 heap영역에 주소값을 할당해줌
		 * new를 써주지 않으면 jvm의 상수풀이 관여하게 되는데 이때 상수풀이 hashcode를 만들어서 heap에 주소값을 할당해줌
		 * new를 써주지 않은 상태에서 같은 literal을 새로운 변수에 할당하게 되면 jvm에서 자체적으로 같다고 판단하여 heap의 주소값을 할당해줌.
		 * 
		 * new string 보가 literal을 쓰면 메모리를 아낄 수 있음
		 */
		
		
		
		
		
		
	}

}
