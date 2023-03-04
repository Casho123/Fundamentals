package Advanced.Generics.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void addValue(T value) {
        this.values.add(value);
    }

    public void swap(int index1, int index2) {
        T temp = this.values.get(index1);
        this.values.set(index1, this.values.get(index2));
        this.values.set(index2, temp);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : this.values) {
            sb.append(value.getClass().getName()).append(": ").append(value);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}

