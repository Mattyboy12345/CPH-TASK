package Task3;

public class Dog extends Animal {
    public Dog(int numberOflegs){
        super(numberOflegs);
    }
    @Override
    public void makeSound() {
        System.out.println("Dog goes vuf vuf");
    }
}
