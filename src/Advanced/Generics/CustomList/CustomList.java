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
}
