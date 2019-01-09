/**.
 * File: TestAnimalShelter.java
 * ----------------------------
 */
import animalshelter.*;
public class TestAnimalShelter {

    public static void main(String[] args) {
    
        AnimalQueue animals = new AnimalQueue();

        animals.enqueue(new Cat("Callie"));
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Dog("Copa"));

        System.out.print(animals.dequeueAny().name()+"\n");
        System.out.print(animals.dequeueAny().name()+"\n");
        System.out.print(animals.dequeueAny().name()+"\n");

        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        while (animals.size() != 1) {
            System.out.print(animals.dequeueAny().name()+"\n");
        }
    }
}
