public class Animal {
    private String name;
    private boolean DogOrNot;

    public Animal(String AnimalName, boolean Doggo) {
        this.name = AnimalName;
        this.DogOrNot = Doggo;
    }
    public Animal(String AnimalName) {
        this.name = AnimalName;
        this.DogOrNot = false;
    }
    public Animal(boolean Doggo) {
        this.DogOrNot = Doggo;
        this.name = "";
    }
    public Animal() {
        this.name = "";
        this.DogOrNot = false;
    }
    public String getName() {
        return name;
    }
    public boolean getDog() {
        return DogOrNot;
    }
    @Override
        public String toString() {
        getName();
        getDog();
        return "The animals name is " + name + " and their status as a dog is " + DogOrNot;
    }

}