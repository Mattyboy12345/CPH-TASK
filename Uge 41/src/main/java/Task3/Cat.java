package Task3;

public class Cat extends Animal {

    public Cat(int numberOflegs){
            super(numberOflegs);
        }
    @Override
    public void makeSound() {
        System.out.println("Cat goes meow meow");
    }
}
