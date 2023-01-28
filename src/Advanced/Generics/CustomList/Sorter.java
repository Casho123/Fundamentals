package Advanced.Generics.CustomList;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {

        for (int i = 0; i < customList.size(); i++) {
            T current = customList.get(i);
            for (int j = i+1; j < customList.size(); j++) {
                if (current.compareTo(customList.get(j)) > 0) {
                    customList.swap(i,j);
                }

            }
        }


    }

}
