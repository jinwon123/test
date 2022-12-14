package quiz01.quiz05;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

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
	public boolean equals(Object obj) {
		if (this.width == ((Rectangle)obj).width && this.height == ((Rectangle)obj).height) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.width + " " + this.height;
	}

}
