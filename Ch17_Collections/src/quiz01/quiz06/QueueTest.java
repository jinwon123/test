package quiz01.quiz06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("JAVA");
		queue.add("SCRIPT");
		queue.add("JSP");
		while (!queue.isEmpty()){
			System.out.println(queue.remove());
		}

	}

}
