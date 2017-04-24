package Util;

public class Value {
	private int value;
	
	

	public Value(int value)
	{
		this.value=value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Value [value="+value+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	//주소값과 데이터값까지 확인을 해서 값을 할당하는데 hashcode와  equals를 항상 같이 오버로딩하는 것을 권장한다. 
	
	
	
	

}
