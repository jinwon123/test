package quiz01.quiz06;

public class Util {
	
	public static <K, V> V getValue(Pair<K, V> p, K key) {
		if(p.getKey().equals(key)) {
			return p.getValue();
		}
		return null;
	}

}
