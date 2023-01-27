package Advanced.Generics.CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> values;

    public CustomList() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }
    public void remove(T element) {
        this.values.remove(element);
    }
    public boolean contains(T element) {
        boolean isPresent = false;
        if (this.values.size() > 0) {
            for (T value : this.values) {
                if (value.compareTo(element) == 0) {
                    isPresent = true;
                    break;

                }
            }
        }
        return isPresent;
    }
    public void swap(int index1, int index2) {
        T temp = this.values.get(index1);
        this.values.set(index1, this.values.get(index2));
        this.values.set(index2, temp);
    }
    public int countGreaterThan(T element) {
        long count = this.values.stream().filter(e -> e.compareTo(element) > 0).count();

       return (int)count;
    }




}
