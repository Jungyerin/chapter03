package lang;

public class Rect {

	private int width;
	private int height;
	
	public Rect(int width,int height)
	{
		this.width=width;
		this.height=height;
	} //hash가 붙어있는 자바객체에 들어가야된다면 오버라이드 해주어야 한다.(equals와hash같이 오버라이드!!!!!)
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
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
		Rect other = (Rect) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	
	
}
