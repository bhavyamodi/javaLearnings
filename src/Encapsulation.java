public class Encapsulation {
    // Create a class representing a "Person" with private attributes such as name, age, and gender.
    // Implement public methods to set and get these attributes,
    // Ensuring that access to the attributes is controlled through these methods.
    // Private attributes
    private String name;
    private int age;
    private String gender;

    public Encapsulation(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for gender
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating a Person object
        Encapsulation person1 = new Encapsulation("Old Name", 15, "Male");

        // Displaying initial details
        System.out.println("Initial details:");
        person1.displayDetails();

        // Setting new values for attributes
        person1.setName("New Name");
        person1.setAge(20);
        person1.setGender("Female");

        // Displaying updated details
        System.out.println("\nUpdated details:");
        person1.displayDetails();
    }
}
