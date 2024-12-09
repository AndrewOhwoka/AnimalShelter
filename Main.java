
public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Add animals to the shelter
        
        shelter.enqueue(new Dog("Dog1"));
        shelter.enqueue(new Cat("Cat1"));
        shelter.enqueue(new Dog("Dog2"));
        shelter.enqueue(new Cat("Cat2"));
       
        // Dequeue animals
        System.out.println("Dequeued Any: " + shelter.dequeueAny().getName()); // Dog1
        System.out.println("Dequeued Cat: " + shelter.dequeueCat().getName()); // Cat1
        System.out.println("Dequeued Dog: " + shelter.dequeueDog().getName()); // Dog2
        System.out.println("Dequeued Any: " + shelter.dequeueAny().getName()); // Cat2
    }
}

