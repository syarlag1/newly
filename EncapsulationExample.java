package practice;

public class EncapsulationExample {
    private String name;
    private int age;

    public EncapsulationExample(String name, int age) {
    // Constructor
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            this.age = newAge;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
    public static void main(String[] args) {
        // Create a Person object
        EncapsulationExample person = new EncapsulationExample("Alice", 30);

        // Accessing private variables using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying private variables using setter methods
        person.setName("Bob");
        person.setAge(25);

        // Displaying updated information
        System.out.println("\nUpdated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Trying to set negative age
        person.setAge(-5);
    }
}