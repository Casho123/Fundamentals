package Lists.ObjectsAndClasses.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

   private List<Pet> data;
   private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity) {
            this.data.add(pet);
        }

    }
    public boolean remove(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                data.remove(i);
                return  true;
            }
        }
        return false;

    }

    public Pet getPet(String name, String owner) {
        Pet pet;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name) && data.get(i).getOwner().equals(owner)) {
                pet = data.get(i);
                return pet;
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }
    public void getStatistics() {

        System.out.println("The grooming salon has the following clients:");
        data.forEach(p -> System.out.printf("%s %s\n", p.getName(), p.getOwner()));
    }
}
