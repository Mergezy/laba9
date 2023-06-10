class Animal {
    private String food;
    private String location;

    Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

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
    private String breed;
    private int age;

    public Dog(String food, String location, String breed, int age) {
        super(food, location);
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
        private String furColor;
        private boolean isIndoor;

        public String getFurColor() {
            return furColor;
        }

        public void setFurColor(String furColor) {
            this.furColor = furColor;
        }

        public boolean isIndoor() {
            return isIndoor;
        }

        public void setIndoor(boolean indoor) {
            isIndoor = indoor;
        }

        public Cat(String food, String location, String furColor, boolean isIndoor) {
            super(food, location);
            this.furColor = furColor;
            this.isIndoor = isIndoor;
        }

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
        private String color;
        private String breed;

        public Horse(String food, String location, String color, String breed) {
            super(food, location);
            this.color = color;
            this.breed = breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

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
            System.out.println("The animal is eating " + animal.getFood() + " and is located in " + animal.getLocation());
        }
    }

    public class Main {
        public static void main(String[] args) {

            Dog dog = new Dog("meat","house","Labrador",3);

            Cat cat = new Cat("fish","the living room","yellow",true);

            Horse horse = new Horse("hay","farm","brown","Apaluza");

            Veterinarian vet = new Veterinarian();
            vet.treatAnimal(dog);
            vet.treatAnimal(cat);
            vet.treatAnimal(horse);
        }
    }
