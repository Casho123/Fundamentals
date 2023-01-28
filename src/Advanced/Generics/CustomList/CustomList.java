package Advanced.Generics.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CustomList<T extends Comparable<T>> {

    private List<T> values;

    public CustomList() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }
    public void remove(int index) {
        this.values.remove(index);
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
    public T getMax() {
        T maxElement = this.values.get(0);
        for (T value : this.values) {
            if (value.compareTo(maxElement) > 0) {
                maxElement = value;
            }
        }
        return maxElement;
    }

    public T getMin() {
        T minElement = this.values.get(0);
        for (T value : this.values) {
            if (value.compareTo(minElement) < 0) {
                minElement = value;
            }
        }
        return minElement;
    }
    public void print() {
        for (T value : this.values) {
            System.out.println(value);

        }
    }
    public int size() {
        return this.values.size();
    }






}
