package Task3;
import java.util.ArrayList;
public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public void makeAllSound(){
        for (Animal animal : animals){
            animal.makeSound();
    }
}
    public void addAnimal(Animal animalToAdd){
        animals.add(animalToAdd);
    }

    public void printNumberOfLegs(){
        int legCount = 0;
        for (Animal animal : animals){
            legCount += animal.getNumberOfLegs();
        }
        System.out.println("Total number of legs in my zoo: "+legCount);
    }
}
