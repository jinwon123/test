package quiz01.quiz04;

public class Fan {
	static final int SLOW = 1;
	static final int MEDIUM = 2;
	static final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;
	
	public Fan() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed == 1) {
			this.speed = SLOW;
		} else if(speed == 2) {
			this.speed = MEDIUM;
		} else {
			this.speed = FAST;
		}
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void printFanInformation() {
		if (on == true) {
			System.out.println("speed = " + speed);
			System.out.println("radius = " + radius);
			System.out.println("color = " + color);
		} else {
			System.out.println("선풍기가 꺼져있습니다.");
		}
	}
	
}
