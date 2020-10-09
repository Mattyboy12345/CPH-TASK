package Task3;

public class Animal implements AnimalSound {
    private int numberOfLegs;

    public Animal(int numberOflegs) {

    }


    public void Animal(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;

    }
    public void makeSound(){
        System.out.println("Undefined animal makes no sound.");
        }

    public int getNumberOfLegs(){
        return  numberOfLegs;
        }

}
