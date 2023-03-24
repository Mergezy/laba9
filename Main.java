class Animal {
    String food;
    String location;

    public void makeNoise() {
        System.out.println("This animal is asleep");
    }

    public void eat() {
        System.out.println("This animal is eating");
    }

    public void sleep() {
        System.out.println("This animal is sleeping");
    }
}

class Dog extends Animal {
    String breed;
    int age;

    @Override
    public void makeNoise() {
        System.out.println("The dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dog food");
    }
}

class Cat extends Animal {
    String furColor;
    boolean isIndoor;

    @Override
    public void makeNoise() {
        System.out.println("The cat is meowing");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating cat food");
    }
}

class Horse extends Animal {
    String color;
    String breed;

    @Override
    public void makeNoise() {
        System.out.println("The horse is neighing");
    }

    @Override
    public void eat() {
        System.out.println("The horse is eating hay");
    }
}

class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("The animal is eating " + animal.food + " and is located in " + animal.location);
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.breed = "Labrador";
        dog.age = 3;
        dog.food = "dog food";
        dog.location = "the backyard";

        Cat cat = new Cat();
        cat.furColor = "black";
        cat.isIndoor = true;
        cat.food = "cat food";
        cat.location = "the living room";

        Horse horse = new Horse();
        horse.color = "brown";
        horse.breed = "Mustang";
        horse.food = "hay";
        horse.location = "the barn";

        Veterinarian vet = new Veterinarian();
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);
    }
}
