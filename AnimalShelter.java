import java.util.LinkedList;

class AnimalShelter {
    private final LinkedList<Dog> dogs = new LinkedList<>();
    private final LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order++);
        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("No animals available for adoption.");
            return null;
        } else if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        } else {
            Dog oldestDog = dogs.peek();
            Cat oldestCat = cats.peek();
            return oldestDog.isOlderThan(oldestCat) ? dequeueDog() : dequeueCat();
        }
    }

    public Dog dequeueDog() {
        if (!dogs.isEmpty()) {
            return dogs.poll();
        }
        System.out.println("No dogs available for adoption.");
        return null;
    }

    public Cat dequeueCat() {
        if (!cats.isEmpty()) {
            return cats.poll();
        }
        System.out.println("No cats available for adoption.");
        return null;
    }

    public void printShelterState() {
        System.out.println("Dogs in shelter: " + dogs.stream().map(Dog::getName).toList());
        System.out.println("Cats in shelter: " + cats.stream().map(Cat::getName).toList());
    }
}