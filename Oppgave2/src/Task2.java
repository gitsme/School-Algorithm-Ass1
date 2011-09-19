
public class Task2 {
	private static String[] liste = {"a","b","c","d","e","a","b"};
	private static Integer[] lista;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(max(liste));
	}
	
	public static <E extends Comparable<E>> E max(E[] list){
		if(list == null || list.length==0)
			return null;
		
		E max = list[0];
		for (E a : list){
			if(a.compareTo(max)>0)
				max = a;
		}
		return max;
	}

}
