
import java.util.Arrays;

public class IntArrayList implements IntList {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    @Override
    public void add(int e) {
        if (count == elements.length) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < oldCapacity; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count){
            throw new IllegalArgumentException("Index: " + index + " is not valid");
        }
        return elements[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int value) {
        for(int i = 0; i < this.size(); i++){
            if(this.elements[i] == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int index) {
        int[] fPart = Arrays.copyOf(this.elements, index);
        int[] sPart = Arrays.copyOfRange(this.elements, ++index, this.size());
        IntList a = new IntArrayList();
        a.addAll(fPart);
        a.addAll(sPart);
        this.elements = a.toArray();
        this.count = a.size();
    }

    @Override
    public void sort() {
        IntList a = new IntArrayList();
        int[] arr = this.toArray();
        for(int i = 0; i < arr.length; i++){
            int mini = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int c = arr[i];
            arr[i] = arr[mini];
            arr[mini] = c;
        }
        a.addAll(arr);
        this.elements = a.toArray();
        this.count = a.size();
    }

    @Override
    public int[] toArray() {
        int[] newArr;
        newArr = Arrays.copyOf(elements, count);
        return newArr;
    }

    @Override
    public void addAll(IntList list) {
        for(int i = 0; i < list.size(); i++){
            this.add(list.get(i));
        }
    }
    @Override
    public void addAll(int[] list) {
        for(int i = 0; i < list.length; i++){
            this.add(list[i]);
        }
    }

    @Override
    public void addAll(IntList list, int index) {
        int[] fPart = Arrays.copyOf(this.elements, index);
        int[] sPart = Arrays.copyOfRange(this.elements, index, this.size());
        IntList a = new IntArrayList();
        a.addAll(fPart);
        a.addAll(list);
        a.addAll(sPart);
        this.elements = a.toArray();
        this.count = a.size();
    }
}
