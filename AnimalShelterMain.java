public class AnimalShelterMain {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Dog("Charlie"));
        shelter.enqueue(new Cat("Luna"));

        shelter.printShelterState();

        Animal adoptedAnimal = shelter.dequeueAny();
        System.out.println("Adopting any animal: " + (adoptedAnimal != null ? adoptedAnimal.getName() : "None"));

        Dog adoptedDog = shelter.dequeueDog();
        System.out.println("Adopting a dog: " + (adoptedDog != null ? adoptedDog.getName() : "None"));

        Cat adoptedCat = shelter.dequeueCat();
        System.out.println("Adopting a cat: " + (adoptedCat != null ? adoptedCat.getName() : "None"));

        shelter.printShelterState();
    }
}