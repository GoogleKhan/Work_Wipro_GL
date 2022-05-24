import java.util.ArrayList;

public class GenericsNeed {
	public static void main(String[] args) {
		
	ArrayList<Boolean> list = new ArrayList<>();
	
	list.add("Apple");
	list.add("Banana");
	
	list.add(12);
	list.add(true);
	
	System.out.println(list);
		
	}

}
