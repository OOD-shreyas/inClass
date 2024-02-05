public class Main {
    public static void main(String[] args) {
        // Encapsulation example
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Polymorphism example
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound();
        animal2.makeSound();
    }
}