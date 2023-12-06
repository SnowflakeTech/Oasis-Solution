import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String birthDate;
    private String gender;
    private String wedding;
    private List<Person> children;
    private Person parent;

    public Person(String name, String birthDate, String gender, String wedding) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.wedding = wedding;
        this.children = new ArrayList<>();
    }

    public void addChild(Person child) {
        children.add(child);
        child.parent = this;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getWedding() {
        return wedding;
    }

    public List<Person> getChildren() {
        return children;
    }

    public boolean isMarried() {
        return wedding != null;
    }

    public boolean hasTwoChildren() {
        return children.size() == 2;
    }

    public boolean isLatestGeneration() {
        return children.isEmpty() && parent != null;
    }

    public String toString() {
        return "Name: " + this.name + ", Date of birth: " + this.birthDate + ", Sex: " + this.gender;
    }
}