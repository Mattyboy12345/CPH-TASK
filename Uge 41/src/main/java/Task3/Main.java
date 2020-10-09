package Task3;

public class Main {
    public static void main(String [] args){
    Zoo myZoo = new Zoo();
    myZoo.addAnimal(new Cat(4));
    myZoo.addAnimal(new Giraf(4));
    myZoo.addAnimal(new Dog(4));

    myZoo.makeAllSound();
    myZoo.printNumberOfLegs();

    }
}
