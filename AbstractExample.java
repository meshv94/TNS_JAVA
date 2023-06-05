package tnsJava;

abstract class Animal {
    String name;
    int age;

    abstract void makeSound();
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("bhawww.. bhawww");
    }
}

class Cat extends Animal {
    void makeSound(){
        System.out.println("mieeawwww.. mieeaww");
    }
}

public class AbstractExample {

	public static void main(String[] args) {
		Dog seru = new Dog();
        seru.makeSound();

        Cat bili = new Cat();
        bili.makeSound();

	}

}
