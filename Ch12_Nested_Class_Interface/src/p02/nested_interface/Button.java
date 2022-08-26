package p02.nested_interface;

public class Button {
	OnClickListener listener;
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch () {
		listener.onClick(); // polymorphism
	}

	interface OnClickListener {
		void onClick(); // abstract method
	}
}
