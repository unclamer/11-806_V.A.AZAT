import org.w3c.dom.ls.LSInput;

public class Main {

    public static void main(String[] args) {
		IntList list = new IntArrayList();
		IntList list1 = new IntArrayList();

		list.add(42);
		list.add(50);
		list.add(51);
		list.add(52);
		list1.add(42);
		list1.add(50);
		list1.add(51);
		list1.add(52);
		list1.get(0);
		int[] a;
	    a = list.toArray();
	    list.addAll(list1, 1);
		list.sort();
		a[0] = 90;
    }
}







